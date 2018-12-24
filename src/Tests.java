import java.time.Month;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

public class Tests {

    public static Supplier<Double> sumArray = () -> {
            double[] d = new double[1000000];
            int i = 0;
            double sum = 0;

            List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");
            for(TransCaixa t : ltc){
                d[i] = t.getValor();
                i++;
            }

            for(i = 0; i < 1000000; i++){
                sum += d[i];
            }

            return sum;
    };


    Supplier<Double> avgArray = () -> {
        double[] d = new double[1000000];
        int i = 0;
        double avg = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");
        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(i = 0; i < 1000000; i++){
            avg += d[i];
        }

        avg = avg / 1000000;

        return avg;
    };

    public static Supplier<Double> sumDoubleStream = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).sum();

        return d;
    };

    public static Supplier<Double> avgDoubleStream = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).average().getAsDouble();

        return d;
    };

    public static Supplier<Double> sumStream = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        double sum = ltc.stream().collect(Collectors.summingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> avgStream = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        double sum = ltc.stream().collect(Collectors.averagingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<List<TransCaixa>> teste5List = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        List<TransCaixa> ret;

        ret = ltc.stream()
                .sorted(TransCaixaComparator.transPorData)
                .collect(toList());

        return ret;
    };

    public static Supplier<SortedSet<TransCaixa>> teste5Tree = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        Supplier<SortedSet<TransCaixa>> supplyTreeSetTcx = () -> new TreeSet<>(TransCaixaComparator.transPorData);

        SortedSet<TransCaixa> transOrdData = ltc.stream()
                .collect(toCollection(supplyTreeSetTcx));

        return transOrdData;
    };

    public static Supplier<Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> teste6Original = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        Map<Month, Map<Integer, Map<Integer, List<TransCaixa>>>> mapaTxPorMDH =
                ltc.stream()
                        .collect(groupingBy(t -> t.getData().getMonth(),
                                groupingBy(t -> t.getData().getDayOfMonth(),
                                        groupingBy(t -> t.getData().getHour()))));

        return mapaTxPorMDH;
    };

    public static Supplier<Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> teste6Java7 = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        Map<Month, Map<Integer, Map<Integer, List<TransCaixa>>>> mapaTxPorMDH = new HashMap<>();

        for(TransCaixa t : ltc)
        {
            if(mapaTxPorMDH.containsKey(t.getData().getMonth()))
            {
                if(mapaTxPorMDH.get(t.getData().getMonth()).containsKey(t.getData().getDayOfMonth()))
                {
                    if(mapaTxPorMDH.get(t.getData().getDayOfMonth()).containsKey(t.getData().getHour()))
                    {
                        mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).get(t.getData().getHour()).add(t.clone());
                    }
                    else
                    {
                        List<TransCaixa> lista = new ArrayList<>();
                        lista.add(t.clone());
                        mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).put(t.getData().getHour(), lista);
                    }
                }
                else
                {
                    List<TransCaixa> listaA = new ArrayList<>();
                    listaA.add(t.clone());
                    Map<Integer, List<TransCaixa>> map = new HashMap<>();
                    map.put(t.getData().getHour(),listaA);
                    mapaTxPorMDH.get(t.getData().getMonth()).put(t.getData().getDayOfMonth(), map);
                }
            }
            else
            {
                List<TransCaixa> listaB = new ArrayList<>();
                listaB.add(t.clone());
                Map<Integer, List<TransCaixa>> map = new HashMap<>();
                map.put(t.getData().getHour(),listaB);
                mapaTxPorMDH.get(t.getData().getMonth()).put(t.getData().getDayOfMonth(), map);
                Map<Month, Map<Integer, List<TransCaixa>>> mapM = new HashMap<>();
                mapM.put(t.getData().getMonth(), map);
            }
        }

        return mapaTxPorMDH;
    };
}
