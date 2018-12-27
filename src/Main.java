import java.io.*;
import java.time.DayOfWeek;
import java.time.Month;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public class Main {

    public static void main(String[] args){

        UtilsTransCaixa.specifications();

        // Perguntas 1,2,3,4
        //AbstractMap.SimpleEntry<Double, Double> t1sA = UtilsTransCaixa.testeBoxGenW(Tests.sumArray);
        //AbstractMap.SimpleEntry<Double, Double> t1sDS = UtilsTransCaixa.testeBoxGenW(Tests.sumDoubleStream);
        //AbstractMap.SimpleEntry<Double, Double> t1sS = UtilsTransCaixa.testeBoxGenW(Tests.sumStream);

        // Perguntas 5,6,7,8
        AbstractMap.SimpleEntry<Double, List<TransCaixa>> test05List = UtilsTransCaixa.testeBoxGenW(Tests.teste5List);
        AbstractMap.SimpleEntry<Double, SortedSet<TransCaixa>> test05Tree = UtilsTransCaixa.testeBoxGenW(Tests.teste5Tree);
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06Original = UtilsTransCaixa.testeBoxGenW(Tests.teste6Original);
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06Java7 = UtilsTransCaixa.testeBoxGenW(Tests.teste6Java7);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06SemanaJava8 = UtilsTransCaixa.testeBoxGenW(Tests.teste6Semana);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06SemanaJava7 = UtilsTransCaixa.testeBoxGenW(Tests.teste6SemanaFor);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsLists.csv"));
            StringBuilder sb = new StringBuilder();

            // Resultados perguntas 1,2,3,4
            // sb.append("Tempo; Resultados \n");
            //sb.append(t1sA.getKey().doubleValue()).append(";").append(t1sA.getValue().doubleValue());
            //sb.append(t1sDS.getKey().doubleValue()).append(";").append(t1sDS.getValue().doubleValue());
            //sb.append(t1sS.getKey().doubleValue()).append(";").append(t1sS.getValue().doubleValue());

            // Resultados perguntas 5,6,7,8
            sb.append("Pergunta; Tipo; Tempo; Tamanho \n");
            sb.append("5").append(";").append("List").append(";").append(test05List.getKey().doubleValue()).append(";").append(test05List.getValue().size()).append("\n");
            sb.append("5").append(";").append("Sorted Tree").append(";").append(test05Tree.getKey().doubleValue()).append(";").append(test05Tree.getValue().size()).append("\n");
            sb.append("6").append(";").append("Original").append(";").append(test06Original.getKey().doubleValue()).append(";").append(test06Original.getValue().size()).append("\n");
            sb.append("6").append(";").append("Java 7").append(";").append(test06Java7.getKey().doubleValue()).append(";").append(test06Java7.getValue().size()).append("\n");
            sb.append("6 -> Semana").append(";").append("Java 7").append(";").append(test06SemanaJava7.getKey().doubleValue()).append(";").append(test06SemanaJava7.getValue().size()).append("\n");
            sb.append("6 -> Semana").append(";").append("Java 8").append(";").append(test06SemanaJava8.getKey().doubleValue()).append(";").append(test06SemanaJava8.getValue().size()).append("\n");


           outFile.write(sb.toString());
           outFile.close();
        }
        catch(IOException e){
            System.out.println("ERRO!");
        }

    }
}
