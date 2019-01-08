import java.util.AbstractMap;

public class Test7 {

    public static void execute()
    {
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_1M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetStream);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_1M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetParallel);
        AbstractMap.SimpleEntry<Double,Double> test07fe_1M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetFE);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_2M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetStream);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_2M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetParallel);
        AbstractMap.SimpleEntry<Double,Double> test07fe_2M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetFE);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_4M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetStream);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_4M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetParallel);
        AbstractMap.SimpleEntry<Double,Double> test07fe_4M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetFE);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double,Double> test07stream_6M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetStream);
        AbstractMap.SimpleEntry<Double,Double> test07parallel_6M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetParallel);
        AbstractMap.SimpleEntry<Double,Double> test07fe_6M = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetFE);

    }
}
