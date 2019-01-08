import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.temporal.WeekFields;
import java.util.*;
import java.util.function.Supplier;
import static java.util.stream.Collectors.toList;

public class Test9 {
    public static void execute() {
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, List<List<TransCaixa>>> test9_1M = UtilsTransCaixa.testeBoxGenW(teste09_1M);
        AbstractMap.SimpleEntry<Double, List<List<TransCaixa>>> test9S_1M = UtilsTransCaixa.testeBoxGenW(teste09Stream_1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double, List<List<TransCaixa>>> test9_2M = UtilsTransCaixa.testeBoxGenW(teste09_2M);
        AbstractMap.SimpleEntry<Double, List<List<TransCaixa>>> test9S_2M = UtilsTransCaixa.testeBoxGenW(teste09Stream_2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double, List<List<TransCaixa>>> test9_4M = UtilsTransCaixa.testeBoxGenW(teste09_4M);
        AbstractMap.SimpleEntry<Double, List<List<TransCaixa>>> test9S_4M = UtilsTransCaixa.testeBoxGenW(teste09Stream_4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double, List<List<TransCaixa>>> test9_6M = UtilsTransCaixa.testeBoxGenW(teste09_6M);
        AbstractMap.SimpleEntry<Double, List<List<TransCaixa>>> test9S_6M = UtilsTransCaixa.testeBoxGenW(teste09Stream_6M);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsTeste9.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Tipo de Estrutura; No.Casos; Tempo; Tamanho \n");
            sb.append("List").append(";").append("1M").append(";").append(test9_1M.getKey().doubleValue()).append(";").append(test9_1M.getValue().size()).append("\n");
            sb.append("List Stream").append(";").append("1M").append(";").append(test9S_1M.getKey().doubleValue()).append(";").append(test9S_1M.getValue().size()).append("\n");

            sb.append("List").append(";").append("2M").append(";").append(test9_2M.getKey().doubleValue()).append(";").append(test9_2M.getValue().size()).append("\n");
            sb.append("List Stream").append(";").append("2M").append(";").append(test9S_2M.getKey().doubleValue()).append(";").append(test9S_2M.getValue().size()).append("\n");

            sb.append("List").append(";").append("4M").append(";").append(test9_4M.getKey().doubleValue()).append(";").append(test9_4M.getValue().size()).append("\n");
            sb.append("List Stream").append(";").append("4M").append(";").append(test9S_4M.getKey().doubleValue()).append(";").append(test9S_4M.getValue().size()).append("\n");

            sb.append("List").append(";").append("6M").append(";").append(test9_6M.getKey().doubleValue()).append(";").append(test9_6M.getValue().size()).append("\n");
            sb.append("List Stream").append(";").append("6M").append(";").append(test9S_6M.getKey().doubleValue()).append(";").append(test9S_6M.getValue().size()).append("\n");

            outFile.write(sb.toString());
            outFile.close();
        } catch (IOException e) {
            System.out.println("ERRO!");
        }
    }

    public static Supplier<List<List<TransCaixa>>> teste09_1M = () -> {

        List<List<TransCaixa>> lista = new ArrayList<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        List<TransCaixa> tempList = new ArrayList<>();

        WeekFields weekFields = WeekFields.of(Locale.US);

        //Foi escolhida a semana 27
        for (TransCaixa tc : ltc) {
            if (tc.getData().toLocalDate().get(weekFields.weekOfYear()) == 27) {
                tempList.add(tc);
            }
        }

        lista.add(tempList);

        return lista;
    };

    public static Supplier<List<List<TransCaixa>>> teste09Stream_1M = () -> {

        List<List<TransCaixa>> lista = new ArrayList<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        WeekFields weekFields = WeekFields.of(Locale.US);

        lista.add(ltc.stream().filter(tc -> tc.getData().toLocalDate().get(weekFields.weekOfYear()) == 27)
                .collect(toList())
        );

        return lista;

    };

    public static Supplier<List<List<TransCaixa>>> teste09_2M = () -> {

        List<List<TransCaixa>> lista = new ArrayList<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        List<TransCaixa> tempList = new ArrayList<>();

        WeekFields weekFields = WeekFields.of(Locale.US);

        //Foi escolhida a semana 27
        for (TransCaixa tc : ltc) {
            if (tc.getData().toLocalDate().get(weekFields.weekOfYear()) == 27) {
                tempList.add(tc);
            }
        }

        lista.add(tempList);

        return lista;
    };

    public static Supplier<List<List<TransCaixa>>> teste09Stream_2M = () -> {

        List<List<TransCaixa>> lista = new ArrayList<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        WeekFields weekFields = WeekFields.of(Locale.US);

        lista.add(ltc.stream().filter(tc -> tc.getData().toLocalDate().get(weekFields.weekOfYear()) == 27)
                .collect(toList())
        );

        return lista;

    };

    public static Supplier<List<List<TransCaixa>>> teste09_4M = () -> {

        List<List<TransCaixa>> lista = new ArrayList<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        List<TransCaixa> tempList = new ArrayList<>();

        WeekFields weekFields = WeekFields.of(Locale.US);

        //Foi escolhida a semana 27
        for (TransCaixa tc : ltc) {
            if (tc.getData().toLocalDate().get(weekFields.weekOfYear()) == 27) {
                tempList.add(tc);
            }
        }

        lista.add(tempList);

        return lista;
    };

    public static Supplier<List<List<TransCaixa>>> teste09Stream_4M = () -> {

        List<List<TransCaixa>> lista = new ArrayList<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        WeekFields weekFields = WeekFields.of(Locale.US);

        lista.add(ltc.stream().filter(tc -> tc.getData().toLocalDate().get(weekFields.weekOfYear()) == 27)
                .collect(toList())
        );

        return lista;

    };

    public static Supplier<List<List<TransCaixa>>> teste09_6M = () -> {

        List<List<TransCaixa>> lista = new ArrayList<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        List<TransCaixa> tempList = new ArrayList<>();

        WeekFields weekFields = WeekFields.of(Locale.US);

        //Foi escolhida a semana 27
        for (TransCaixa tc : ltc) {
            if (tc.getData().toLocalDate().get(weekFields.weekOfYear()) == 27) {
                tempList.add(tc);
            }
        }

        lista.add(tempList);

        return lista;
    };

    public static Supplier<List<List<TransCaixa>>> teste09Stream_6M = () -> {

        List<List<TransCaixa>> lista = new ArrayList<>();

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        WeekFields weekFields = WeekFields.of(Locale.US);

        lista.add(ltc.stream().filter(tc -> tc.getData().toLocalDate().get(weekFields.weekOfYear()) == 27)
                .collect(toList())
        );

        return lista;

    };
}
