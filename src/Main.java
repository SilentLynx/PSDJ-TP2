import java.util.*;

public class Main {

    public static void main(String[] args){

        UtilsTransCaixa.specifications();

        System.out.print("\n\nEscolha o teste para correr (1-12): ");
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();

        switch(test){
            case 1:
                System.out.println("Executando teste 1...");
                Test1.execute();
                break;
            case 2:
                System.out.println("Executando teste 2...");
                Test2.execute();
                break;
            case 3:
                System.out.println("Executando teste 3...");
                Test3.execute();
                break;
            case 4:
                System.out.println("Executando teste 4...");
                Test4.execute();
                break;
            default: System.out.println("Número de teste inválido");
        }


        /*
        // Perguntas 5,6,7,8
        AbstractMap.SimpleEntry<Double, List<TransCaixa>> test05List = UtilsTransCaixa.testeBoxGenW(Tests.teste5List);
        AbstractMap.SimpleEntry<Double, SortedSet<TransCaixa>> test05Tree = UtilsTransCaixa.testeBoxGenW(Tests.teste5Tree);
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06Original = UtilsTransCaixa.testeBoxGenW(Tests.teste6Original);
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06Java7 = UtilsTransCaixa.testeBoxGenW(Tests.teste6Java7);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06SemanaJava8 = UtilsTransCaixa.testeBoxGenW(Tests.teste6Semana);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06SemanaJava7 = UtilsTransCaixa.testeBoxGenW(Tests.teste6SemanaFor);
        AbstractMap.SimpleEntry<Double,Double> test07stream = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetStream);
        AbstractMap.SimpleEntry<Double,Double> test07parallel = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetParallel);
        AbstractMap.SimpleEntry<Double,Double> test07fe = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetFE);
        AbstractMap.SimpleEntry<Double,String> test08stream = UtilsTransCaixa.testeBoxGenW(Tests.teste08Stream);
        AbstractMap.SimpleEntry<Double,String> test08 = UtilsTransCaixa.testeBoxGenW(Tests.teste08);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsLists.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Pergunta; Tipo; Tempo; Tamanho/Resultado \n");
            sb.append("1").append(";").append("Soma array").append(";").append(t1sA.getKey().doubleValue()).append(";").append(t1sA.getValue().doubleValue()).append("\n");
            sb.append("1").append(";").append("Double Stream").append(";").append(t1sDS.getKey().doubleValue()).append(";").append(t1sDS.getValue().doubleValue()).append("\n");
            sb.append("1").append(";").append("Stream").append(";").append(t1sS.getKey().doubleValue()).append(";").append(t1sS.getValue().doubleValue()).append("\n");
            sb.append("5").append(";").append("List").append(";").append(test05List.getKey().doubleValue()).append(";").append(test05List.getValue().size()).append("\n");
            sb.append("5").append(";").append("Sorted Tree").append(";").append(test05Tree.getKey().doubleValue()).append(";").append(test05Tree.getValue().size()).append("\n");
            sb.append("6").append(";").append("Original").append(";").append(test06Original.getKey().doubleValue()).append(";").append(test06Original.getValue().size()).append("\n");
            sb.append("6").append(";").append("Java 7").append(";").append(test06Java7.getKey().doubleValue()).append(";").append(test06Java7.getValue().size()).append("\n");
            sb.append("6 -> Semana").append(";").append("Java 7").append(";").append(test06SemanaJava7.getKey().doubleValue()).append(";").append(test06SemanaJava7.getValue().size()).append("\n");
            sb.append("6 -> Semana").append(";").append("Java 8").append(";").append(test06SemanaJava8.getKey().doubleValue()).append(";").append(test06SemanaJava8.getValue().size()).append("\n");
            sb.append("7").append(";").append("stream").append(";").append(test07stream.getKey().doubleValue()).append(";").append(test07stream.getValue().doubleValue()).append("\n");
            sb.append("7").append(";").append("Parallel stream").append(";").append(test07stream.getKey().doubleValue()).append(";").append(test07parallel.getValue().doubleValue()).append("\n");
            sb.append("7").append(";").append("For each").append(";").append(test07stream.getKey().doubleValue()).append(";").append(test07fe.getValue().doubleValue()).append("\n");
            sb.append("8").append(";").append("Ciclo for").append(";").append(test08.getKey().doubleValue()).append(";").append(test08.getValue()).append("\n");
            sb.append("8").append(";").append("Streams").append(";").append(test08stream.getKey().doubleValue()).append(";").append(test08stream.getValue()).append("\n");
            outFile.write(sb.toString());
           outFile.close();
        }
        catch(IOException e){
            System.out.println("ERRO!");
        }*/

    }
}
