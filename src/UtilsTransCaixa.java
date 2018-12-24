import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class UtilsTransCaixa {

    public static <R> AbstractMap.SimpleEntry<Double,R> testeBoxGenW(Supplier<? extends R> supplier)  {
        // com warmup de 5 runs
        for(int i = 1 ; i <= 10; i++) supplier.get();
        System.gc();
        Crono.start();
        R resultado = supplier.get();
        Double tempo = Crono.stop();
        return new AbstractMap.SimpleEntry<Double,R>(tempo, resultado);
    }

    public static TransCaixa strToTransCaixa(String linha) {
        //
        double preco = 0.0;
        int ano = 0; int mes = 0; int dia = 0;
        int hora = 0; int min = 0; int seg = 0;
        String codTrans, codCaixa;
        // split()
        String[] campos = linha.split("/");
        codTrans = campos[0].trim();
        codCaixa = campos[1].trim();
        try {
            preco = Double.parseDouble(campos[2]);
        }
        catch(InputMismatchException | NumberFormatException e) { return null; }
        String[] diaMesAnoHMS = campos[3].split("T");
        String[] diaMesAno = diaMesAnoHMS[0].split(":");
        String[] horasMin = diaMesAnoHMS[1].split(":");
        try {
            dia = Integer.parseInt(diaMesAno[0]);
            mes = Integer.parseInt(diaMesAno[1]);
            ano = Integer.parseInt(diaMesAno[2]);
            hora = Integer.parseInt(horasMin[0]);
            min = Integer.parseInt(horasMin[1]);
        }
        catch(InputMismatchException | NumberFormatException e) { return null; }
        return TransCaixa.of(codTrans, codCaixa, preco, LocalDateTime.of(ano, mes, dia, hora, min, 0));
    }

    public static List<TransCaixa> setup(String nomeFich) {
        List<TransCaixa> ltc = new ArrayList<>();
        try (Stream<String> sTrans = Files.lines(Paths.get(nomeFich))) {
            ltc = sTrans.map(linha -> strToTransCaixa(linha)).collect(toList());
        }
        catch(IOException exc) { System.out.println(exc.getMessage()); }
        return ltc;
    }

        public static void specifications(){
            System.out.println("CPU's: " + Runtime.getRuntime().availableProcessors());
            ForkJoinPool fjPool = ForkJoinPool.commonPool();
            System.out.println("Max. JVM Threads: " + fjPool.getParallelism());
            System.out.println("Threads Potenciais: " + fjPool.getCommonPoolParallelism());
            System.out.println("Pool Size: " + fjPool.getPoolSize());
            
        }
}
