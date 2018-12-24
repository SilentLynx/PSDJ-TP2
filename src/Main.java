import java.io.*;
import java.util.AbstractMap;

public class Main {

    public static void main(String[] args){

        UtilsTransCaixa.specifications();

        AbstractMap.SimpleEntry<Double, Double> t1sA = UtilsTransCaixa.testeBoxGenW(Tests.sumArray);
        AbstractMap.SimpleEntry<Double, Double> t1sDS = UtilsTransCaixa.testeBoxGenW(Tests.sumDoubleStream);
        AbstractMap.SimpleEntry<Double, Double> t1sS = UtilsTransCaixa.testeBoxGenW(Tests.sumStream);

        try {
            PrintWriter outFile = new PrintWriter(new File("results.csv"));
            StringBuilder sb = new StringBuilder();
            sb.append("tempo;resultado\n");
            sb.append(t1sA.getKey().doubleValue()).append(";").append(t1sA.getValue().doubleValue());
            sb.append(t1sDS.getKey().doubleValue()).append(";").append(t1sDS.getValue().doubleValue());
            sb.append(t1sS.getKey().doubleValue()).append(";").append(t1sS.getValue().doubleValue());

           outFile.write(sb.toString());
           outFile.close();
        }
        catch(IOException e){
            System.out.println("ERRO!");
        }

    }
}
