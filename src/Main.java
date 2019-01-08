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
            case 5:
                System.out.println("Executando teste 5...");
                Test5.execute();
                break;
            case 6:
                System.out.println("Executando teste 6...");
                Test6.execute();
                break;
            case 7:
                System.out.println("Executando teste 7...");
                Test7.execute();
                break;
            case 8:
                System.out.println("Executando teste 8...");
                Test8.execute();
                break;
            case 9 :
                System.out.println("Executando teste 9...");
                Test9.execute();
                break;
            case 10:
                System.out.println("Executando teste 10...");
                Test10.execute();
                break;
            default: System.out.println("Número de teste inválido");
        }


        /*
        // Perguntas 5,6,7,8

        AbstractMap.SimpleEntry<Double,Double> test07stream = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetStream);
        AbstractMap.SimpleEntry<Double,Double> test07parallel = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetParallel);
        AbstractMap.SimpleEntry<Double,Double> test07fe = UtilsTransCaixa.testeBoxGenW(Tests.teste07SetFE);
        AbstractMap.SimpleEntry<Double,String> test08stream = UtilsTransCaixa.testeBoxGenW(Tests.teste08Stream);
        AbstractMap.SimpleEntry<Double,String> test08 = UtilsTransCaixa.testeBoxGenW(Tests.teste08);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsLists.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Pergunta; Tipo; Tempo; Tamanho/Resultado \n");

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
