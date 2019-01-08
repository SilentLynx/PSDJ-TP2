import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Month;
import java.util.*;
import java.util.function.Supplier;


public class Test10 {
    public static void execute() {
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, Map<Month, Double>> test10_1M = UtilsTransCaixa.testeBoxGenW(teste10_1M);
        AbstractMap.SimpleEntry<Double, Map<Month, Double>> test10S_1M = UtilsTransCaixa.testeBoxGenW(teste10Stream_1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double, Map<Month, Double>> test10_2M = UtilsTransCaixa.testeBoxGenW(teste10_2M);
        AbstractMap.SimpleEntry<Double, Map<Month, Double>> test10S_2M = UtilsTransCaixa.testeBoxGenW(teste10Stream_2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double, Map<Month, Double>> test10_4M = UtilsTransCaixa.testeBoxGenW(teste10_4M);
        AbstractMap.SimpleEntry<Double, Map<Month, Double>> test10S_4M = UtilsTransCaixa.testeBoxGenW(teste10Stream_4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double, Map<Month, Double>> test10_6M = UtilsTransCaixa.testeBoxGenW(teste10_6M);
        AbstractMap.SimpleEntry<Double, Map<Month, Double>> test10S_6M = UtilsTransCaixa.testeBoxGenW(teste10Stream_6M);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsTest10.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Tipo de Estrutura; No.Casos; Tempo; Tamanho \n");
            sb.append("Map").append(";").append("1M").append(";").append(test10_1M.getKey().doubleValue()).append(";").append(test10_1M.getValue().size()).append("\n");
            sb.append("Map Stream").append(";").append("1M").append(";").append(test10S_1M.getKey().doubleValue()).append(";").append(test10S_1M.getValue().size()).append("\n");

            sb.append("Map").append(";").append("2M").append(";").append(test10_2M.getKey().doubleValue()).append(";").append(test10_2M.getValue().size()).append("\n");
            sb.append("Map Stream").append(";").append("2M").append(";").append(test10S_2M.getKey().doubleValue()).append(";").append(test10S_2M.getValue().size()).append("\n");

            sb.append("Map").append(";").append("4M").append(";").append(test10_4M.getKey().doubleValue()).append(";").append(test10_4M.getValue().size()).append("\n");
            sb.append("Map Stream").append(";").append("4M").append(";").append(test10S_4M.getKey().doubleValue()).append(";").append(test10S_4M.getValue().size()).append("\n");

            sb.append("Map").append(";").append("6M").append(";").append(test10_6M.getKey().doubleValue()).append(";").append(test10_6M.getValue().size()).append("\n");
            sb.append("Map Stream").append(";").append("6M").append(";").append(test10S_6M.getKey().doubleValue()).append(";").append(test10S_6M.getValue().size()).append("\n");

            outFile.write(sb.toString());
            outFile.close();
        } catch (IOException e) {
            System.out.println("ERRO!");
        }
    }

    public static Supplier<Map<Month, Double>> teste10_1M = () -> {

        Map<Month, Double> map = new HashMap<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        for (TransCaixa tc : ltc) {
            Month key = tc.getData().getMonth();
            if (map.containsKey(key)) {
                double iva = map.get(key);
                if (tc.getValor() < 20) iva += 0.12 * tc.getValor();
                if (tc.getValor() >= 20 && tc.getValor() < 29) iva += 0.20 * tc.getValor();
                if (tc.getValor() >= 29) iva += 0.23 * tc.getValor();

                map.put(key, iva);

            } else {
                double iva = 0;
                if (tc.getValor() < 20) iva += 0.12 * tc.getValor();
                if (tc.getValor() >= 20 && tc.getValor() < 29) iva += 0.20 * tc.getValor();
                if (tc.getValor() >= 29) iva += 0.23 * tc.getValor();
                map.put(key, iva);
            }
        }

        return map;
    };

    public static Supplier<Map<Month, Double>> teste10Stream_1M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Map<Month, Double> map = new HashMap<>();

        ltc.stream()
                .forEach(t -> {
                    Double valorExistente = map.get(t.getData().getMonth());
                    if (valorExistente == null) valorExistente = 0.0;

                    if (t.getValor() < 20) map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.12));
                    if (t.getValor() >= 20 && t.getValor() < 29)
                        map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.20));
                    if (t.getValor() >= 29) map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.23));
                });

        return map;
    };

    public static Supplier<Map<Month, Double>> teste10_2M = () -> {

        Map<Month, Double> map = new HashMap<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        for (TransCaixa tc : ltc) {
            Month key = tc.getData().getMonth();
            if (map.containsKey(key)) {
                double iva = map.get(key);
                if (tc.getValor() < 20) iva += 0.12 * tc.getValor();
                if (tc.getValor() >= 20 && tc.getValor() < 29) iva += 0.20 * tc.getValor();
                if (tc.getValor() >= 29) iva += 0.23 * tc.getValor();

                map.put(key, iva);

            } else {
                double iva = 0;
                if (tc.getValor() < 20) iva += 0.12 * tc.getValor();
                if (tc.getValor() >= 20 && tc.getValor() < 29) iva += 0.20 * tc.getValor();
                if (tc.getValor() >= 29) iva += 0.23 * tc.getValor();
                map.put(key, iva);
            }
        }

        return map;
    };

    public static Supplier<Map<Month, Double>> teste10Stream_2M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        Map<Month, Double> map = new HashMap<>();

        ltc.stream()
                .forEach(t -> {
                    Double valorExistente = map.get(t.getData().getMonth());
                    if (valorExistente == null) valorExistente = 0.0;

                    if (t.getValor() < 20) map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.12));
                    if (t.getValor() >= 20 && t.getValor() < 29)
                        map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.20));
                    if (t.getValor() >= 29) map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.23));
                });

        return map;
    };

    public static Supplier<Map<Month, Double>> teste10_4M = () -> {

        Map<Month, Double> map = new HashMap<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        for (TransCaixa tc : ltc) {
            Month key = tc.getData().getMonth();
            if (map.containsKey(key)) {
                double iva = map.get(key);
                if (tc.getValor() < 20) iva += 0.12 * tc.getValor();
                if (tc.getValor() >= 20 && tc.getValor() < 29) iva += 0.20 * tc.getValor();
                if (tc.getValor() >= 29) iva += 0.23 * tc.getValor();

                map.put(key, iva);

            } else {
                double iva = 0;
                if (tc.getValor() < 20) iva += 0.12 * tc.getValor();
                if (tc.getValor() >= 20 && tc.getValor() < 29) iva += 0.20 * tc.getValor();
                if (tc.getValor() >= 29) iva += 0.23 * tc.getValor();
                map.put(key, iva);
            }
        }

        return map;
    };

    public static Supplier<Map<Month, Double>> teste10Stream_4M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        Map<Month, Double> map = new HashMap<>();

        ltc.stream()
                .forEach(t -> {
                    Double valorExistente = map.get(t.getData().getMonth());
                    if (valorExistente == null) valorExistente = 0.0;

                    if (t.getValor() < 20) map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.12));
                    if (t.getValor() >= 20 && t.getValor() < 29)
                        map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.20));
                    if (t.getValor() >= 29) map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.23));
                });

        return map;
    };

    public static Supplier<Map<Month, Double>> teste10_6M = () -> {

        Map<Month, Double> map = new HashMap<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        for (TransCaixa tc : ltc) {
            Month key = tc.getData().getMonth();
            if (map.containsKey(key)) {
                double iva = map.get(key);
                if (tc.getValor() < 20) iva += 0.12 * tc.getValor();
                if (tc.getValor() >= 20 && tc.getValor() < 29) iva += 0.20 * tc.getValor();
                if (tc.getValor() >= 29) iva += 0.23 * tc.getValor();

                map.put(key, iva);

            } else {
                double iva = 0;
                if (tc.getValor() < 20) iva += 0.12 * tc.getValor();
                if (tc.getValor() >= 20 && tc.getValor() < 29) iva += 0.20 * tc.getValor();
                if (tc.getValor() >= 29) iva += 0.23 * tc.getValor();
                map.put(key, iva);
            }
        }

        return map;
    };

    public static Supplier<Map<Month, Double>> teste10Stream_6M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        Map<Month, Double> map = new HashMap<>();

        ltc.stream()
                .forEach(t -> {
                    Double valorExistente = map.get(t.getData().getMonth());
                    if (valorExistente == null) valorExistente = 0.0;

                    if (t.getValor() < 20) map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.12));
                    if (t.getValor() >= 20 && t.getValor() < 29)
                        map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.20));
                    if (t.getValor() >= 29) map.put(t.getData().getMonth(), valorExistente + (t.getValor() * 0.23));
                });

        return map;
    };
}
