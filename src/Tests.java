import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

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
}
