import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

public class Test5 {

    public static void execute()
    {
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, List<TransCaixa>> test5L_1M = UtilsTransCaixa.testeBoxGenW(teste5L_1M);
        AbstractMap.SimpleEntry<Double, SortedSet<TransCaixa>> test5T_1M = UtilsTransCaixa.testeBoxGenW(teste5T_1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double, List<TransCaixa>> test5L_2M = UtilsTransCaixa.testeBoxGenW(teste5L_2M);
        AbstractMap.SimpleEntry<Double, SortedSet<TransCaixa>> test5T_2M = UtilsTransCaixa.testeBoxGenW(teste5T_2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double, List<TransCaixa>> test5L_4M = UtilsTransCaixa.testeBoxGenW(teste5L_4M);
        AbstractMap.SimpleEntry<Double, SortedSet<TransCaixa>> test5T_4M = UtilsTransCaixa.testeBoxGenW(teste5T_4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double, List<TransCaixa>> test5L_6M = UtilsTransCaixa.testeBoxGenW(teste5L_6M);
        AbstractMap.SimpleEntry<Double, SortedSet<TransCaixa>> test5T_6M = UtilsTransCaixa.testeBoxGenW(teste5T_6M);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsTeste5.csv"));

            StringBuilder sb = new StringBuilder();

            sb.append("Tipo de Estrutura; No.Casos; Tempo; Tamanho \n");
            sb.append("List").append(";").append("1M").append(";").append(test5L_1M.getKey().doubleValue()).append(";").append(test5L_1M.getValue().size()).append("\n");
            sb.append("SortedTree Set").append(";").append("1M").append(";").append(test5T_1M.getKey().doubleValue()).append(";").append(test5T_1M.getValue().size()).append("\n");

            sb.append("List").append(";").append("2M").append(";").append(test5L_2M.getKey().doubleValue()).append(";").append(test5L_2M.getValue().size()).append("\n");
            sb.append("SortedTree Set").append(";").append("2M").append(";").append(test5T_2M.getKey().doubleValue()).append(";").append(test5T_2M.getValue().size()).append("\n");

            sb.append("List").append(";").append("4M").append(";").append(test5L_4M.getKey().doubleValue()).append(";").append(test5L_4M.getValue().size()).append("\n");
            sb.append("SortedTree Set").append(";").append("4M").append(";").append(test5T_4M.getKey().doubleValue()).append(";").append(test5T_4M.getValue().size()).append("\n");

            sb.append("List").append(";").append("6M").append(";").append(test5L_6M.getKey().doubleValue()).append(";").append(test5L_6M.getValue().size()).append("\n");
            sb.append("SortedTree Set").append(";").append("6M").append(";").append(test5T_6M.getKey().doubleValue()).append(";").append(test5T_6M.getValue().size()).append("\n");

            outFile.write(sb.toString());
            outFile.close();
        }
        catch(IOException e){
            System.out.println("ERRO!");
        }
    }

    public static Supplier<List<TransCaixa>> teste5L_1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        List<TransCaixa> ret;

        ret = ltc.stream()
                .sorted(TransCaixaComparator.transPorData)
                .collect(toList());

        return ret;
    };

    public static Supplier<SortedSet<TransCaixa>> teste5T_1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        Supplier<SortedSet<TransCaixa>> supplyTreeSetTcx = () -> new TreeSet<>(TransCaixaComparator.transPorData);

        SortedSet<TransCaixa> transOrdData = ltc.stream()
                .collect(toCollection(supplyTreeSetTcx));

        return transOrdData;
    };

    public static Supplier<List<TransCaixa>> teste5L_2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");
        List<TransCaixa> ret;

        ret = ltc.stream()
                .sorted(TransCaixaComparator.transPorData)
                .collect(toList());

        return ret;
    };

    public static Supplier<SortedSet<TransCaixa>> teste5T_2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");
        Supplier<SortedSet<TransCaixa>> supplyTreeSetTcx = () -> new TreeSet<>(TransCaixaComparator.transPorData);

        SortedSet<TransCaixa> transOrdData = ltc.stream()
                .collect(toCollection(supplyTreeSetTcx));

        return transOrdData;
    };

    public static Supplier<List<TransCaixa>> teste5L_4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");
        List<TransCaixa> ret;

        ret = ltc.stream()
                .sorted(TransCaixaComparator.transPorData)
                .collect(toList());

        return ret;
    };

    public static Supplier<SortedSet<TransCaixa>> teste5T_4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");
        Supplier<SortedSet<TransCaixa>> supplyTreeSetTcx = () -> new TreeSet<>(TransCaixaComparator.transPorData);

        SortedSet<TransCaixa> transOrdData = ltc.stream()
                .collect(toCollection(supplyTreeSetTcx));

        return transOrdData;
    };

    public static Supplier<List<TransCaixa>> teste5L_6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");
        List<TransCaixa> ret;

        ret = ltc.stream()
                .sorted(TransCaixaComparator.transPorData)
                .collect(toList());

        return ret;
    };

    public static Supplier<SortedSet<TransCaixa>> teste5T_6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");
        Supplier<SortedSet<TransCaixa>> supplyTreeSetTcx = () -> new TreeSet<>(TransCaixaComparator.transPorData);

        SortedSet<TransCaixa> transOrdData = ltc.stream()
                .collect(toCollection(supplyTreeSetTcx));

        return transOrdData;
    };
}
