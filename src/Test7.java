import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Test7 {

    public static void execute() {
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_1M = UtilsTransCaixa.testeBoxGenW(teste07SetStream_1M);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_1M = UtilsTransCaixa.testeBoxGenW(teste07SetParallel_1M);
        AbstractMap.SimpleEntry<Double,Double> test07fe_1M = UtilsTransCaixa.testeBoxGenW(teste07SetFE_1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_2M = UtilsTransCaixa.testeBoxGenW(teste07SetStream_2M);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_2M = UtilsTransCaixa.testeBoxGenW(teste07SetParallel_2M);
        AbstractMap.SimpleEntry<Double,Double> test07fe_2M = UtilsTransCaixa.testeBoxGenW(teste07SetFE_2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_4M = UtilsTransCaixa.testeBoxGenW(teste07SetStream_4M);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_4M = UtilsTransCaixa.testeBoxGenW(teste07SetParallel_4M);
        AbstractMap.SimpleEntry<Double,Double> test07fe_4M = UtilsTransCaixa.testeBoxGenW(teste07SetFE_4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_6M = UtilsTransCaixa.testeBoxGenW(teste07SetStream_6M);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_6M = UtilsTransCaixa.testeBoxGenW(teste07SetParallel_6M);
        AbstractMap.SimpleEntry<Double,Double> test07fe_6M = UtilsTransCaixa.testeBoxGenW(teste07SetFE_6M);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsTest7.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Versao Java; No.Casos; Tempo; Tamanho/Resultado \n");
            sb.append("7").append(";").append("1M").append(";").append(test07stream_1M.getKey().doubleValue()).append(";").append(test07fe_1M.getValue().doubleValue()).append("\n");
            sb.append("8").append(";").append("1M").append(";").append(test07stream_1M.getKey().doubleValue()).append(";").append(test07stream_1M.getValue().doubleValue()).append("\n");
            sb.append("9").append(";").append("1M").append(";").append(test07stream_1M.getKey().doubleValue()).append(";").append(test07parallel_1M.getValue().doubleValue()).append("\n");

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

    private static Double get() {
        double ret = 0;
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Spliterator<TransCaixa> splitTxCaixa1 = ltc.spliterator();

        Spliterator<TransCaixa> splitTxCaixa2 = splitTxCaixa1.trySplit();
        if (splitTxCaixa1 != null) splitTxCaixa2 = splitTxCaixa1.trySplit();

        Spliterator<TransCaixa> splitTxCaixa3 = null;
        if (splitTxCaixa2 != null) splitTxCaixa3 = splitTxCaixa2.trySplit();

        Spliterator<TransCaixa> splitTxCaixa4 = null;
        if (splitTxCaixa3 != null) splitTxCaixa4 = splitTxCaixa3.trySplit();

        int conta = 0;


        return ret;
    }
}
