import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Test3_1 {

    public static void execute(){

        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, int[]> teste3Arr_1M = UtilsTransCaixa.testeBoxGenW(teste3Array1M);

        try{
            PrintWriter outFile = new PrintWriter(new File("resultsTeste3_1.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Tipo de dados; No.Casos; Tempo; Tamanho/Resultado \n");
            sb.append("Array").append(";").append("1M").append(";").append(teste3Arr_1M.getKey().doubleValue()).append(";").append(teste3Arr_1M.getValue()).append("\n");

            outFile.write(sb.toString());
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Supplier<int[]> teste3Array1M = () -> {
        int size = 1000000;
        int[] d = new int[size];
        Random r = new Random();


        for(int i = 0; i < size; i++){
            do
                d[i] = r.nextInt(10000);
            while(d[i] == 0);
        }

        Arrays.sort(d);

        int[] uniq = new int[10000];
        uniq[0] = d[0];
        int j = 0;

        for(int i = 1; i < size; i++){
            if(d[i] != uniq[j]){
                j++;
                uniq[j] = d[i];
            }
        }

        int[] ret = new int[j];

        System.arraycopy(uniq, 0, ret, 0, j);

        return uniq;
    };

    /*public static Supplier<int[]> teste3Array1M = () -> {
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
    };*/

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
