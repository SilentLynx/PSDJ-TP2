import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test1 {

    public static void execute(){

        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, Double> sumArrF_1M = UtilsTransCaixa.testeBoxGenW(sumArrayF1M);
        AbstractMap.SimpleEntry<Double, Double> sumArrFE_1M = UtilsTransCaixa.testeBoxGenW(sumArrayFE1M);
        AbstractMap.SimpleEntry<Double, Double> sumDStr_1M = UtilsTransCaixa.testeBoxGenW(sumDoubleStream1M);
        AbstractMap.SimpleEntry<Double, Double> sumPDStr_1M = UtilsTransCaixa.testeBoxGenW(sumParDoubleStream1M);
        AbstractMap.SimpleEntry<Double, Double> sumStr_1M = UtilsTransCaixa.testeBoxGenW(sumStream1M);
        AbstractMap.SimpleEntry<Double, Double> sumParStr_1M = UtilsTransCaixa.testeBoxGenW(sumParStream1M);
        AbstractMap.SimpleEntry<Double, Double> avgArrF_1M = UtilsTransCaixa.testeBoxGenW(avgArrayF1M);
        AbstractMap.SimpleEntry<Double, Double> avgArrFE_1M = UtilsTransCaixa.testeBoxGenW(avgArrayFE1M);
        AbstractMap.SimpleEntry<Double, Double> avgDStr_1M = UtilsTransCaixa.testeBoxGenW(avgDoubleStream1M);
        AbstractMap.SimpleEntry<Double, Double> avgParDStr_1M = UtilsTransCaixa.testeBoxGenW(avgParDoubleStream1M);
        AbstractMap.SimpleEntry<Double, Double> avgStr_1M = UtilsTransCaixa.testeBoxGenW(avgStream1M);
        AbstractMap.SimpleEntry<Double, Double> avgParStr_1M = UtilsTransCaixa.testeBoxGenW(avgParStream1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double, Double> sumArrF_2M = UtilsTransCaixa.testeBoxGenW(sumArrayF2M);
        AbstractMap.SimpleEntry<Double, Double> sumArrFE_2M = UtilsTransCaixa.testeBoxGenW(sumArrayFE2M);
        AbstractMap.SimpleEntry<Double, Double> sumDStr_2M = UtilsTransCaixa.testeBoxGenW(sumDoubleStream2M);
        AbstractMap.SimpleEntry<Double, Double> sumPDStr_2M = UtilsTransCaixa.testeBoxGenW(sumParDoubleStream2M);
        AbstractMap.SimpleEntry<Double, Double> sumStr_2M = UtilsTransCaixa.testeBoxGenW(sumStream2M);
        AbstractMap.SimpleEntry<Double, Double> sumParStr_2M = UtilsTransCaixa.testeBoxGenW(sumParStream2M);
        AbstractMap.SimpleEntry<Double, Double> avgArrF_2M = UtilsTransCaixa.testeBoxGenW(avgArrayF2M);
        AbstractMap.SimpleEntry<Double, Double> avgArrFE_2M = UtilsTransCaixa.testeBoxGenW(avgArrayFE2M);
        AbstractMap.SimpleEntry<Double, Double> avgDStr_2M = UtilsTransCaixa.testeBoxGenW(avgDoubleStream2M);
        AbstractMap.SimpleEntry<Double, Double> avgParDStr_2M = UtilsTransCaixa.testeBoxGenW(avgParDoubleStream2M);
        AbstractMap.SimpleEntry<Double, Double> avgStr_2M = UtilsTransCaixa.testeBoxGenW(avgStream2M);
        AbstractMap.SimpleEntry<Double, Double> avgParStr_2M = UtilsTransCaixa.testeBoxGenW(avgParStream2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double, Double> sumArrF_4M = UtilsTransCaixa.testeBoxGenW(sumArrayF4M);
        AbstractMap.SimpleEntry<Double, Double> sumArrFE_4M = UtilsTransCaixa.testeBoxGenW(sumArrayFE4M);
        AbstractMap.SimpleEntry<Double, Double> sumDStr_4M = UtilsTransCaixa.testeBoxGenW(sumDoubleStream4M);
        AbstractMap.SimpleEntry<Double, Double> sumPDStr_4M = UtilsTransCaixa.testeBoxGenW(sumParDoubleStream4M);
        AbstractMap.SimpleEntry<Double, Double> sumStr_4M = UtilsTransCaixa.testeBoxGenW(sumStream4M);
        AbstractMap.SimpleEntry<Double, Double> sumParStr_4M = UtilsTransCaixa.testeBoxGenW(sumParStream4M);
        AbstractMap.SimpleEntry<Double, Double> avgArrF_4M = UtilsTransCaixa.testeBoxGenW(avgArrayF4M);
        AbstractMap.SimpleEntry<Double, Double> avgArrFE_4M = UtilsTransCaixa.testeBoxGenW(avgArrayFE4M);
        AbstractMap.SimpleEntry<Double, Double> avgDStr_4M = UtilsTransCaixa.testeBoxGenW(avgDoubleStream4M);
        AbstractMap.SimpleEntry<Double, Double> avgParDStr_4M = UtilsTransCaixa.testeBoxGenW(avgParDoubleStream4M);
        AbstractMap.SimpleEntry<Double, Double> avgStr_4M = UtilsTransCaixa.testeBoxGenW(avgStream4M);
        AbstractMap.SimpleEntry<Double, Double> avgParStr_4M = UtilsTransCaixa.testeBoxGenW(avgParStream4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double, Double> sumArrF_6M = UtilsTransCaixa.testeBoxGenW(sumArrayF6M);
        AbstractMap.SimpleEntry<Double, Double> sumArrFE_6M = UtilsTransCaixa.testeBoxGenW(sumArrayFE6M);
        AbstractMap.SimpleEntry<Double, Double> sumDStr_6M = UtilsTransCaixa.testeBoxGenW(sumDoubleStream6M);
        AbstractMap.SimpleEntry<Double, Double> sumPDStr_6M = UtilsTransCaixa.testeBoxGenW(sumParDoubleStream6M);
        AbstractMap.SimpleEntry<Double, Double> sumStr_6M = UtilsTransCaixa.testeBoxGenW(sumStream6M);
        AbstractMap.SimpleEntry<Double, Double> sumParStr_6M = UtilsTransCaixa.testeBoxGenW(sumParStream6M);
        AbstractMap.SimpleEntry<Double, Double> avgArrF_6M = UtilsTransCaixa.testeBoxGenW(avgArrayF6M);
        AbstractMap.SimpleEntry<Double, Double> avgArrFE_6M = UtilsTransCaixa.testeBoxGenW(avgArrayFE6M);
        AbstractMap.SimpleEntry<Double, Double> avgDStr_6M = UtilsTransCaixa.testeBoxGenW(avgDoubleStream6M);
        AbstractMap.SimpleEntry<Double, Double> avgParDStr_6M = UtilsTransCaixa.testeBoxGenW(avgParDoubleStream6M);
        AbstractMap.SimpleEntry<Double, Double> avgStr_6M = UtilsTransCaixa.testeBoxGenW(avgStream6M);
        AbstractMap.SimpleEntry<Double, Double> avgParStr_6M = UtilsTransCaixa.testeBoxGenW(avgParStream6M);

        try{
            PrintWriter outFile = new PrintWriter(new File("resultsTeste1.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Operacao;Tipo;Modo;No.Casos;Tempo;Resultado\n");
            sb.append("Soma;Array;For;1M;").append(sumArrF_1M.getKey().doubleValue()).append(";").append(sumArrF_1M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Array;ForEach;1M;").append(sumArrFE_1M.getKey().doubleValue()).append(";").append(sumArrFE_1M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Double Stream;Sequencial;1M;").append(sumDStr_1M.getKey().doubleValue()).append(";").append(sumDStr_1M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Double Stream;Paralela;1M;").append(sumPDStr_1M.getKey().doubleValue()).append(";").append(sumPDStr_1M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Stream;Sequencial;1M;").append(sumStr_1M.getKey().doubleValue()).append(";").append(sumStr_1M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Stream;Paralela;1M;").append(sumParStr_1M.getKey().doubleValue()).append(";").append(sumParStr_1M.getValue().doubleValue()).append("\n");
            sb.append("Media;Array;For;1M;").append(avgArrF_1M.getKey().doubleValue()).append(";").append(avgArrF_1M.getValue().doubleValue()).append("\n");
            sb.append("Media;Array;ForEach;1M;").append(avgArrFE_1M.getKey().doubleValue()).append(";").append(avgArrFE_1M.getValue().doubleValue()).append("\n");
            sb.append("Media;Double Stream;Sequencial;1M;").append(avgDStr_1M.getKey().doubleValue()).append(";").append(avgDStr_1M.getValue().doubleValue()).append("\n");
            sb.append("Media;Double Stream;Paralela;1M;").append(avgParDStr_1M.getKey().doubleValue()).append(";").append(avgParDStr_1M.getValue().doubleValue()).append("\n");
            sb.append("Media;Stream;Sequencial;1M;").append(avgStr_1M.getKey().doubleValue()).append(";").append(avgStr_1M.getValue().doubleValue()).append("\n");
            sb.append("Media;Stream;Paralela;1M;").append(avgParStr_1M.getKey().doubleValue()).append(";").append(avgParStr_1M.getValue().doubleValue()).append("\n");

            sb.append("Soma;Array;For;2M;").append(sumArrF_2M.getKey().doubleValue()).append(";").append(sumArrF_2M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Array;ForEach;2M;").append(sumArrFE_2M.getKey().doubleValue()).append(";").append(sumArrFE_2M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Double Stream;Sequencial;2M;").append(sumDStr_2M.getKey().doubleValue()).append(";").append(sumDStr_2M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Double Stream;Paralela;2M;").append(sumPDStr_2M.getKey().doubleValue()).append(";").append(sumPDStr_2M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Stream;Sequencial;2M;").append(sumStr_2M.getKey().doubleValue()).append(";").append(sumStr_2M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Stream;Paralela;2M;").append(sumParStr_2M.getKey().doubleValue()).append(";").append(sumParStr_2M.getValue().doubleValue()).append("\n");
            sb.append("Media;Array;For;2M;").append(avgArrF_2M.getKey().doubleValue()).append(";").append(avgArrF_2M.getValue().doubleValue()).append("\n");
            sb.append("Media;Array;ForEach;2M;").append(avgArrFE_2M.getKey().doubleValue()).append(";").append(avgArrFE_2M.getValue().doubleValue()).append("\n");
            sb.append("Media;Double Stream;Sequencial;2M;").append(avgDStr_2M.getKey().doubleValue()).append(";").append(avgDStr_2M.getValue().doubleValue()).append("\n");
            sb.append("Media;Double Stream;Paralela;2M;").append(avgParDStr_2M.getKey().doubleValue()).append(";").append(avgParDStr_2M.getValue().doubleValue()).append("\n");
            sb.append("Media;Stream;Sequencial;2M;").append(avgStr_2M.getKey().doubleValue()).append(";").append(avgStr_2M.getValue().doubleValue()).append("\n");
            sb.append("Media;Stream;Paralela;2M;").append(avgParStr_2M.getKey().doubleValue()).append(";").append(avgParStr_2M.getValue().doubleValue()).append("\n");

            sb.append("Soma;Array;For;4M;").append(sumArrF_4M.getKey().doubleValue()).append(";").append(sumArrF_4M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Array;ForEach;4M;").append(sumArrFE_4M.getKey().doubleValue()).append(";").append(sumArrFE_4M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Double Stream;Sequencial;4M;").append(sumDStr_4M.getKey().doubleValue()).append(";").append(sumDStr_4M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Double Stream;Paralela;4M;").append(sumPDStr_4M.getKey().doubleValue()).append(";").append(sumPDStr_4M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Stream;Sequencial;4M;").append(sumStr_4M.getKey().doubleValue()).append(";").append(sumStr_4M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Stream;Paralela;4M;").append(sumParStr_4M.getKey().doubleValue()).append(";").append(sumParStr_4M.getValue().doubleValue()).append("\n");
            sb.append("Media;Array;For;4M;").append(avgArrF_4M.getKey().doubleValue()).append(";").append(avgArrF_4M.getValue().doubleValue()).append("\n");
            sb.append("Media;Array;ForEach;4M;").append(avgArrFE_4M.getKey().doubleValue()).append(";").append(avgArrFE_4M.getValue().doubleValue()).append("\n");
            sb.append("Media;Double Stream;Sequencial;4M;").append(avgDStr_4M.getKey().doubleValue()).append(";").append(avgDStr_4M.getValue().doubleValue()).append("\n");
            sb.append("Media;Double Stream;Paralela;4M;").append(avgParDStr_4M.getKey().doubleValue()).append(";").append(avgParDStr_4M.getValue().doubleValue()).append("\n");
            sb.append("Media;Stream;Sequencial;4M;").append(avgStr_4M.getKey().doubleValue()).append(";").append(avgStr_4M.getValue().doubleValue()).append("\n");
            sb.append("Media;Stream;Paralela;4M;").append(avgParStr_4M.getKey().doubleValue()).append(";").append(avgParStr_4M.getValue().doubleValue()).append("\n");

            sb.append("Soma;Array;For;6M;").append(sumArrF_6M.getKey().doubleValue()).append(";").append(sumArrF_6M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Array;ForEach;6M;").append(sumArrFE_6M.getKey().doubleValue()).append(";").append(sumArrFE_6M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Double Stream;Sequencial;6M;").append(sumDStr_6M.getKey().doubleValue()).append(";").append(sumDStr_6M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Double Stream;Paralela;6M;").append(sumPDStr_6M.getKey().doubleValue()).append(";").append(sumPDStr_6M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Stream;Sequencial;6M;").append(sumStr_6M.getKey().doubleValue()).append(";").append(sumStr_6M.getValue().doubleValue()).append("\n");
            sb.append("Soma;Stream;Paralela;6M;").append(sumParStr_6M.getKey().doubleValue()).append(";").append(sumParStr_6M.getValue().doubleValue()).append("\n");
            sb.append("Media;Array;For;6M;").append(avgArrF_6M.getKey().doubleValue()).append(";").append(avgArrF_6M.getValue().doubleValue()).append("\n");
            sb.append("Media;Array;ForEach;6M;").append(avgArrFE_6M.getKey().doubleValue()).append(";").append(avgArrFE_6M.getValue().doubleValue()).append("\n");
            sb.append("Media;Double Stream;Sequencial;6M;").append(avgDStr_6M.getKey().doubleValue()).append(";").append(avgDStr_6M.getValue().doubleValue()).append("\n");
            sb.append("Media;Double Stream;Paralela;6M;").append(avgParDStr_6M.getKey().doubleValue()).append(";").append(avgParDStr_6M.getValue().doubleValue()).append("\n");
            sb.append("Media;Stream;Sequencial;6M;").append(avgStr_6M.getKey().doubleValue()).append(";").append(avgStr_6M.getValue().doubleValue()).append("\n");
            sb.append("Media;Stream;Paralela;6M;").append(avgParStr_6M.getKey().doubleValue()).append(";").append(avgParStr_6M.getValue().doubleValue()).append("\n");

            outFile.write(sb.toString());
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Supplier<Double> sumArrayF1M = () -> {
        int i = 0;
        double sum = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(i = 0; i < d.length; i++){
            sum += d[i];
        }

        return sum;
    };

    public static Supplier<Double> sumArrayF2M = () -> {
        int i = 0;
        double sum = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(i = 0; i < d.length; i++){
            sum += d[i];
        }

        return sum;
    };

    public static Supplier<Double> sumArrayF4M = () -> {
        int i = 0;
        double sum = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(i = 0; i < d.length; i++){
            sum += d[i];
        }

        return sum;
    };

    public static Supplier<Double> sumArrayF6M = () -> {
        int i = 0;
        double sum = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(i = 0; i < d.length; i++){
            sum += d[i];
        }

        return sum;
    };


    public static Supplier<Double> avgArrayF1M = () -> {
        int i = 0;
        double avg = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(i = 0; i < d.length; i++){
            avg += d[i];
        }

        avg = avg / d.length;

        return avg;
    };

    public static Supplier<Double> avgArrayF2M = () -> {
        int i = 0;
        double avg = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(i = 0; i < d.length; i++){
            avg += d[i];
        }

        avg = avg / d.length;

        return avg;
    };

    public static Supplier<Double> avgArrayF4M = () -> {
        int i = 0;
        double avg = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(i = 0; i < d.length; i++){
            avg += d[i];
        }

        avg = avg / d.length;

        return avg;
    };

    public static Supplier<Double> avgArrayF6M = () -> {
        int i = 0;
        double avg = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(i = 0; i < d.length; i++){
            avg += d[i];
        }

        avg = avg / d.length;

        return avg;
    };

    public static Supplier<Double> sumArrayFE1M = () -> {
        int i = 0;
        double sum = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(double val : d){
            sum += val;
        }

        return sum;
    };

    public static Supplier<Double> sumArrayFE2M = () -> {
        int i = 0;
        double sum = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(double val : d){
            sum += val;
        }

        return sum;
    };

    public static Supplier<Double> sumArrayFE4M = () -> {
        int i = 0;
        double sum = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(double val : d){
            sum += val;
        }

        return sum;
    };

    public static Supplier<Double> sumArrayFE6M = () -> {
        int i = 0;
        double sum = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(double val : d){
            sum += val;
        }

        return sum;
    };


    public static Supplier<Double> avgArrayFE1M = () -> {
        int i = 0;
        double avg = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(double val : d){
            avg += val;
        }

        avg = avg / d.length;

        return avg;
    };

    public static Supplier<Double> avgArrayFE2M = () -> {
        int i = 0;
        double avg = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(double val : d){
            avg += val;
        }

        avg = avg / d.length;

        return avg;
    };

    public static Supplier<Double> avgArrayFE4M = () -> {
        int i = 0;
        double avg = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(double val : d){
            avg += val;
        }

        avg = avg / d.length;

        return avg;
    };

    public static Supplier<Double> avgArrayFE6M = () -> {
        int i = 0;
        double avg = 0;

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");
        double[] d = new double[ltc.size()];

        for(TransCaixa t : ltc){
            d[i] = t.getValor();
            i++;
        }

        for(double val : d){
            avg += val;
        }

        avg = avg / d.length;

        return avg;
    };

    public static Supplier<Double> sumDoubleStream1M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).sum();

        return d;
    };

    public static Supplier<Double> sumDoubleStream2M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).sum();

        return d;
    };

    public static Supplier<Double> sumDoubleStream4M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).sum();

        return d;
    };

    public static Supplier<Double> sumDoubleStream6M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).sum();

        return d;
    };

    public static Supplier<Double> avgDoubleStream1M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).average().getAsDouble();

        return d;
    };

    public static Supplier<Double> avgDoubleStream2M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).average().getAsDouble();

        return d;
    };

    public static Supplier<Double> avgDoubleStream4M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).average().getAsDouble();

        return d;
    };

    public static Supplier<Double> avgDoubleStream6M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        Double d = ltc.stream().mapToDouble(t -> t.getValor()).average().getAsDouble();

        return d;
    };

    public static Supplier<Double> sumStream1M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        double sum = ltc.stream().collect(Collectors.summingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> sumStream2M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        double sum = ltc.stream().collect(Collectors.summingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> sumStream4M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        double sum = ltc.stream().collect(Collectors.summingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> sumStream6M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        double sum = ltc.stream().collect(Collectors.summingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> avgStream1M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        double sum = ltc.stream().collect(Collectors.averagingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> avgStream2M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        double sum = ltc.stream().collect(Collectors.averagingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> avgStream4M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        double sum = ltc.stream().collect(Collectors.averagingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> avgStream6M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        double sum = ltc.stream().collect(Collectors.averagingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> sumParDoubleStream1M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Double d = ltc.parallelStream().mapToDouble(t -> t.getValor()).sum();

        return d;
    };

    public static Supplier<Double> sumParDoubleStream2M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        Double d = ltc.parallelStream().mapToDouble(t -> t.getValor()).sum();

        return d;
    };

    public static Supplier<Double> sumParDoubleStream4M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        Double d = ltc.parallelStream().mapToDouble(t -> t.getValor()).sum();

        return d;
    };

    public static Supplier<Double> sumParDoubleStream6M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        Double d = ltc.parallelStream().mapToDouble(t -> t.getValor()).sum();

        return d;
    };

    public static Supplier<Double> avgParDoubleStream1M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        Double d = ltc.parallelStream().mapToDouble(t -> t.getValor()).average().getAsDouble();

        return d;
    };

    public static Supplier<Double> avgParDoubleStream2M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        Double d = ltc.parallelStream().mapToDouble(t -> t.getValor()).average().getAsDouble();

        return d;
    };

    public static Supplier<Double> avgParDoubleStream4M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        Double d = ltc.parallelStream().mapToDouble(t -> t.getValor()).average().getAsDouble();

        return d;
    };

    public static Supplier<Double> avgParDoubleStream6M = () -> {

        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        Double d = ltc.parallelStream().mapToDouble(t -> t.getValor()).average().getAsDouble();

        return d;
    };

    public static Supplier<Double> sumParStream1M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        double sum = ltc.parallelStream().collect(Collectors.summingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> sumParStream2M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        double sum = ltc.parallelStream().collect(Collectors.summingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> sumParStream4M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        double sum = ltc.parallelStream().collect(Collectors.summingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> sumParStream6M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        double sum = ltc.parallelStream().collect(Collectors.summingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> avgParStream1M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa1M.txt");

        double sum = ltc.parallelStream().collect(Collectors.averagingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> avgParStream2M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa2M.txt");

        double sum = ltc.parallelStream().collect(Collectors.averagingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> avgParStream4M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa4M.txt");

        double sum = ltc.parallelStream().collect(Collectors.averagingDouble(t -> t.getValor()));

        return sum;
    };

    public static Supplier<Double> avgParStream6M = () -> {
        List<TransCaixa> ltc = UtilsTransCaixa.setup("TransCaixa6M.txt");

        double sum = ltc.parallelStream().collect(Collectors.averagingDouble(t -> t.getValor()));

        return sum;
    };
}
