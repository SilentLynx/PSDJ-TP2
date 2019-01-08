import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Month;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class Test12 {

    public static void execute() {
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Long>>> test12Count_1M = UtilsTransCaixa.testeBoxGenW(teste12Count_1M);
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Long>>> test12CountParallel_1M = UtilsTransCaixa.testeBoxGenW(teste12CountParallel_1M);
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Double>>> test12Map_1M = UtilsTransCaixa.testeBoxGenW(teste12Map_1M);
        AbstractMap.SimpleEntry<Double, ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>>> test12Concurrent_1M = UtilsTransCaixa.testeBoxGenW(teste12Concurrent_1M);



        try {
            PrintWriter outFile = new PrintWriter(new File("resultsTest12.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Tipo de Estrutura; No.Casos; Tempo; Tamanho \n");
            sb.append("Map(Count)").append(";").append("1M").append(";").append(test12Count_1M.getKey().doubleValue()).append(";").append(test12Count_1M.getValue().size()).append("\n");
            sb.append("Map(Parallel Count)").append(";").append("1M").append(";").append(test12CountParallel_1M.getKey().doubleValue()).append(";").append(test12CountParallel_1M.getValue().size()).append("\n");
            sb.append("Map").append(";").append("1M").append(";").append(test12Map_1M.getKey().doubleValue()).append(";").append(test12Map_1M.getValue().size()).append("\n");
            sb.append("Concurrent Map").append(";").append("1M").append(";").append(test12Concurrent_1M.getKey().doubleValue()).append(";").append(test12Concurrent_1M.getValue().size()).append("\n");

            outFile.write(sb.toString());
            outFile.close();
        } catch (IOException e) {
            System.out.println("ERRO!");
        }
    }

    public static Supplier<Map<String, Map<Month, Double>>> teste12Map_1M = () -> {

        Map<String, Map<Month, Double>> map = new HashMap<>();

        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        ltc.stream()
                .forEach(t -> {

                    Map<Month, Double> auxMap = new HashMap<>();

                    Boolean keyExistente = map.containsKey(t.getCaixa());
                    if(keyExistente) auxMap = map.get(t.getCaixa());

                    Double valorExistente = auxMap.get(t.getData().getMonth());
                    if(valorExistente == null) valorExistente = 0.0;

                    auxMap.put(t.getData().getMonth(), valorExistente + t.getValor());

                    map.put(t.getCaixa(), auxMap);

                });

        return map;
    };

    public static Supplier<ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>>> teste12Concurrent_1M = () -> {

        ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>> map = new ConcurrentHashMap<>();

        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        ltc.stream()
                .forEach(t -> {

                    ConcurrentHashMap<Month, Double> auxMap = new ConcurrentHashMap<>();

                    Boolean keyExistente = map.containsKey(t.getCaixa());
                    if(keyExistente) auxMap = map.get(t.getCaixa());

                    Double valorExistente = auxMap.get(t.getData().getMonth());
                    if(valorExistente == null) valorExistente = 0.0;

                    auxMap.put(t.getData().getMonth(), valorExistente + t.getValor());

                    map.put(t.getCaixa(), auxMap);

                });

        return map;

    };

    public static Supplier<Map<String, Map<Month, Long>>> teste12Count_1M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Map<String, Map<Month, Long>> map =
                ltc.stream()
                        .collect(groupingBy(t -> t.getCaixa(),
                                groupingBy(t -> t.getData().getMonth(), counting())));

        return map;

    };

    public static Supplier<Map<String, Map<Month, Long>>> teste12CountParallel_1M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Map<String, Map<Month, Long>> map =
                ltc.parallelStream()
                        .collect(groupingBy(t -> t.getCaixa(),
                                groupingBy(t -> t.getData().getMonth(), counting())));

        return map;

    };
}

