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