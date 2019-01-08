import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test1 {

    public static void execute(){

        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, Double> sumArr_1M = UtilsTransCaixa.testeBoxGenW(sumArray1M);
        AbstractMap.SimpleEntry<Double, Double> sumDStr_1M = UtilsTransCaixa.testeBoxGenW(sumDoubleStream1M);
        AbstractMap.SimpleEntry<Double, Double> sumStr_1M = UtilsTransCaixa.testeBoxGenW(sumStream1M);
        AbstractMap.SimpleEntry<Double, Double> avgArr_1M = UtilsTransCaixa.testeBoxGenW(avgArray1M);
        AbstractMap.SimpleEntry<Double, Double> avgDStr_1M = UtilsTransCaixa.testeBoxGenW(avgDoubleStream1M);
        AbstractMap.SimpleEntry<Double, Double> avgStr_1M = UtilsTransCaixa.testeBoxGenW(avgStream1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double, Double> sumArr_2M = UtilsTransCaixa.testeBoxGenW(sumArray2M);
        AbstractMap.SimpleEntry<Double, Double> sumDStr_2M = UtilsTransCaixa.testeBoxGenW(sumDoubleStream2M);
        AbstractMap.SimpleEntry<Double, Double> sumStr_2M = UtilsTransCaixa.testeBoxGenW(sumStream2M);
        AbstractMap.SimpleEntry<Double, Double> avgArr_2M = UtilsTransCaixa.testeBoxGenW(avgArray2M);
        AbstractMap.SimpleEntry<Double, Double> avgDStr_2M = UtilsTransCaixa.testeBoxGenW(avgDoubleStream2M);
        AbstractMap.SimpleEntry<Double, Double> avgStr_2M = UtilsTransCaixa.testeBoxGenW(avgStream2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double, Double> sumArr_4M = UtilsTransCaixa.testeBoxGenW(sumArray4M);
        AbstractMap.SimpleEntry<Double, Double> sumDStr_4M = UtilsTransCaixa.testeBoxGenW(sumDoubleStream4M);
        AbstractMap.SimpleEntry<Double, Double> sumStr_4M = UtilsTransCaixa.testeBoxGenW(sumStream4M);
        AbstractMap.SimpleEntry<Double, Double> avgArr_4M = UtilsTransCaixa.testeBoxGenW(avgArray4M);
        AbstractMap.SimpleEntry<Double, Double> avgDStr_4M = UtilsTransCaixa.testeBoxGenW(avgDoubleStream4M);
        AbstractMap.SimpleEntry<Double, Double> avgStr_4M = UtilsTransCaixa.testeBoxGenW(avgStream4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double, Double> sumArr_6M = UtilsTransCaixa.testeBoxGenW(sumArray6M);
        AbstractMap.SimpleEntry<Double, Double> sumDStr_6M = UtilsTransCaixa.testeBoxGenW(sumDoubleStream6M);
        AbstractMap.SimpleEntry<Double, Double> sumStr_6M = UtilsTransCaixa.testeBoxGenW(sumStream6M);
        AbstractMap.SimpleEntry<Double, Double> avgArr_6M = UtilsTransCaixa.testeBoxGenW(avgArray6M);
        AbstractMap.SimpleEntry<Double, Double> avgDStr_6M = UtilsTransCaixa.testeBoxGenW(avgDoubleStream6M);
        AbstractMap.SimpleEntry<Double, Double> avgStr_6M = UtilsTransCaixa.testeBoxGenW(avgStream6M);

        try{
            PrintWriter outFile = new PrintWriter(new File("resultsTeste1.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Operacao; Tipo; No.Casos; Tempo; Tamanho/Resultado \n");
            sb.append("Soma").append(";").append("Array").append(";").append("1M").append(";").append(sumArr_1M.getKey().doubleValue()).append(";").append(sumArr_1M.getValue().doubleValue()).append("\n");
            sb.append("Soma").append(";").append("Double Stream").append(";").append("1M").append(";").append(sumDStr_1M.getKey().doubleValue()).append(";").append(sumDStr_1M.getValue().doubleValue()).append("\n");
            sb.append("Soma").append(";").append("Stream").append(";").append("1M").append(";").append(sumStr_1M.getKey().doubleValue()).append(";").append(sumStr_1M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Array").append(";").append("1M").append(";").append(avgArr_1M.getKey().doubleValue()).append(";").append(avgArr_1M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Double Stream").append(";").append("1M").append(";").append(avgDStr_1M.getKey().doubleValue()).append(";").append(avgDStr_1M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Stream").append(";").append("1M").append(";").append(avgStr_1M.getKey().doubleValue()).append(";").append(avgStr_1M.getValue().doubleValue()).append("\n");

            sb.append("Soma").append(";").append("Array").append(";").append("2M").append(";").append(sumArr_2M.getKey().doubleValue()).append(";").append(sumArr_2M.getValue().doubleValue()).append("\n");
            sb.append("Soma").append(";").append("Double Stream").append(";").append("2M").append(";").append(sumDStr_2M.getKey().doubleValue()).append(";").append(sumDStr_2M.getValue().doubleValue()).append("\n");
            sb.append("Soma").append(";").append("Stream").append(";").append("2M").append(";").append(sumStr_2M.getKey().doubleValue()).append(";").append(sumStr_2M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Array").append(";").append("2M").append(";").append(avgArr_2M.getKey().doubleValue()).append(";").append(avgArr_2M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Double Stream").append(";").append("2M").append(";").append(avgDStr_2M.getKey().doubleValue()).append(";").append(avgDStr_2M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Stream").append(";").append("2M").append(";").append(avgStr_2M.getKey().doubleValue()).append(";").append(avgStr_2M.getValue().doubleValue()).append("\n");

            sb.append("Soma").append(";").append("Array").append(";").append("4M").append(";").append(sumArr_4M.getKey().doubleValue()).append(";").append(sumArr_4M.getValue().doubleValue()).append("\n");
            sb.append("Soma").append(";").append("Double Stream").append(";").append("4M").append(";").append(sumDStr_4M.getKey().doubleValue()).append(";").append(sumDStr_4M.getValue().doubleValue()).append("\n");
            sb.append("Soma").append(";").append("Stream").append(";").append("4M").append(";").append(sumStr_4M.getKey().doubleValue()).append(";").append(sumStr_4M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Array").append(";").append("4M").append(";").append(avgArr_4M.getKey().doubleValue()).append(";").append(avgArr_4M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Double Stream").append(";").append("4M").append(";").append(avgDStr_4M.getKey().doubleValue()).append(";").append(avgDStr_4M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Stream").append(";").append("4M").append(";").append(avgStr_4M.getKey().doubleValue()).append(";").append(avgStr_4M.getValue().doubleValue()).append("\n");

            sb.append("Soma").append(";").append("Array").append(";").append("6M").append(";").append(sumArr_6M.getKey().doubleValue()).append(";").append(sumArr_6M.getValue().doubleValue()).append("\n");
            sb.append("Soma").append(";").append("Double Stream").append(";").append("6M").append(";").append(sumDStr_6M.getKey().doubleValue()).append(";").append(sumDStr_6M.getValue().doubleValue()).append("\n");
            sb.append("Soma").append(";").append("Stream").append(";").append("6M").append(";").append(sumStr_6M.getKey().doubleValue()).append(";").append(sumStr_6M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Array").append(";").append("6M").append(";").append(avgArr_6M.getKey().doubleValue()).append(";").append(avgArr_6M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Double Stream").append(";").append("6M").append(";").append(avgDStr_6M.getKey().doubleValue()).append(";").append(avgDStr_6M.getValue().doubleValue()).append("\n");
            sb.append("Media").append(";").append("Stream").append(";").append("6M").append(";").append(avgStr_6M.getKey().doubleValue()).append(";").append(avgStr_6M.getValue().doubleValue()).append("\n");

            outFile.write(sb.toString());
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static Supplier<Double> sumArray1M = () -> {
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

    public static Supplier<Double> sumArray2M = () -> {
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

    public static Supplier<Double> sumArray4M = () -> {
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

    public static Supplier<Double> sumArray6M = () -> {
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


    public static Supplier<Double> avgArray1M = () -> {
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

    public static Supplier<Double> avgArray2M = () -> {
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

    public static Supplier<Double> avgArray4M = () -> {
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

    public static Supplier<Double> avgArray6M = () -> {
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
}
