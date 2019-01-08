import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Month;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;


import static java.util.stream.Collectors.*;

public class Test12 {

    public static void execute() {
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Long>>> test12Count_1M = UtilsTransCaixa.testeBoxGenW(teste12Count_1M);
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Long>>> test12CountParallel_1M = UtilsTransCaixa.testeBoxGenW(teste12CountParallel_1M);
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Double>>> test12Map_1M = UtilsTransCaixa.testeBoxGenW(teste12Map_1M);
        AbstractMap.SimpleEntry<Double, ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>>> test12Concurrent_1M = UtilsTransCaixa.testeBoxGenW(teste12Concurrent_1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Long>>> test12Count_2M = UtilsTransCaixa.testeBoxGenW(teste12Count_2M);
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Long>>> test12CountParallel_2M = UtilsTransCaixa.testeBoxGenW(teste12CountParallel_2M);
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Double>>> test12Map_2M = UtilsTransCaixa.testeBoxGenW(teste12Map_2M);
        AbstractMap.SimpleEntry<Double, ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>>> test12Concurrent_2M = UtilsTransCaixa.testeBoxGenW(teste12Concurrent_2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Long>>> test12Count_4M = UtilsTransCaixa.testeBoxGenW(teste12Count_4M);
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Long>>> test12CountParallel_4M = UtilsTransCaixa.testeBoxGenW(teste12CountParallel_4M);
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Double>>> test12Map_4M = UtilsTransCaixa.testeBoxGenW(teste12Map_4M);
        AbstractMap.SimpleEntry<Double, ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>>> test12Concurrent_4M = UtilsTransCaixa.testeBoxGenW(teste12Concurrent_4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Long>>> test12Count_6M = UtilsTransCaixa.testeBoxGenW(teste12Count_6M);
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Long>>> test12CountParallel_6M = UtilsTransCaixa.testeBoxGenW(teste12CountParallel_6M);
        AbstractMap.SimpleEntry<Double, Map<String, Map<Month, Double>>> test12Map_6M = UtilsTransCaixa.testeBoxGenW(teste12Map_6M);
        AbstractMap.SimpleEntry<Double, ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>>> test12Concurrent_6M = UtilsTransCaixa.testeBoxGenW(teste12Concurrent_6M);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsTeste12.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Tipo de Estrutura; No.Casos; Tempo; Tamanho \n");
            sb.append("Map(Count)").append(";").append("1M").append(";").append(test12Count_1M.getKey().doubleValue()).append(";").append(test12Count_1M.getValue().size()).append("\n");
            sb.append("Map(Parallel Count)").append(";").append("1M").append(";").append(test12CountParallel_1M.getKey().doubleValue()).append(";").append(test12CountParallel_1M.getValue().size()).append("\n");
            sb.append("Map").append(";").append("1M").append(";").append(test12Map_1M.getKey().doubleValue()).append(";").append(test12Map_1M.getValue().size()).append("\n");
            sb.append("Concurrent Map").append(";").append("1M").append(";").append(test12Concurrent_1M.getKey().doubleValue()).append(";").append(test12Concurrent_1M.getValue().size()).append("\n");

            sb.append("Map(Count)").append(";").append("2M").append(";").append(test12Count_2M.getKey().doubleValue()).append(";").append(test12Count_2M.getValue().size()).append("\n");
            sb.append("Map(Parallel Count)").append(";").append("2M").append(";").append(test12CountParallel_2M.getKey().doubleValue()).append(";").append(test12CountParallel_2M.getValue().size()).append("\n");
            sb.append("Map").append(";").append("2M").append(";").append(test12Map_2M.getKey().doubleValue()).append(";").append(test12Map_2M.getValue().size()).append("\n");
            sb.append("Concurrent Map").append(";").append("2M").append(";").append(test12Concurrent_2M.getKey().doubleValue()).append(";").append(test12Concurrent_2M.getValue().size()).append("\n");

            sb.append("Map(Count)").append(";").append("4M").append(";").append(test12Count_4M.getKey().doubleValue()).append(";").append(test12Count_4M.getValue().size()).append("\n");
            sb.append("Map(Parallel Count)").append(";").append("4M").append(";").append(test12CountParallel_4M.getKey().doubleValue()).append(";").append(test12CountParallel_4M.getValue().size()).append("\n");
            sb.append("Map").append(";").append("4M").append(";").append(test12Map_4M.getKey().doubleValue()).append(";").append(test12Map_4M.getValue().size()).append("\n");
            sb.append("Concurrent Map").append(";").append("4M").append(";").append(test12Concurrent_4M.getKey().doubleValue()).append(";").append(test12Concurrent_4M.getValue().size()).append("\n");

            sb.append("Map(Count)").append(";").append("6M").append(";").append(test12Count_6M.getKey().doubleValue()).append(";").append(test12Count_6M.getValue().size()).append("\n");
            sb.append("Map(Parallel Count)").append(";").append("6M").append(";").append(test12CountParallel_6M.getKey().doubleValue()).append(";").append(test12CountParallel_6M.getValue().size()).append("\n");
            sb.append("Map").append(";").append("6M").append(";").append(test12Map_6M.getKey().doubleValue()).append(";").append(test12Map_6M.getValue().size()).append("\n");
            sb.append("Concurrent Map").append(";").append("6M").append(";").append(test12Concurrent_6M.getKey().doubleValue()).append(";").append(test12Concurrent_6M.getValue().size()).append("\n");

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

    public static Supplier<Map<String, Map<Month, Double>>> teste12Map_2M = () -> {

        Map<String, Map<Month, Double>> map = new HashMap<>();

        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

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

    public static Supplier<ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>>> teste12Concurrent_2M = () -> {

        ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>> map = new ConcurrentHashMap<>();

        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

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

    public static Supplier<Map<String, Map<Month, Long>>> teste12Count_2M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        Map<String, Map<Month, Long>> map =
                ltc.stream()
                        .collect(groupingBy(t -> t.getCaixa(),
                                groupingBy(t -> t.getData().getMonth(), counting())));

        return map;

    };

    public static Supplier<Map<String, Map<Month, Long>>> teste12CountParallel_2M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        Map<String, Map<Month, Long>> map =
                ltc.parallelStream()
                        .collect(groupingBy(t -> t.getCaixa(),
                                groupingBy(t -> t.getData().getMonth(), counting())));

        return map;

    };

    public static Supplier<Map<String, Map<Month, Double>>> teste12Map_4M = () -> {

        Map<String, Map<Month, Double>> map = new HashMap<>();

        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

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

    public static Supplier<ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>>> teste12Concurrent_4M = () -> {

        ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>> map = new ConcurrentHashMap<>();

        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

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

    public static Supplier<Map<String, Map<Month, Long>>> teste12Count_4M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        Map<String, Map<Month, Long>> map =
                ltc.stream()
                        .collect(groupingBy(t -> t.getCaixa(),
                                groupingBy(t -> t.getData().getMonth(), counting())));

        return map;

    };

    public static Supplier<Map<String, Map<Month, Long>>> teste12CountParallel_4M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        Map<String, Map<Month, Long>> map =
                ltc.parallelStream()
                        .collect(groupingBy(t -> t.getCaixa(),
                                groupingBy(t -> t.getData().getMonth(), counting())));

        return map;

    };

    public static Supplier<Map<String, Map<Month, Double>>> teste12Map_6M = () -> {

        Map<String, Map<Month, Double>> map = new HashMap<>();

        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

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

    public static Supplier<ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>>> teste12Concurrent_6M = () -> {

        ConcurrentHashMap<String, ConcurrentHashMap<Month, Double>> map = new ConcurrentHashMap<>();

        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

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

    public static Supplier<Map<String, Map<Month, Long>>> teste12Count_6M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        Map<String, Map<Month, Long>> map =
                ltc.stream()
                        .collect(groupingBy(t -> t.getCaixa(),
                                groupingBy(t -> t.getData().getMonth(), counting())));

        return map;

    };

    public static Supplier<Map<String, Map<Month, Long>>> teste12CountParallel_6M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        Map<String, Map<Month, Long>> map =
                ltc.parallelStream()
                        .collect(groupingBy(t -> t.getCaixa(),
                                groupingBy(t -> t.getData().getMonth(), counting())));

        return map;

    };
}

