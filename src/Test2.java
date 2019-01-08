import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Test2 {

    public static void execute(){

        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2L_1M = UtilsTransCaixa.testeBoxGenW(teste2List1M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2TS_1M = UtilsTransCaixa.testeBoxGenW(teste2TreeSet1M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2SS_1M = UtilsTransCaixa.testeBoxGenW(teste2SeqStream1M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2PS_1M = UtilsTransCaixa.testeBoxGenW(teste2ParStream1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2L_2M = UtilsTransCaixa.testeBoxGenW(teste2List2M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2TS_2M = UtilsTransCaixa.testeBoxGenW(teste2TreeSet2M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2SS_2M = UtilsTransCaixa.testeBoxGenW(teste2SeqStream2M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2PS_2M = UtilsTransCaixa.testeBoxGenW(teste2ParStream2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2L_4M = UtilsTransCaixa.testeBoxGenW(teste2List4M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2TS_4M = UtilsTransCaixa.testeBoxGenW(teste2TreeSet4M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2SS_4M = UtilsTransCaixa.testeBoxGenW(teste2SeqStream4M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2PS_4M = UtilsTransCaixa.testeBoxGenW(teste2ParStream4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2L_6M = UtilsTransCaixa.testeBoxGenW(teste2List6M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2TS_6M = UtilsTransCaixa.testeBoxGenW(teste2TreeSet6M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2SS_6M = UtilsTransCaixa.testeBoxGenW(teste2SeqStream6M);
        AbstractMap.SimpleEntry<Double, AbstractMap.SimpleEntry> teste2PS_6M = UtilsTransCaixa.testeBoxGenW(teste2ParStream6M);

        try{
            PrintWriter outFile = new PrintWriter(new File("resultsTeste2.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Tipo de dados; No.Casos; Tempo; Tamanho/Resultado \n");
            sb.append("List").append(";").append("1M").append(";").append(teste2L_1M.getKey().doubleValue()).append(";").append(teste2L_1M.getValue()).append("\n");
            sb.append("TreeSet").append(";").append("1M").append(";").append(teste2TS_1M.getKey().doubleValue()).append(";").append(teste2TS_1M.getValue()).append("\n");
            sb.append("Streams Sequenciais").append(";").append("1M").append(";").append(teste2SS_1M.getKey().doubleValue()).append(";").append(teste2SS_1M.getValue()).append("\n");
            sb.append("Streams Paralelas").append(";").append("1M").append(";").append(teste2PS_1M.getKey().doubleValue()).append(";").append(teste2PS_1M.getValue()).append("\n");

            sb.append("List").append(";").append("2M").append(";").append(teste2L_2M.getKey().doubleValue()).append(";").append(teste2L_2M.getValue()).append("\n");
            sb.append("TreeSet").append(";").append("2M").append(";").append(teste2TS_2M.getKey().doubleValue()).append(";").append(teste2TS_2M.getValue()).append("\n");
            sb.append("Streams Sequenciais").append(";").append("2M").append(";").append(teste2SS_2M.getKey().doubleValue()).append(";").append(teste2SS_2M.getValue()).append("\n");
            sb.append("Streams Paralelas").append(";").append("2M").append(";").append(teste2PS_2M.getKey().doubleValue()).append(";").append(teste2PS_2M.getValue()).append("\n");

            sb.append("List").append(";").append("4M").append(";").append(teste2L_4M.getKey().doubleValue()).append(";").append(teste2L_4M.getValue()).append("\n");
            sb.append("TreeSet").append(";").append("4M").append(";").append(teste2TS_4M.getKey().doubleValue()).append(";").append(teste2TS_4M.getValue()).append("\n");
            sb.append("Streams Sequenciais").append(";").append("4M").append(";").append(teste2SS_4M.getKey().doubleValue()).append(";").append(teste2SS_4M.getValue()).append("\n");
            sb.append("Streams Paralelas").append(";").append("4M").append(";").append(teste2PS_4M.getKey().doubleValue()).append(";").append(teste2PS_4M.getValue()).append("\n");

            sb.append("List").append(";").append("6M").append(";").append(teste2L_6M.getKey().doubleValue()).append(";").append(teste2L_6M.getValue()).append("\n");
            sb.append("TreeSet").append(";").append("6M").append(";").append(teste2TS_6M.getKey().doubleValue()).append(";").append(teste2TS_6M.getValue()).append("\n");
            sb.append("Streams Sequenciais").append(";").append("6M").append(";").append(teste2SS_6M.getKey().doubleValue()).append(";").append(teste2SS_6M.getValue()).append("\n");
            sb.append("Streams Paralelas").append(";").append("6M").append(";").append(teste2PS_6M.getKey().doubleValue()).append(";").append(teste2PS_6M.getValue()).append("\n");

            outFile.write(sb.toString());
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static Supplier<AbstractMap.SimpleEntry> teste2List1M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        ltc.sort(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = ltc.subList(0, (int) (0.3 * ltc.size()));

        List<TransCaixa> end = ltc.subList((int) (0.7 * ltc.size()), ltc.size());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2List2M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        ltc.sort(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = ltc.subList(0, (int) (0.3 * ltc.size()));

        List<TransCaixa> end = ltc.subList((int) (0.7 * ltc.size()), ltc.size());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2List4M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        ltc.sort(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = ltc.subList(0, (int) (0.3 * ltc.size()));

        List<TransCaixa> end = ltc.subList((int) (0.7 * ltc.size()), ltc.size());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2List6M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        ltc.sort(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = ltc.subList(0, (int) (0.3 * ltc.size()));

        List<TransCaixa> end = ltc.subList((int) (0.7 * ltc.size()), ltc.size());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2TreeSet1M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        TreeSet<TransCaixa> tsec = new TreeSet<>(TransCaixaComparator.transPorData);
        tsec.addAll(ltc);

        List<TransCaixa> sorted = new ArrayList<>(tsec);

        List<TransCaixa> seq = sorted.subList(0, (int) (0.3 * ltc.size()));

        List<TransCaixa> end = sorted.subList((int) (0.7 * ltc.size()), ltc.size());

        return new AbstractMap.SimpleEntry(seq, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2TreeSet2M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        TreeSet<TransCaixa> tsec = new TreeSet<>(TransCaixaComparator.transPorData);
        tsec.addAll(ltc);

        List<TransCaixa> sorted = new ArrayList<>(tsec);

        List<TransCaixa> seq = sorted.subList(0, (int) (0.3 * ltc.size()));

        List<TransCaixa> end = sorted.subList((int) (0.7 * ltc.size()), ltc.size());

        return new AbstractMap.SimpleEntry(seq, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2TreeSet4M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        TreeSet<TransCaixa> tsec = new TreeSet<>(TransCaixaComparator.transPorData);
        tsec.addAll(ltc);

        List<TransCaixa> sorted = new ArrayList<>(tsec);

        List<TransCaixa> seq = sorted.subList(0, (int) (0.3 * ltc.size()));

        List<TransCaixa> end = sorted.subList((int) (0.7 * ltc.size()), ltc.size());

        return new AbstractMap.SimpleEntry(seq, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2TreeSet6M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        TreeSet<TransCaixa> tsec = new TreeSet<>(TransCaixaComparator.transPorData);
        tsec.addAll(ltc);

        List<TransCaixa> sorted = new ArrayList<>(tsec);

        List<TransCaixa> seq = sorted.subList(0, (int) (0.3 * ltc.size()));

        List<TransCaixa> end = sorted.subList((int) (0.7 * ltc.size()), ltc.size());

        return new AbstractMap.SimpleEntry(seq, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2SeqStream1M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Stream<TransCaixa> sorted = ltc.stream().sorted(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = sorted.limit((long) (0.3 * ltc.size())).collect(toList());

        List<TransCaixa> end = sorted.skip((long) (0.7 * ltc.size())).collect(toList());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2SeqStream2M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        Stream<TransCaixa> sorted = ltc.stream().sorted(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = sorted.limit((long) (0.3 * ltc.size())).collect(toList());

        List<TransCaixa> end = sorted.skip((long) (0.7 * ltc.size())).collect(toList());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2SeqStream4M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        Stream<TransCaixa> sorted = ltc.stream().sorted(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = sorted.limit((long) (0.3 * ltc.size())).collect(toList());

        List<TransCaixa> end = sorted.skip((long) (0.7 * ltc.size())).collect(toList());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2SeqStream6M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        Stream<TransCaixa> sorted = ltc.stream().sorted(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = sorted.limit((long) (0.3 * ltc.size())).collect(toList());

        List<TransCaixa> end = sorted.skip((long) (0.7 * ltc.size())).collect(toList());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2ParStream1M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Stream<TransCaixa> sorted = ltc.parallelStream().sorted(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = sorted.limit((long) (0.3 * ltc.size())).collect(toList());

        List<TransCaixa> end = sorted.skip((long) (0.7 * ltc.size())).collect(toList());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2ParStream2M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        Stream<TransCaixa> sorted = ltc.parallelStream().sorted(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = sorted.limit((long) (0.3 * ltc.size())).collect(toList());

        List<TransCaixa> end = sorted.skip((long) (0.7 * ltc.size())).collect(toList());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2ParStream4M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        Stream<TransCaixa> sorted = ltc.parallelStream().sorted(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = sorted.limit((long) (0.3 * ltc.size())).collect(toList());

        List<TransCaixa> end = sorted.skip((long) (0.7 * ltc.size())).collect(toList());

        return new AbstractMap.SimpleEntry(sec, end);
    };

    public static Supplier<AbstractMap.SimpleEntry> teste2ParStream6M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        Stream<TransCaixa> sorted = ltc.parallelStream().sorted(TransCaixaComparator.transPorData);

        List<TransCaixa> sec = sorted.limit((long) (0.3 * ltc.size())).collect(toList());

        List<TransCaixa> end = sorted.skip((long) (0.7 * ltc.size())).collect(toList());

        return new AbstractMap.SimpleEntry(sec, end);
    };
}
