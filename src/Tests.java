import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.function.BinaryOperator;
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
                    if(mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).containsKey(t.getData().getHour()))
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

                Map<Integer, Map<Integer, List<TransCaixa>>> mapAux = new HashMap<>();
                mapAux.put(t.getData().getDayOfMonth(), map);

                mapaTxPorMDH.put(t.getData().getMonth(),mapAux);
            }
        }

        return mapaTxPorMDH;
    };

    public static Supplier<Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> teste6Semana = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        Map<DayOfWeek, Map<Integer, List<TransCaixa>>> mapaTxPorDH =
                ltc.stream()
                        .collect(groupingBy(t -> t.getData().getDayOfWeek(),
                                        groupingBy(t -> t.getData().getHour())));

        return mapaTxPorDH;
    };

    public static Supplier<Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> teste6SemanaFor = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        Map<DayOfWeek, Map<Integer, List<TransCaixa>>> mapaTxPorDH = new HashMap<>();

        for(TransCaixa t : ltc)
        {
            if(mapaTxPorDH.containsKey(t.getData().getDayOfWeek()))
            {
                if(mapaTxPorDH.get(t.getData().getDayOfWeek()).containsKey(t.getData().getHour()))
                {
                    mapaTxPorDH.get(t.getData().getDayOfWeek()).get(t.getData().getHour()).add(t.clone());
                }
                else
                {
                    List<TransCaixa> lista = new ArrayList<>();
                    lista.add(t.clone());
                    mapaTxPorDH.get(t.getData().getDayOfWeek()).put(t.getData().getHour(), lista);
                }
            }
            else
            {
                List<TransCaixa> listaA = new ArrayList<>();
                listaA.add(t.clone()); // lista

                Map<Integer, List<TransCaixa>> map = new HashMap<>(); // Hora, Lista
                map.put(t.getData().getHour(), listaA);

                mapaTxPorDH.put(t.getData().getDayOfWeek(), map);
            }
        }

        return mapaTxPorDH;
    };

    public static Supplier<Double> teste07SetStream = () -> {

        double ret = 0.0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        ret = ltc.stream()
                .mapToDouble(t -> t.getValor())
                .sum();

        return ret;
    };

    public static Supplier<Double> teste07SetParallel = () -> {

        double ret = 0.0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        ret = ltc.parallelStream()
                .mapToDouble(t -> t.getValor())
                .sum();

        return ret;
    };

    public static Supplier<Double> teste07SetFE = () -> {

        double ret = 0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        for(TransCaixa t : ltc)
        {
            ret += t.getValor();
        }

        return ret;
    };
    // falta usar o spliterator

    public static Supplier<String> teste08 = () -> {
        String cod = null;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        double valor = 0.0;

        for(TransCaixa t : ltc)
        {
            if(t.getData().getHour() >= 16 && t.getData().getHour() <= 22)
            {
                if(t.getValor() > valor)
                {
                    valor = t.getValor();
                    cod = t.getTrans();
                }
            }
        }

        return cod;
    };

    public static Supplier<String> teste08Stream = () -> {
        String cod;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        cod = ltc.stream().filter(t -> t.getData().getHour() >= 16 && t.getData().getHour() <= 22)
                          .max(TransCaixaComparator.transPorValor)
                          .get()
                          .getTrans();

        return cod;
    };

}
