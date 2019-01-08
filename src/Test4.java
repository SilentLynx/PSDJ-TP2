import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Test4 {

    public static void execute(){
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, double[]> teste4MS_1M = UtilsTransCaixa.testeBoxGenW(teste4MethodStreams1M);
        AbstractMap.SimpleEntry<Double, double[]> teste4BS_1M = UtilsTransCaixa.testeBoxGenW(teste4BiFStreams1M);
        AbstractMap.SimpleEntry<Double, double[]> teste4LS_1M = UtilsTransCaixa.testeBoxGenW(teste4LambdaStreams1M);
        AbstractMap.SimpleEntry<Double, double[]> teste4MPS_1M = UtilsTransCaixa.testeBoxGenW(teste4MethodParStreams1M);
        AbstractMap.SimpleEntry<Double, double[]> teste4BPS_1M = UtilsTransCaixa.testeBoxGenW(teste4BiFParStreams1M);
        AbstractMap.SimpleEntry<Double, double[]> teste4LPS_1M = UtilsTransCaixa.testeBoxGenW(teste4LambdaParStreams1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double, double[]> teste4MS_2M = UtilsTransCaixa.testeBoxGenW(teste4MethodStreams2M);
        AbstractMap.SimpleEntry<Double, double[]> teste4BS_2M = UtilsTransCaixa.testeBoxGenW(teste4BiFStreams2M);
        AbstractMap.SimpleEntry<Double, double[]> teste4LS_2M = UtilsTransCaixa.testeBoxGenW(teste4LambdaStreams2M);
        AbstractMap.SimpleEntry<Double, double[]> teste4MPS_2M = UtilsTransCaixa.testeBoxGenW(teste4MethodParStreams2M);
        AbstractMap.SimpleEntry<Double, double[]> teste4BPS_2M = UtilsTransCaixa.testeBoxGenW(teste4BiFParStreams2M);
        AbstractMap.SimpleEntry<Double, double[]> teste4LPS_2M = UtilsTransCaixa.testeBoxGenW(teste4LambdaParStreams2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double, double[]> teste4MS_4M = UtilsTransCaixa.testeBoxGenW(teste4MethodStreams4M);
        AbstractMap.SimpleEntry<Double, double[]> teste4BS_4M = UtilsTransCaixa.testeBoxGenW(teste4BiFStreams4M);
        AbstractMap.SimpleEntry<Double, double[]> teste4LS_4M = UtilsTransCaixa.testeBoxGenW(teste4LambdaStreams4M);
        AbstractMap.SimpleEntry<Double, double[]> teste4MPS_4M = UtilsTransCaixa.testeBoxGenW(teste4MethodParStreams4M);
        AbstractMap.SimpleEntry<Double, double[]> teste4BPS_4M = UtilsTransCaixa.testeBoxGenW(teste4BiFParStreams4M);
        AbstractMap.SimpleEntry<Double, double[]> teste4LPS_4M = UtilsTransCaixa.testeBoxGenW(teste4LambdaParStreams4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double, double[]> teste4MS_6M = UtilsTransCaixa.testeBoxGenW(teste4MethodStreams6M);
        AbstractMap.SimpleEntry<Double, double[]> teste4BS_6M = UtilsTransCaixa.testeBoxGenW(teste4BiFStreams6M);
        AbstractMap.SimpleEntry<Double, double[]> teste4LS_6M = UtilsTransCaixa.testeBoxGenW(teste4LambdaStreams6M);
        AbstractMap.SimpleEntry<Double, double[]> teste4MPS_6M = UtilsTransCaixa.testeBoxGenW(teste4MethodParStreams6M);
        AbstractMap.SimpleEntry<Double, double[]> teste4BPS_6M = UtilsTransCaixa.testeBoxGenW(teste4BiFParStreams6M);
        AbstractMap.SimpleEntry<Double, double[]> teste4LPS_6M = UtilsTransCaixa.testeBoxGenW(teste4LambdaParStreams6M);

        try{
            PrintWriter outFile = new PrintWriter(new File("resultsTeste4.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Multiplicador; Tipo de Streams; No.Casos; Tempo; Tamanho/Resultado \n");
            sb.append("Metodo").append(";").append("Sequencial").append(";").append("1M").append(";").append(teste4MS_1M.getKey().doubleValue()).append(";").append(teste4MS_1M.getValue()).append("\n");
            sb.append("BiFunctor").append(";").append("Sequencial").append(";").append("1M").append(";").append(teste4BS_1M.getKey().doubleValue()).append(";").append(teste4BS_1M.getValue()).append("\n");
            sb.append("Lambda").append(";").append("Sequencial").append(";").append("1M").append(";").append(teste4LS_1M.getKey().doubleValue()).append(";").append(teste4LS_1M.getValue()).append("\n");
            sb.append("Metodo").append(";").append("Paralela").append(";").append("1M").append(";").append(teste4MPS_1M.getKey().doubleValue()).append(";").append(teste4MPS_1M.getValue()).append("\n");
            sb.append("BiFunctor").append(";").append("Paralela").append(";").append("1M").append(";").append(teste4BPS_1M.getKey().doubleValue()).append(";").append(teste4BPS_1M.getValue()).append("\n");
            sb.append("Lambda").append(";").append("Paralela").append(";").append("1M").append(";").append(teste4LPS_1M.getKey().doubleValue()).append(";").append(teste4LPS_1M.getValue()).append("\n");

            sb.append("Metodo").append(";").append("Sequencial").append(";").append("2M").append(";").append(teste4MS_2M.getKey().doubleValue()).append(";").append(teste4MS_2M.getValue()).append("\n");
            sb.append("BiFunctor").append(";").append("Sequencial").append(";").append("2M").append(";").append(teste4BS_2M.getKey().doubleValue()).append(";").append(teste4BS_2M.getValue()).append("\n");
            sb.append("Lambda").append(";").append("Sequencial").append(";").append("2M").append(";").append(teste4LS_2M.getKey().doubleValue()).append(";").append(teste4LS_2M.getValue()).append("\n");
            sb.append("Metodo").append(";").append("Paralela").append(";").append("2M").append(";").append(teste4MPS_2M.getKey().doubleValue()).append(";").append(teste4MPS_2M.getValue()).append("\n");
            sb.append("BiFunctor").append(";").append("Paralela").append(";").append("2M").append(";").append(teste4BPS_2M.getKey().doubleValue()).append(";").append(teste4BPS_2M.getValue()).append("\n");
            sb.append("Lambda").append(";").append("Paralela").append(";").append("2M").append(";").append(teste4LPS_2M.getKey().doubleValue()).append(";").append(teste4LPS_2M.getValue()).append("\n");

            sb.append("Metodo").append(";").append("Sequencial").append(";").append("4M").append(";").append(teste4MS_4M.getKey().doubleValue()).append(";").append(teste4MS_4M.getValue()).append("\n");
            sb.append("BiFunctor").append(";").append("Sequencial").append(";").append("4M").append(";").append(teste4BS_4M.getKey().doubleValue()).append(";").append(teste4BS_4M.getValue()).append("\n");
            sb.append("Lambda").append(";").append("Sequencial").append(";").append("4M").append(";").append(teste4LS_4M.getKey().doubleValue()).append(";").append(teste4LS_4M.getValue()).append("\n");
            sb.append("Metodo").append(";").append("Paralela").append(";").append("4M").append(";").append(teste4MPS_4M.getKey().doubleValue()).append(";").append(teste4MPS_4M.getValue()).append("\n");
            sb.append("BiFunctor").append(";").append("Paralela").append(";").append("4M").append(";").append(teste4BPS_4M.getKey().doubleValue()).append(";").append(teste4BPS_4M.getValue()).append("\n");
            sb.append("Lambda").append(";").append("Paralela").append(";").append("4M").append(";").append(teste4LPS_4M.getKey().doubleValue()).append(";").append(teste4LPS_4M.getValue()).append("\n");

            sb.append("Metodo").append(";").append("Sequencial").append(";").append("6M").append(";").append(teste4MS_6M.getKey().doubleValue()).append(";").append(teste4MS_6M.getValue()).append("\n");
            sb.append("BiFunctor").append(";").append("Sequencial").append(";").append("6M").append(";").append(teste4BS_6M.getKey().doubleValue()).append(";").append(teste4BS_6M.getValue()).append("\n");
            sb.append("Lambda").append(";").append("Sequencial").append(";").append("6M").append(";").append(teste4LS_6M.getKey().doubleValue()).append(";").append(teste4LS_6M.getValue()).append("\n");
            sb.append("Metodo").append(";").append("Paralela").append(";").append("6M").append(";").append(teste4MPS_6M.getKey().doubleValue()).append(";").append(teste4MPS_6M.getValue()).append("\n");
            sb.append("BiFunctor").append(";").append("Paralela").append(";").append("6M").append(";").append(teste4BPS_6M.getKey().doubleValue()).append(";").append(teste4BPS_6M.getValue()).append("\n");
            sb.append("Lambda").append(";").append("Paralela").append(";").append("6M").append(";").append(teste4LPS_6M.getKey().doubleValue()).append(";").append(teste4LPS_6M.getValue()).append("\n");

            outFile.write(sb.toString());
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    public static double mult(double i, double j){
        return i * j;
    }

    public static BiFunction<Double, Double,Double> bi = (i, j) -> {
        return i * j;
    };

    public static Teste4Lambda lambda = (i, j) -> i * j;

    public static Supplier<double[]> teste4MethodStreams1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.stream().mapToDouble(tc -> mult(tc.getValor(), tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4BiFStreams1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.stream().mapToDouble(tc -> bi.apply(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4LambdaStreams1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> lambda.mult(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4MethodParStreams1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> mult(tc.getValor(), tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4BiFParStreams1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> bi.apply(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4LambdaParStreams1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> lambda.mult(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4MethodStreams2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

        double[] d = ltc.stream().mapToDouble(tc -> mult(tc.getValor(), tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4BiFStreams2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

        double[] d = ltc.stream().mapToDouble(tc -> bi.apply(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4LambdaStreams2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> lambda.mult(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4MethodParStreams2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> mult(tc.getValor(), tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4BiFParStreams2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> bi.apply(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4LambdaParStreams2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> lambda.mult(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4MethodStreams4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

        double[] d = ltc.stream().mapToDouble(tc -> mult(tc.getValor(), tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4BiFStreams4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

        double[] d = ltc.stream().mapToDouble(tc -> bi.apply(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4LambdaStreams4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> lambda.mult(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4MethodParStreams4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> mult(tc.getValor(), tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4BiFParStreams4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> bi.apply(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4LambdaParStreams4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> lambda.mult(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4MethodStreams6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

        double[] d = ltc.stream().mapToDouble(tc -> mult(tc.getValor(), tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4BiFStreams6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

        double[] d = ltc.stream().mapToDouble(tc -> bi.apply(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4LambdaStreams6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> lambda.mult(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4MethodParStreams6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> mult(tc.getValor(), tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4BiFParStreams6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> bi.apply(tc.getValor(),tc.getValor())).toArray();

        return d;
    };

    public static Supplier<double[]> teste4LambdaParStreams6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");

        double[] d = ltc.parallelStream().mapToDouble(tc -> lambda.mult(tc.getValor(),tc.getValor())).toArray();

        return d;
    };
}
