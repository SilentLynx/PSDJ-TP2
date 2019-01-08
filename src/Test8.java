import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.AbstractMap;
import java.util.List;
import java.util.function.Supplier;

public class Test8 {

    public static void execute()
    {
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double,String> test08stream_1M = UtilsTransCaixa.testeBoxGenW(teste08Stream_1M);
        AbstractMap.SimpleEntry<Double,String> test08_1M = UtilsTransCaixa.testeBoxGenW(teste08_1M);

        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double,String> test08stream_2M = UtilsTransCaixa.testeBoxGenW(teste08Stream_2M);
        AbstractMap.SimpleEntry<Double,String> test08_2M = UtilsTransCaixa.testeBoxGenW(teste08_2M);

        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double,String> test08stream_4M = UtilsTransCaixa.testeBoxGenW(teste08Stream_4M);
        AbstractMap.SimpleEntry<Double,String> test08_4M = UtilsTransCaixa.testeBoxGenW(teste08_4M);

        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double,String> test08stream_6M = UtilsTransCaixa.testeBoxGenW(teste08Stream_6M);
        AbstractMap.SimpleEntry<Double,String> test08_6M = UtilsTransCaixa.testeBoxGenW(teste08_6M);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsTests8.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Versao do Java; Tamanho Input; Tempo; Tamanho/Resultado \n");
            sb.append("7").append(";").append("1M").append(";").append(test08_1M.getKey().doubleValue()).append(";").append(test08_1M.getValue()).append("\n");
            sb.append("8").append(";").append("1M").append(";").append(test08stream_1M.getKey().doubleValue()).append(";").append(test08stream_1M.getValue()).append("\n");

            sb.append("7").append(";").append("2M").append(";").append(test08_2M.getKey().doubleValue()).append(";").append(test08_2M.getValue()).append("\n");
            sb.append("8").append(";").append("2M").append(";").append(test08stream_2M.getKey().doubleValue()).append(";").append(test08stream_2M.getValue()).append("\n");

            sb.append("7").append(";").append("4M").append(";").append(test08_4M.getKey().doubleValue()).append(";").append(test08_4M.getValue()).append("\n");
            sb.append("8").append(";").append("4M").append(";").append(test08stream_4M.getKey().doubleValue()).append(";").append(test08stream_4M.getValue()).append("\n");

            sb.append("7").append(";").append("6M").append(";").append(test08_6M.getKey().doubleValue()).append(";").append(test08_6M.getValue()).append("\n");
            sb.append("8").append(";").append("6M").append(";").append(test08stream_6M.getKey().doubleValue()).append(";").append(test08stream_6M.getValue()).append("\n");

            outFile.write(sb.toString());
            outFile.close();
        }
        catch(IOException e){
            System.out.println("ERRO!");
        }
    }

    public static Supplier<String> teste08_1M = () -> {
        String cod = null;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        double valor = 0.0;
        LocalDate data = LocalDate.of(2017,6,27); // T6888841/24/81.35/27:6:2017T17:36

        for(TransCaixa t : ltc)
        {
            if(t.getData().toLocalDate().isEqual(data));
            {
                if(t.getData().getHour() >= 16 && t.getData().getHour() <= 22)
                {
                    if(t.getValor() > valor)
                    {
                        valor = t.getValor();
                        cod = t.getTrans();
                    }
                }
            }
        }

        return cod;
    };

    public static Supplier<String> teste08Stream_1M = () -> {
        String cod;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa1M.txt");
        LocalDate data = LocalDate.of(2017,6,27); // T6888841/24/81.35/27:6:2017T17:36

        cod = ltc.stream().filter(t -> t.getData().toLocalDate().isEqual(data))
                .filter(t -> t.getData().getHour() <= 22)
                .filter(t -> t.getData().getHour() >= 16)// && t.getData().getHour() >= 16 && t.getData().getHour() <= 22)
                .max(TransCaixaComparator.transPorValor)
                .map(t -> t.getTrans()).toString();


        return cod;
    };

    public static Supplier<String> teste08_2M = () -> {
        String cod = null;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");
        double valor = 0.0;
        LocalDate data = LocalDate.of(2017,10,25); // T1075158/48/3.82/25:10:2017T19:0

        for(TransCaixa t : ltc)
        {
            if(t.getData().toLocalDate().isEqual(data))
            {
                if(t.getData().getHour() >= 16 && t.getData().getHour() <= 22)
                {
                    if(t.getValor() > valor)
                    {
                        valor = t.getValor();
                        cod = t.getTrans();
                    }
                }
            }
        }

        return cod;
    };

    public static Supplier<String> teste08Stream_2M = () -> {
        String cod;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa2M.txt");
        LocalDate data = LocalDate.of(2017,10,25);

        cod = ltc.stream().filter(t -> t.getData().toLocalDate().isEqual(data))
                .filter(t -> t.getData().getHour() <= 22)
                .filter(t -> t.getData().getHour() >= 16)// && t.getData().getHour() >= 16 && t.getData().getHour() <= 22)
                .max(TransCaixaComparator.transPorValor)
                .map(t -> t.getTrans()).toString();

        return cod;
    };

    public static Supplier<String> teste08_4M = () -> {
        String cod = null;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");
        double valor = 0.0;
        LocalDate data = LocalDate.of(2017,12,19); // T3599778/6/62.62/19:12:2017T16:59

        for(TransCaixa t : ltc)
        {
            if(t.getData().toLocalDate().isEqual(data))
            {
                if(t.getData().getHour() >= 16 && t.getData().getHour() <= 22)
                {
                    if(t.getValor() > valor)
                    {
                        valor = t.getValor();
                        cod = t.getTrans();
                    }
                }
            }
        }

        return cod;
    };

    public static Supplier<String> teste08Stream_4M = () -> {
        String cod;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa4M.txt");
        LocalDate data = LocalDate.of(2017,12,19);

        cod = ltc.stream().filter(t -> t.getData().toLocalDate().isEqual(data))
                .filter(t -> t.getData().getHour() <= 22)
                .filter(t -> t.getData().getHour() >= 16)// && t.getData().getHour() >= 16 && t.getData().getHour() <= 22)
                .max(TransCaixaComparator.transPorValor)
                .map(t -> t.getTrans()).toString();

        return cod;
    };

    public static Supplier<String> teste08_6M = () -> {
        String cod = null;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");
        double valor = 0.0;
        LocalDate data = LocalDate.of(2017,10,5); // T1060519/7/16.94/5:10:2017T17:27

        for(TransCaixa t : ltc)
        {
            if(t.getData().toLocalDate().isEqual(data))
            {
                if(t.getData().getHour() >= 16 && t.getData().getHour() <= 22)
                {
                    if(t.getValor() > valor)
                    {
                        valor = t.getValor();
                        cod = t.getTrans();
                    }
                }
            }
        }

        return cod;
    };

    public static Supplier<String> teste08Stream_6M = () -> {
        String cod;
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("TransCaixa6M.txt");
        LocalDate data = LocalDate.of(2017,10,5);

        cod = ltc.stream().filter(t -> t.getData().toLocalDate().isEqual(data))
                .filter(t -> t.getData().getHour() <= 22)
                .filter(t -> t.getData().getHour() >= 16)// && t.getData().getHour() >= 16 && t.getData().getHour() <= 22)
                .max(TransCaixaComparator.transPorValor)
                .map(t -> t.getTrans()).toString();

        return cod;
    };

}
