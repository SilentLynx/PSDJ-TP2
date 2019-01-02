import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

public class Tests {

    public static Supplier<Double> sumArray = () -> {
            int i = 0;
            double sum = 0;

            List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");
            double[] d = new double[ltc.size()];

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

    Supplier<AbstractMap.SimpleEntry> teste2List = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        ltc.sort(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = ltc.subList(0, (int) (0.3 * ltc.size()));

        List<TransCaixa> end = ltc.subList((int) (0.7 * ltc.size()), ltc.size());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    Supplier<AbstractMap.SimpleEntry> teste2TreeSet = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        TreeSet<TransCaixa> tsec = new TreeSet<>(TransCaixaComparator.transPorData);
        tsec.addAll(ltc);

        List<TransCaixa> sorted = new ArrayList<>(tsec);

        List<TransCaixa> seq = sorted.subList(0, (int) (0.3 * ltc.size()));

        List<TransCaixa> end = sorted.subList((int) (0.7 * ltc.size()), ltc.size());

        return new AbstractMap.SimpleEntry(seq, end);
    };

    Supplier<AbstractMap.SimpleEntry> teste2SeqStream = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Stream<TransCaixa> sorted = ltc.stream().sorted(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = sorted.limit((long) (0.3 * ltc.size())).collect(toList());

        List<TransCaixa> end = sorted.skip((long) (0.7 * ltc.size())).collect(toList());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    Supplier<AbstractMap.SimpleEntry> teste2ParStream = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Stream<TransCaixa> sorted = ltc.parallelStream().sorted(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = sorted.limit((long) (0.3 * ltc.size())).collect(toList());

        List<TransCaixa> end = sorted.skip((long) (0.7 * ltc.size())).collect(toList());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    Supplier<int[]> teste3Array = () -> {
        int size = 1000000;
        int[] d = new int[size];
        Random r = new Random();


        for(int i = 0; i < size; i++){
            do
                d[i] = r.nextInt(10000);
            while(d[i] == 0);
        }

        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(d[j] == d[i]){
                    for(int k = j; k < size - 1; k++)
                        d[k] = d[k + 1];
                    size--;
                }
            }
        }

        int[] ret = new int[size];
        System.arraycopy(d, 0, ret, 0, size);

        return ret;
    };

    Supplier<List> teste3List = () -> {
        List<Integer> l = new ArrayList<>(1000000);
        Random r = new Random();
        int j;

        for(int i = 0; i < 1000000; i++) {
            do
                j = r.nextInt(10000);
            while (j == 0);
            l.add(j);
        }

        l = new ArrayList<>(new TreeSet<>(l));

        return l;
    };

    Supplier<IntStream> teste3IntStream = () -> {
        IntStream s = new Random().ints(1000000, 1, 10000);

        s.distinct();

        return s;
    };

    public static double mult(double i, double j){
        return i * j;
    }

    public static BiFunction<Double, Double,Double> bi = (i, j) -> {
        return i * j;
    };

    public static Teste4Lambda lambda = (i, j) -> i * j;

    public static Supplier<double[]> teste4MethodStreams = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.stream().mapToDouble(tc -> mult(tc.getValor(), tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4BiFStreams = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.stream().mapToDouble(tc -> bi.apply(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4LambdaStreams = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> lambda.mult(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4MethodParStreams = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> mult(tc.getValor(), tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4BiFParStreams = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> bi.apply(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4LambdaParStreams = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> lambda.mult(tc.getValor(),tc.getValor())).toArray();

        return d;
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

interface Teste4Lambda {
    double mult(double i, double j);
}