import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.AbstractMap;

public class Main {

    public static void main(String[] args){

        UtilsTransCaixa.specifications();

        AbstractMap.SimpleEntry<Double, Double> t1 = UtilsTransCaixa.testeBoxGenW(Tests.teste1Array);

        try {
            FileOutputStream outFile = new FileOutputStream("results.csv");
            ObjectOutputStream out = new ObjectOutputStream(outFile);
            out.writeChars("tempo;resultado\n"+t1.getKey()+";"+t1.getValue());
            out.flush();
            out.close();
        }
        catch(IOException e){
            System.out.println("ERRO!");
        }

    }
}
