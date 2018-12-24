import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Tests {

    public static Supplier<Double> teste1Array = () -> {
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

    Supplier<Double> teste1DoubleStream = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).sum();

        return d;
    };

    Supplier<Double> teste1Stream = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        double sum = ltc.stream().collect(Collectors.summingDouble(t -> t.getValor()));

        return sum;
    };
}
