import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public class Test7 {

    public static void execute() {
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_1M = UtilsTransCaixa.testeBoxGenW(teste07SetStream_1M);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_1M = UtilsTransCaixa.testeBoxGenW(teste07SetParallel_1M);
        AbstractMap.SimpleEntry<Double,Double> test07fe_1M = UtilsTransCaixa.testeBoxGenW(teste07SetFE_1M);
        AbstractMap.SimpleEntry<Double,Double> test07Spliterator_1M = UtilsTransCaixa.testeBoxGenW(teste07Spliterator_1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_2M = UtilsTransCaixa.testeBoxGenW(teste07SetStream_2M);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_2M = UtilsTransCaixa.testeBoxGenW(teste07SetParallel_2M);
        AbstractMap.SimpleEntry<Double,Double> test07fe_2M = UtilsTransCaixa.testeBoxGenW(teste07SetFE_2M);
        AbstractMap.SimpleEntry<Double,Double> test07Spliterator_2M = UtilsTransCaixa.testeBoxGenW(teste07Spliterator_2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_4M = UtilsTransCaixa.testeBoxGenW(teste07SetStream_4M);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_4M = UtilsTransCaixa.testeBoxGenW(teste07SetParallel_4M);
        AbstractMap.SimpleEntry<Double,Double> test07fe_4M = UtilsTransCaixa.testeBoxGenW(teste07SetFE_4M);
        AbstractMap.SimpleEntry<Double,Double> test07Spliterator_4M = UtilsTransCaixa.testeBoxGenW(teste07Spliterator_4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_6M = UtilsTransCaixa.testeBoxGenW(teste07SetStream_6M);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_6M = UtilsTransCaixa.testeBoxGenW(teste07SetParallel_6M);
        AbstractMap.SimpleEntry<Double,Double> test07fe_6M = UtilsTransCaixa.testeBoxGenW(teste07SetFE_6M);
        AbstractMap.SimpleEntry<Double,Double> test07Spliterator_6M = UtilsTransCaixa.testeBoxGenW(teste07Spliterator_6M);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsTeste7.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Versao Java; Tamanho Data Set; No.Casos; Tempo; Tamanho/Resultado \n");
            sb.append("7").append(";").append("Total").append(";").append("1M").append(";").append(test07fe_1M.getKey().doubleValue()).append(";").append(test07fe_1M.getValue().doubleValue()).append("\n");
            sb.append("8").append(";").append("Total").append(";").append("1M").append(";").append(test07stream_1M.getKey().doubleValue()).append(";").append(test07stream_1M.getValue().doubleValue()).append("\n");
            sb.append("9").append(";").append("Total").append(";").append("1M").append(";").append(test07parallel_1M.getKey().doubleValue()).append(";").append(test07parallel_1M.getValue().doubleValue()).append("\n");
            sb.append("7").append(";").append("C/Spliterator").append(";").append("1M").append(";").append(test07Spliterator_1M.getKey().doubleValue()).append(";").append(test07Spliterator_1M.getValue().doubleValue()).append("\n");

            sb.append("7").append(";").append("Total").append(";").append("2M").append(";").append(test07fe_2M.getKey().doubleValue()).append(";").append(test07fe_2M.getValue().doubleValue()).append("\n");
            sb.append("8").append(";").append("Total").append(";").append("2M").append(";").append(test07stream_2M.getKey().doubleValue()).append(";").append(test07stream_2M.getValue().doubleValue()).append("\n");
            sb.append("9").append(";").append("Total").append(";").append("2M").append(";").append(test07parallel_2M.getKey().doubleValue()).append(";").append(test07parallel_2M.getValue().doubleValue()).append("\n");
            sb.append("7").append(";").append("C/Spliterator").append(";").append("2M").append(";").append(test07Spliterator_2M.getKey().doubleValue()).append(";").append(test07Spliterator_2M.getValue().doubleValue()).append("\n");

            sb.append("7").append(";").append("Total").append(";").append("4M").append(";").append(test07fe_4M.getKey().doubleValue()).append(";").append(test07fe_4M.getValue().doubleValue()).append("\n");
            sb.append("8").append(";").append("Total").append(";").append("4M").append(";").append(test07stream_4M.getKey().doubleValue()).append(";").append(test07stream_4M.getValue().doubleValue()).append("\n");
            sb.append("9").append(";").append("Total").append(";").append("4M").append(";").append(test07parallel_4M.getKey().doubleValue()).append(";").append(test07parallel_4M.getValue().doubleValue()).append("\n");
            sb.append("7").append(";").append("C/Spliterator").append(";").append("4M").append(";").append(test07Spliterator_4M.getKey().doubleValue()).append(";").append(test07Spliterator_4M.getValue().doubleValue()).append("\n");

            sb.append("7").append(";").append("Total").append(";").append("6M").append(";").append(test07fe_6M.getKey().doubleValue()).append(";").append(test07fe_6M.getValue().doubleValue()).append("\n");
            sb.append("8").append(";").append("Total").append(";").append("6M").append(";").append(test07stream_6M.getKey().doubleValue()).append(";").append(test07stream_6M.getValue().doubleValue()).append("\n");
            sb.append("9").append(";").append("Total").append(";").append("6M").append(";").append(test07parallel_6M.getKey().doubleValue()).append(";").append(test07parallel_6M.getValue().doubleValue()).append("\n");
            sb.append("7").append(";").append("C/Spliterator").append(";").append("6M").append(";").append(test07Spliterator_6M.getKey().doubleValue()).append(";").append(test07Spliterator_6M.getValue().doubleValue()).append("\n");

            outFile.write(sb.toString());
            outFile.close();
        }
        catch(IOException e){
            System.out.println("ERRO!");
        }
    }

    public static Supplier<Double> teste07SetStream_1M = () -> {

        double ret = 0.0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        ret = ltc.stream()
                .mapToDouble(t -> t.getValor())
                .sum();

        return ret;
    };

    public static Supplier<Double> teste07SetParallel_1M = () -> {

        double ret = 0.0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        ret = ltc.parallelStream()
                .mapToDouble(t -> t.getValor())
                .sum();

        return ret;
    };

    public static Supplier<Double> teste07SetFE_1M = () -> {

        double ret = 0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        for(TransCaixa t : ltc)
        {
            ret += t.getValor();
        }

        return ret;
    };

    public static Supplier<Double> teste07Spliterator_1M = () -> {
        AtomicReference<Double> ret = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret3 = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret2 = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret1 = new AtomicReference<>((double) 0);
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Spliterator<TransCaixa> splitTxCaixa = ltc.spliterator();

        Spliterator<TransCaixa> splitTxCaixa1 = splitTxCaixa.trySplit();

        Spliterator<TransCaixa> splitTxCaixa2 = null;
        if (splitTxCaixa1 != null) splitTxCaixa2 = splitTxCaixa1.trySplit();

        Spliterator<TransCaixa> splitTxCaixa3 = splitTxCaixa.trySplit();


        splitTxCaixa.forEachRemaining(v -> ret.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa1.forEachRemaining(v -> ret1.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa2.forEachRemaining(v -> ret2.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa3.forEachRemaining(v -> ret3.updateAndGet(v1 -> (double) (v1 + v.getValor())));

        return ret.get() + ret1.get() + ret2.get() + ret3.get();
    };


    public static Supplier<Double> teste07SetStream_2M = () -> {

        double ret = 0.0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

        ret = ltc.stream()
                .mapToDouble(t -> t.getValor())
                .sum();

        return ret;
    };

    public static Supplier<Double> teste07SetParallel_2M = () -> {

        double ret = 0.0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

        ret = ltc.parallelStream()
                .mapToDouble(t -> t.getValor())
                .sum();

        return ret;
    };

    public static Supplier<Double> teste07SetFE_2M = () -> {

        double ret = 0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

        for(TransCaixa t : ltc)
        {
            ret += t.getValor();
        }

        return ret;
    };

    public static Supplier<Double> teste07Spliterator_2M = () -> {
        AtomicReference<Double> ret = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret3 = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret2 = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret1 = new AtomicReference<>((double) 0);
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        Spliterator<TransCaixa> splitTxCaixa = ltc.spliterator();

        Spliterator<TransCaixa> splitTxCaixa1 = splitTxCaixa.trySplit();

        Spliterator<TransCaixa> splitTxCaixa2 = null;
        if (splitTxCaixa1 != null) splitTxCaixa2 = splitTxCaixa1.trySplit();

        Spliterator<TransCaixa> splitTxCaixa3 = splitTxCaixa.trySplit();


        splitTxCaixa.forEachRemaining(v -> ret.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa1.forEachRemaining(v -> ret1.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa2.forEachRemaining(v -> ret2.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa3.forEachRemaining(v -> ret3.updateAndGet(v1 -> (double) (v1 + v.getValor())));

        return ret.get() + ret1.get() + ret2.get() + ret3.get();
    };


    public static Supplier<Double> teste07SetStream_4M = () -> {

        double ret = 0.0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

        ret = ltc.stream()
                .mapToDouble(t -> t.getValor())
                .sum();

        return ret;
    };

    public static Supplier<Double> teste07SetParallel_4M = () -> {

        double ret = 0.0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

        ret = ltc.parallelStream()
                .mapToDouble(t -> t.getValor())
                .sum();

        return ret;
    };

    public static Supplier<Double> teste07SetFE_4M = () -> {

        double ret = 0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

        for(TransCaixa t : ltc)
        {
            ret += t.getValor();
        }

        return ret;
    };

    public static Supplier<Double> teste07Spliterator_4M = () -> {
        AtomicReference<Double> ret = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret3 = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret2 = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret1 = new AtomicReference<>((double) 0);
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        Spliterator<TransCaixa> splitTxCaixa = ltc.spliterator();

        Spliterator<TransCaixa> splitTxCaixa1 = splitTxCaixa.trySplit();

        Spliterator<TransCaixa> splitTxCaixa2 = null;
        if (splitTxCaixa1 != null) splitTxCaixa2 = splitTxCaixa1.trySplit();

        Spliterator<TransCaixa> splitTxCaixa3 = splitTxCaixa.trySplit();


        splitTxCaixa.forEachRemaining(v -> ret.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa1.forEachRemaining(v -> ret1.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa2.forEachRemaining(v -> ret2.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa3.forEachRemaining(v -> ret3.updateAndGet(v1 -> (double) (v1 + v.getValor())));

        return ret.get() + ret1.get() + ret2.get() + ret3.get();
    };


    public static Supplier<Double> teste07SetStream_6M = () -> {

        double ret = 0.0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

        ret = ltc.stream()
                .mapToDouble(t -> t.getValor())
                .sum();

        return ret;
    };

    public static Supplier<Double> teste07SetParallel_6M = () -> {

        double ret = 0.0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

        ret = ltc.parallelStream()
                .mapToDouble(t -> t.getValor())
                .sum();

        return ret;
    };

    public static Supplier<Double> teste07SetFE_6M = () -> {

        double ret = 0;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

        for(TransCaixa t : ltc)
        {
            ret += t.getValor();
        }

        return ret;
    };

    public static Supplier<Double> teste07Spliterator_6M = () -> {
        AtomicReference<Double> ret = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret3 = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret2 = new AtomicReference<>((double) 0);
        AtomicReference<Double> ret1 = new AtomicReference<>((double) 0);
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        Spliterator<TransCaixa> splitTxCaixa = ltc.spliterator();

        Spliterator<TransCaixa> splitTxCaixa1 = splitTxCaixa.trySplit();

        Spliterator<TransCaixa> splitTxCaixa2 = null;
        if (splitTxCaixa1 != null) splitTxCaixa2 = splitTxCaixa1.trySplit();

        Spliterator<TransCaixa> splitTxCaixa3 = splitTxCaixa.trySplit();


        splitTxCaixa.forEachRemaining(v -> ret.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa1.forEachRemaining(v -> ret1.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa2.forEachRemaining(v -> ret2.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        splitTxCaixa3.forEachRemaining(v -> ret3.updateAndGet(v1 -> (double) (v1 + v.getValor())));
        return ret.get() + ret1.get() + ret2.get() + ret3.get();
    };
}
