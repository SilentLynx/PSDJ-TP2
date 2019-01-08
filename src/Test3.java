import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Test3 {

    public static void execute(){

        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, int[]> teste3Arr_1M = UtilsTransCaixa.testeBoxGenW(teste3Array1M);
        AbstractMap.SimpleEntry<Double, List> teste3L_1M = UtilsTransCaixa.testeBoxGenW(teste3List1M);
        AbstractMap.SimpleEntry<Double, IntStream> teste3IS_1M = UtilsTransCaixa.testeBoxGenW(teste3IntStream1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double, int[]> teste3Arr_2M = UtilsTransCaixa.testeBoxGenW(teste3Array2M);
        AbstractMap.SimpleEntry<Double, List> teste3L_2M = UtilsTransCaixa.testeBoxGenW(teste3List2M);
        AbstractMap.SimpleEntry<Double, IntStream> teste3IS_2M = UtilsTransCaixa.testeBoxGenW(teste3IntStream2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double, int[]> teste3Arr_4M = UtilsTransCaixa.testeBoxGenW(teste3Array4M);
        AbstractMap.SimpleEntry<Double, List> teste3L_4M = UtilsTransCaixa.testeBoxGenW(teste3List4M);
        AbstractMap.SimpleEntry<Double, IntStream> teste3IS_4M = UtilsTransCaixa.testeBoxGenW(teste3IntStream4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double, int[]> teste3Arr_6M = UtilsTransCaixa.testeBoxGenW(teste3Array6M);
        AbstractMap.SimpleEntry<Double, List> teste3L_6M = UtilsTransCaixa.testeBoxGenW(teste3List6M);
        AbstractMap.SimpleEntry<Double, IntStream> teste3IS_6M = UtilsTransCaixa.testeBoxGenW(teste3IntStream6M);

        try{
            PrintWriter outFile = new PrintWriter(new File("resultsTeste3.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Tipo de dados; No.Casos; Tempo; Tamanho/Resultado \n");
            sb.append("Array").append(";").append("1M").append(";").append(teste3Arr_1M.getKey().doubleValue()).append(";").append(teste3Arr_1M.getValue()).append("\n");
            sb.append("Lista").append(";").append("1M").append(";").append(teste3L_1M.getKey().doubleValue()).append(";").append(teste3L_1M.getValue()).append("\n");
            sb.append("IntStreams").append(";").append("1M").append(";").append(teste3IS_1M.getKey().doubleValue()).append(";").append(teste3IS_1M.getValue()).append("\n");

            sb.append("Array").append(";").append("2M").append(";").append(teste3Arr_2M.getKey().doubleValue()).append(";").append(teste3Arr_2M.getValue()).append("\n");
            sb.append("Lista").append(";").append("2M").append(";").append(teste3L_2M.getKey().doubleValue()).append(";").append(teste3L_2M.getValue()).append("\n");
            sb.append("IntStreams").append(";").append("2M").append(";").append(teste3IS_2M.getKey().doubleValue()).append(";").append(teste3IS_2M.getValue()).append("\n");

            sb.append("Array").append(";").append("4M").append(";").append(teste3Arr_4M.getKey().doubleValue()).append(";").append(teste3Arr_4M.getValue()).append("\n");
            sb.append("Lista").append(";").append("4M").append(";").append(teste3L_4M.getKey().doubleValue()).append(";").append(teste3L_4M.getValue()).append("\n");
            sb.append("IntStreams").append(";").append("4M").append(";").append(teste3IS_4M.getKey().doubleValue()).append(";").append(teste3IS_4M.getValue()).append("\n");

            sb.append("Array").append(";").append("6M").append(";").append(teste3Arr_6M.getKey().doubleValue()).append(";").append(teste3Arr_6M.getValue()).append("\n");
            sb.append("Lista").append(";").append("6M").append(";").append(teste3L_6M.getKey().doubleValue()).append(";").append(teste3L_6M.getValue()).append("\n");
            sb.append("IntStreams").append(";").append("6M").append(";").append(teste3IS_6M.getKey().doubleValue()).append(";").append(teste3IS_6M.getValue()).append("\n");

            outFile.write(sb.toString());
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
    public static Supplier<int[]> teste3Array1M = () -> {
        int size = 1000000;
        int[] d = new int[size];
        Random r = new Random();


        for(int i = 0; i < size; i++){
            do
                d[i] = r.nextInt(10000);
            while(d[i] == 0);
        }

        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(d[j] == d[i]){
                    for(int k = j; k < size - 1; k++)
                        d[k] = d[k + 1];
                    size--;
                }
            }
        }

        int[] ret = new int[size];
        System.arraycopy(d, 0, ret, 0, size);

        return ret;
    };*/

    public static Supplier<int[]> teste3Array1M = () -> {
        int size = 1000000;
        int[] d = new int[size];
        Random r = new Random();


        for(int i = 0; i < size; i++){
            do
                d[i] = r.nextInt(10000);
            while(d[i] == 0);
        }

        int[] ret = Arrays.stream(d).distinct().toArray();

        return ret;
    };

    public static Supplier<List> teste3List1M = () -> {
        List<Integer> l = new ArrayList<>(1000000);
        Random r = new Random();
        int j;

        for(int i = 0; i < 1000000; i++) {
            do
                j = r.nextInt(10000);
            while (j == 0);
            l.add(j);
        }

        l = new ArrayList<>(new TreeSet<>(l));

        return l;
    };

    public static Supplier<IntStream> teste3IntStream1M = () -> {
        IntStream s = new Random().ints(1000000, 1, 10000);

        s.distinct();

        return s;
    };

    public static Supplier<int[]> teste3Array2M = () -> {
        int size = 2000000;
        int[] d = new int[size];
        Random r = new Random();


        for(int i = 0; i < size; i++){
            do
                d[i] = r.nextInt(10000);
            while(d[i] == 0);
        }

        int[] ret = Arrays.stream(d).distinct().toArray();

        return ret;
    };

    public static Supplier<List> teste3List2M = () -> {
        List<Integer> l = new ArrayList<>(2000000);
        Random r = new Random();
        int j;

        for(int i = 0; i < 2000000; i++) {
            do
                j = r.nextInt(10000);
            while (j == 0);
            l.add(j);
        }

        l = new ArrayList<>(new TreeSet<>(l));

        return l;
    };

    public static Supplier<IntStream> teste3IntStream2M = () -> {
        IntStream s = new Random().ints(2000000, 1, 10000);

        s.distinct();

        return s;
    };

    public static Supplier<int[]> teste3Array4M = () -> {
        int size = 4000000;
        int[] d = new int[size];
        Random r = new Random();


        for(int i = 0; i < size; i++){
            do
                d[i] = r.nextInt(10000);
            while(d[i] == 0);
        }

        int[] ret = Arrays.stream(d).distinct().toArray();

        return ret;
    };

    public static Supplier<List> teste3List4M = () -> {
        List<Integer> l = new ArrayList<>(4000000);
        Random r = new Random();
        int j;

        for(int i = 0; i < 4000000; i++) {
            do
                j = r.nextInt(10000);
            while (j == 0);
            l.add(j);
        }

        l = new ArrayList<>(new TreeSet<>(l));

        return l;
    };

    public static Supplier<IntStream> teste3IntStream4M = () -> {
        IntStream s = new Random().ints(4000000, 1, 10000);

        s.distinct();

        return s;
    };

    public static Supplier<int[]> teste3Array6M = () -> {
        int size = 6000000;
        int[] d = new int[size];
        Random r = new Random();


        for(int i = 0; i < size; i++){
            do
                d[i] = r.nextInt(10000);
            while(d[i] == 0);
        }

        int[] ret = Arrays.stream(d).distinct().toArray();

        return ret;
    };

    public static Supplier<List> teste3List6M = () -> {
        List<Integer> l = new ArrayList<>(6000000);
        Random r = new Random();
        int j;

        for(int i = 0; i < 6000000; i++) {
            do
                j = r.nextInt(10000);
            while (j == 0);
            l.add(j);
        }

        l = new ArrayList<>(new TreeSet<>(l));

        return l;
    };

    public static Supplier<IntStream> teste3IntStream6M = () -> {
        IntStream s = new Random().ints(6000000, 1, 10000);

        s.distinct();

        return s;
    };
}
