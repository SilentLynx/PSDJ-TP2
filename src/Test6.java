import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.Month;
import java.util.*;
import java.util.function.Supplier;

import static java.util.stream.Collectors.groupingBy;

public class Test6 {

    public static void execute()
    {
        System.out.println("\tExecutando testes para 1M...");
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06VAula_1M = UtilsTransCaixa.testeBoxGenW(teste6Original_1M);
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06VJ7_1M = UtilsTransCaixa.testeBoxGenW(teste6Java7_1M);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06DayOfWeekJ8_1M = UtilsTransCaixa.testeBoxGenW(teste6Semana_1M);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06DayOfWeekJ7_1M = UtilsTransCaixa.testeBoxGenW(teste6SemanaFor_1M);


        System.out.println("\tExecutando testes para 2M...");
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06VAula_2M = UtilsTransCaixa.testeBoxGenW(teste6Original_2M);
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06VJ7_2M = UtilsTransCaixa.testeBoxGenW(teste6Java7_2M);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06DayOfWeekJ8_2M = UtilsTransCaixa.testeBoxGenW(teste6Semana_2M);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06DayOfWeekJ7_2M = UtilsTransCaixa.testeBoxGenW(teste6SemanaFor_2M);


        System.out.println("\tExecutando testes para 4M...");
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06VAula_4M = UtilsTransCaixa.testeBoxGenW(teste6Original_4M);
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06VJ7_4M = UtilsTransCaixa.testeBoxGenW(teste6Java7_4M);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06DayOfWeekJ8_4M = UtilsTransCaixa.testeBoxGenW(teste6Semana_4M);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06DayOfWeekJ7_4M = UtilsTransCaixa.testeBoxGenW(teste6SemanaFor_4M);


        System.out.println("\tExecutando testes para 6M...");
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06VAula_6M = UtilsTransCaixa.testeBoxGenW(teste6Original_6M);
        AbstractMap.SimpleEntry<Double, Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> test06VJ7_6M = UtilsTransCaixa.testeBoxGenW(teste6Java7_6M);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06DayOfWeekJ8_6M = UtilsTransCaixa.testeBoxGenW(teste6Semana_6M);
        AbstractMap.SimpleEntry<Double, Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> test06DayOfWeekJ7_6M = UtilsTransCaixa.testeBoxGenW(teste6SemanaFor_6M);

        try {
            PrintWriter outFile = new PrintWriter(new File("resultsTeste6.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Versao do Java; No.Casos; Tempo; Tamanho \n");
            sb.append("7").append(";").append("1M").append(";").append(test06VJ7_1M .getKey().doubleValue()).append(";").append(test06VJ7_1M.getValue().size()).append("\n");
            sb.append("8").append(";").append("1M").append(";").append(test06VAula_1M.getKey().doubleValue()).append(";").append(test06VAula_1M.getValue().size()).append("\n");
            sb.append("7 -> c/ DayOfWeek").append(";").append("1M").append(";").append(test06DayOfWeekJ7_1M.getKey().doubleValue()).append(";").append(test06DayOfWeekJ7_1M.getValue().size()).append("\n");
            sb.append("8 -> c/ DayOfWeek").append(";").append("1M").append(";").append(test06DayOfWeekJ8_1M.getKey().doubleValue()).append(";").append(test06DayOfWeekJ8_1M.getValue().size()).append("\n");

            sb.append("7").append(";").append("2M").append(";").append(test06VJ7_2M .getKey().doubleValue()).append(";").append(test06VJ7_2M.getValue().size()).append("\n");
            sb.append("8").append(";").append("2M").append(";").append(test06VAula_2M.getKey().doubleValue()).append(";").append(test06VAula_2M.getValue().size()).append("\n");
            sb.append("7 -> c/ DayOfWeek").append(";").append("2M").append(";").append(test06DayOfWeekJ7_2M.getKey().doubleValue()).append(";").append(test06DayOfWeekJ7_2M.getValue().size()).append("\n");
            sb.append("8 -> c/ DayOfWeek").append(";").append("2M").append(";").append(test06DayOfWeekJ8_2M.getKey().doubleValue()).append(";").append(test06DayOfWeekJ8_2M.getValue().size()).append("\n");

            sb.append("7").append(";").append("4M").append(";").append(test06VJ7_4M .getKey().doubleValue()).append(";").append(test06VJ7_4M.getValue().size()).append("\n");
            sb.append("8").append(";").append("4M").append(";").append(test06VAula_4M.getKey().doubleValue()).append(";").append(test06VAula_4M.getValue().size()).append("\n");
            sb.append("7 -> c/ DayOfWeek").append(";").append("4M").append(";").append(test06DayOfWeekJ7_4M.getKey().doubleValue()).append(";").append(test06DayOfWeekJ7_4M.getValue().size()).append("\n");
            sb.append("8 -> c/ DayOfWeek").append(";").append("4M").append(";").append(test06DayOfWeekJ8_4M.getKey().doubleValue()).append(";").append(test06DayOfWeekJ8_4M.getValue().size()).append("\n");

            sb.append("7").append(";").append("6M").append(";").append(test06VJ7_6M .getKey().doubleValue()).append(";").append(test06VJ7_6M.getValue().size()).append("\n");
            sb.append("8").append(";").append("6M").append(";").append(test06VAula_6M.getKey().doubleValue()).append(";").append(test06VAula_6M.getValue().size()).append("\n");
            sb.append("7 -> c/ DayOfWeek").append(";").append("6M").append(";").append(test06DayOfWeekJ7_6M.getKey().doubleValue()).append(";").append(test06DayOfWeekJ7_6M.getValue().size()).append("\n");
            sb.append("8 -> c/ DayOfWeek").append(";").append("6M").append(";").append(test06DayOfWeekJ8_6M.getKey().doubleValue()).append(";").append(test06DayOfWeekJ8_6M.getValue().size()).append("\n");

            outFile.write(sb.toString());
            outFile.close();
        }
        catch(IOException e){
            System.out.println("ERRO!");
        }
    }


    // 1M
    public static Supplier<Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> teste6Original_1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa1M.txt");
        Map<Month, Map<Integer, Map<Integer, List<TransCaixa>>>> mapaTxPorMDH =
                ltc.stream()
                        .collect(groupingBy(t -> t.getData().getMonth(),
                                groupingBy(t -> t.getData().getDayOfMonth(),
                                        groupingBy(t -> t.getData().getHour()))));

        return mapaTxPorMDH;
    };

    public static Supplier<Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> teste6Java7_1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa1M.txt");
        Map<Month, Map<Integer, Map<Integer, List<TransCaixa>>>> mapaTxPorMDH = new HashMap<>();

        for(TransCaixa t : ltc)
        {
            if(mapaTxPorMDH.containsKey(t.getData().getMonth()))
            {
                if(mapaTxPorMDH.get(t.getData().getMonth()).containsKey(t.getData().getDayOfMonth()))
                {
                    if(mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).containsKey(t.getData().getHour()))
                    {
                        mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).get(t.getData().getHour()).add(t.clone());
                    }
                    else
                    {
                        List<TransCaixa> lista = new ArrayList<>();
                        lista.add(t.clone());
                        mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).put(t.getData().getHour(), lista);
                    }
                }
                else
                {
                    List<TransCaixa> listaA = new ArrayList<>();
                    listaA.add(t.clone());
                    Map<Integer, List<TransCaixa>> map = new HashMap<>();
                    map.put(t.getData().getHour(),listaA);
                    mapaTxPorMDH.get(t.getData().getMonth()).put(t.getData().getDayOfMonth(), map);
                }
            }
            else
            {
                List<TransCaixa> listaB = new ArrayList<>();
                listaB.add(t.clone());
                Map<Integer, List<TransCaixa>> map = new HashMap<>();
                map.put(t.getData().getHour(),listaB);

                Map<Integer, Map<Integer, List<TransCaixa>>> mapAux = new HashMap<>();
                mapAux.put(t.getData().getDayOfMonth(), map);

                mapaTxPorMDH.put(t.getData().getMonth(),mapAux);
            }
        }

        return mapaTxPorMDH;
    };

    public static Supplier<Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> teste6Semana_1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa1M.txt");
        Map<DayOfWeek, Map<Integer, List<TransCaixa>>> mapaTxPorDH =
                ltc.stream()
                        .collect(groupingBy(t -> t.getData().getDayOfWeek(),
                                groupingBy(t -> t.getData().getHour())));

        return mapaTxPorDH;
    };

    public static Supplier<Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> teste6SemanaFor_1M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa1M.txt");
        Map<DayOfWeek, Map<Integer, List<TransCaixa>>> mapaTxPorDH = new HashMap<>();

        for(TransCaixa t : ltc)
        {
            if(mapaTxPorDH.containsKey(t.getData().getDayOfWeek()))
            {
                if(mapaTxPorDH.get(t.getData().getDayOfWeek()).containsKey(t.getData().getHour()))
                {
                    mapaTxPorDH.get(t.getData().getDayOfWeek()).get(t.getData().getHour()).add(t.clone());
                }
                else
                {
                    List<TransCaixa> lista = new ArrayList<>();
                    lista.add(t.clone());
                    mapaTxPorDH.get(t.getData().getDayOfWeek()).put(t.getData().getHour(), lista);
                }
            }
            else
            {
                List<TransCaixa> listaA = new ArrayList<>();
                listaA.add(t.clone()); // lista

                Map<Integer, List<TransCaixa>> map = new HashMap<>(); // Hora, Lista
                map.put(t.getData().getHour(), listaA);

                mapaTxPorDH.put(t.getData().getDayOfWeek(), map);
            }
        }

        return mapaTxPorDH;
    };

    // 2M
    public static Supplier<Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> teste6Original_2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa2M.txt");
        Map<Month, Map<Integer, Map<Integer, List<TransCaixa>>>> mapaTxPorMDH =
                ltc.stream()
                        .collect(groupingBy(t -> t.getData().getMonth(),
                                groupingBy(t -> t.getData().getDayOfMonth(),
                                        groupingBy(t -> t.getData().getHour()))));

        return mapaTxPorMDH;
    };

    public static Supplier<Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> teste6Java7_2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa2M.txt");
        Map<Month, Map<Integer, Map<Integer, List<TransCaixa>>>> mapaTxPorMDH = new HashMap<>();

        for(TransCaixa t : ltc)
        {
            if(mapaTxPorMDH.containsKey(t.getData().getMonth()))
            {
                if(mapaTxPorMDH.get(t.getData().getMonth()).containsKey(t.getData().getDayOfMonth()))
                {
                    if(mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).containsKey(t.getData().getHour()))
                    {
                        mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).get(t.getData().getHour()).add(t.clone());
                    }
                    else
                    {
                        List<TransCaixa> lista = new ArrayList<>();
                        lista.add(t.clone());
                        mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).put(t.getData().getHour(), lista);
                    }
                }
                else
                {
                    List<TransCaixa> listaA = new ArrayList<>();
                    listaA.add(t.clone());
                    Map<Integer, List<TransCaixa>> map = new HashMap<>();
                    map.put(t.getData().getHour(),listaA);
                    mapaTxPorMDH.get(t.getData().getMonth()).put(t.getData().getDayOfMonth(), map);
                }
            }
            else
            {
                List<TransCaixa> listaB = new ArrayList<>();
                listaB.add(t.clone());
                Map<Integer, List<TransCaixa>> map = new HashMap<>();
                map.put(t.getData().getHour(),listaB);

                Map<Integer, Map<Integer, List<TransCaixa>>> mapAux = new HashMap<>();
                mapAux.put(t.getData().getDayOfMonth(), map);

                mapaTxPorMDH.put(t.getData().getMonth(),mapAux);
            }
        }

        return mapaTxPorMDH;
    };

    public static Supplier<Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> teste6Semana_2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa2M.txt");
        Map<DayOfWeek, Map<Integer, List<TransCaixa>>> mapaTxPorDH =
                ltc.stream()
                        .collect(groupingBy(t -> t.getData().getDayOfWeek(),
                                groupingBy(t -> t.getData().getHour())));

        return mapaTxPorDH;
    };

    public static Supplier<Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> teste6SemanaFor_2M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa2M.txt");
        Map<DayOfWeek, Map<Integer, List<TransCaixa>>> mapaTxPorDH = new HashMap<>();

        for(TransCaixa t : ltc)
        {
            if(mapaTxPorDH.containsKey(t.getData().getDayOfWeek()))
            {
                if(mapaTxPorDH.get(t.getData().getDayOfWeek()).containsKey(t.getData().getHour()))
                {
                    mapaTxPorDH.get(t.getData().getDayOfWeek()).get(t.getData().getHour()).add(t.clone());
                }
                else
                {
                    List<TransCaixa> lista = new ArrayList<>();
                    lista.add(t.clone());
                    mapaTxPorDH.get(t.getData().getDayOfWeek()).put(t.getData().getHour(), lista);
                }
            }
            else
            {
                List<TransCaixa> listaA = new ArrayList<>();
                listaA.add(t.clone()); // lista

                Map<Integer, List<TransCaixa>> map = new HashMap<>(); // Hora, Lista
                map.put(t.getData().getHour(), listaA);

                mapaTxPorDH.put(t.getData().getDayOfWeek(), map);
            }
        }

        return mapaTxPorDH;
    };

    // 4M
    public static Supplier<Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> teste6Original_4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa4M.txt");
        Map<Month, Map<Integer, Map<Integer, List<TransCaixa>>>> mapaTxPorMDH =
                ltc.stream()
                        .collect(groupingBy(t -> t.getData().getMonth(),
                                groupingBy(t -> t.getData().getDayOfMonth(),
                                        groupingBy(t -> t.getData().getHour()))));

        return mapaTxPorMDH;
    };

    public static Supplier<Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> teste6Java7_4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa4M.txt");
        Map<Month, Map<Integer, Map<Integer, List<TransCaixa>>>> mapaTxPorMDH = new HashMap<>();

        for(TransCaixa t : ltc)
        {
            if(mapaTxPorMDH.containsKey(t.getData().getMonth()))
            {
                if(mapaTxPorMDH.get(t.getData().getMonth()).containsKey(t.getData().getDayOfMonth()))
                {
                    if(mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).containsKey(t.getData().getHour()))
                    {
                        mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).get(t.getData().getHour()).add(t.clone());
                    }
                    else
                    {
                        List<TransCaixa> lista = new ArrayList<>();
                        lista.add(t.clone());
                        mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).put(t.getData().getHour(), lista);
                    }
                }
                else
                {
                    List<TransCaixa> listaA = new ArrayList<>();
                    listaA.add(t.clone());
                    Map<Integer, List<TransCaixa>> map = new HashMap<>();
                    map.put(t.getData().getHour(),listaA);
                    mapaTxPorMDH.get(t.getData().getMonth()).put(t.getData().getDayOfMonth(), map);
                }
            }
            else
            {
                List<TransCaixa> listaB = new ArrayList<>();
                listaB.add(t.clone());
                Map<Integer, List<TransCaixa>> map = new HashMap<>();
                map.put(t.getData().getHour(),listaB);

                Map<Integer, Map<Integer, List<TransCaixa>>> mapAux = new HashMap<>();
                mapAux.put(t.getData().getDayOfMonth(), map);

                mapaTxPorMDH.put(t.getData().getMonth(),mapAux);
            }
        }

        return mapaTxPorMDH;
    };

    public static Supplier<Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> teste6Semana_4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa4M.txt");
        Map<DayOfWeek, Map<Integer, List<TransCaixa>>> mapaTxPorDH =
                ltc.stream()
                        .collect(groupingBy(t -> t.getData().getDayOfWeek(),
                                groupingBy(t -> t.getData().getHour())));

        return mapaTxPorDH;
    };

    public static Supplier<Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> teste6SemanaFor_4M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa4M.txt");
        Map<DayOfWeek, Map<Integer, List<TransCaixa>>> mapaTxPorDH = new HashMap<>();

        for(TransCaixa t : ltc)
        {
            if(mapaTxPorDH.containsKey(t.getData().getDayOfWeek()))
            {
                if(mapaTxPorDH.get(t.getData().getDayOfWeek()).containsKey(t.getData().getHour()))
                {
                    mapaTxPorDH.get(t.getData().getDayOfWeek()).get(t.getData().getHour()).add(t.clone());
                }
                else
                {
                    List<TransCaixa> lista = new ArrayList<>();
                    lista.add(t.clone());
                    mapaTxPorDH.get(t.getData().getDayOfWeek()).put(t.getData().getHour(), lista);
                }
            }
            else
            {
                List<TransCaixa> listaA = new ArrayList<>();
                listaA.add(t.clone()); // lista

                Map<Integer, List<TransCaixa>> map = new HashMap<>(); // Hora, Lista
                map.put(t.getData().getHour(), listaA);

                mapaTxPorDH.put(t.getData().getDayOfWeek(), map);
            }
        }

        return mapaTxPorDH;
    };

    // 6M
    public static Supplier<Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> teste6Original_6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa6M.txt");
        Map<Month, Map<Integer, Map<Integer, List<TransCaixa>>>> mapaTxPorMDH =
                ltc.stream()
                        .collect(groupingBy(t -> t.getData().getMonth(),
                                groupingBy(t -> t.getData().getDayOfMonth(),
                                        groupingBy(t -> t.getData().getHour()))));

        return mapaTxPorMDH;
    };

    public static Supplier<Map<Month, Map<Integer,Map<Integer, List<TransCaixa>>>>> teste6Java7_6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa6M.txt");
        Map<Month, Map<Integer, Map<Integer, List<TransCaixa>>>> mapaTxPorMDH = new HashMap<>();

        for(TransCaixa t : ltc)
        {
            if(mapaTxPorMDH.containsKey(t.getData().getMonth()))
            {
                if(mapaTxPorMDH.get(t.getData().getMonth()).containsKey(t.getData().getDayOfMonth()))
                {
                    if(mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).containsKey(t.getData().getHour()))
                    {
                        mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).get(t.getData().getHour()).add(t.clone());
                    }
                    else
                    {
                        List<TransCaixa> lista = new ArrayList<>();
                        lista.add(t.clone());
                        mapaTxPorMDH.get(t.getData().getMonth()).get(t.getData().getDayOfMonth()).put(t.getData().getHour(), lista);
                    }
                }
                else
                {
                    List<TransCaixa> listaA = new ArrayList<>();
                    listaA.add(t.clone());
                    Map<Integer, List<TransCaixa>> map = new HashMap<>();
                    map.put(t.getData().getHour(),listaA);
                    mapaTxPorMDH.get(t.getData().getMonth()).put(t.getData().getDayOfMonth(), map);
                }
            }
            else
            {
                List<TransCaixa> listaB = new ArrayList<>();
                listaB.add(t.clone());
                Map<Integer, List<TransCaixa>> map = new HashMap<>();
                map.put(t.getData().getHour(),listaB);

                Map<Integer, Map<Integer, List<TransCaixa>>> mapAux = new HashMap<>();
                mapAux.put(t.getData().getDayOfMonth(), map);

                mapaTxPorMDH.put(t.getData().getMonth(),mapAux);
            }
        }

        return mapaTxPorMDH;
    };

    public static Supplier<Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> teste6Semana_6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa6M.txt");
        Map<DayOfWeek, Map<Integer, List<TransCaixa>>> mapaTxPorDH =
                ltc.stream()
                        .collect(groupingBy(t -> t.getData().getDayOfWeek(),
                                groupingBy(t -> t.getData().getHour())));

        return mapaTxPorDH;
    };

    public static Supplier<Map<DayOfWeek, Map<Integer, List<TransCaixa>>>> teste6SemanaFor_6M = () -> {
        List<TransCaixa> ltc =  UtilsTransCaixa.setup("transCaixa6M.txt");
        Map<DayOfWeek, Map<Integer, List<TransCaixa>>> mapaTxPorDH = new HashMap<>();

        for(TransCaixa t : ltc)
        {
            if(mapaTxPorDH.containsKey(t.getData().getDayOfWeek()))
            {
                if(mapaTxPorDH.get(t.getData().getDayOfWeek()).containsKey(t.getData().getHour()))
                {
                    mapaTxPorDH.get(t.getData().getDayOfWeek()).get(t.getData().getHour()).add(t.clone());
                }
                else
                {
                    List<TransCaixa> lista = new ArrayList<>();
                    lista.add(t.clone());
                    mapaTxPorDH.get(t.getData().getDayOfWeek()).put(t.getData().getHour(), lista);
                }
            }
            else
            {
                List<TransCaixa> listaA = new ArrayList<>();
                listaA.add(t.clone()); // lista

                Map<Integer, List<TransCaixa>> map = new HashMap<>(); // Hora, Lista
                map.put(t.getData().getHour(), listaA);

                mapaTxPorDH.put(t.getData().getDayOfWeek(), map);
            }
        }

        return mapaTxPorDH;
    };
}
