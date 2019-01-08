import java.util.*;

public class Main {

    public static void main(String[] args){

        UtilsTransCaixa.specifications();

        System.out.print("\n\nEscolha o teste para correr (1-10/12): ");
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
            case 12:
                System.out.println("Executando teste 12...");
                Test12.execute();
                break;
            default: System.out.println("Número de teste inválido");
        }

        //Test3_1.execute();
    }
}
