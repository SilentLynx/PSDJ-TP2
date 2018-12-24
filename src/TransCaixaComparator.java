import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Comparator;

public class TransCaixaComparator {

    Comparator<LocalDate> compMenorData =
            (LocalDate ld1, LocalDate ld2) -> { if(ld1.equals(ld2)) return 0;
            else if(ld1.isBefore(ld2)) return -1;
            else return 1 ;
            };
    Comparator<LocalTime> compMenorTime =
            (LocalTime lt1, LocalTime lt2) -> { if(lt1.equals(lt2)) return 0;
            else if(lt1.isBefore(lt2)) return -1;
            else return 1 ;
            };

    static Comparator<TransCaixa> transPorData =
            (TransCaixa tc1, TransCaixa tc2) -> { LocalDateTime ldt1 = tc1.getData();
                LocalDateTime ldt2 = tc2.getData();
                if(ldt1.equals(ldt2)) return 0;
                else if(ldt1.isBefore(ldt2)) return -1;
                else return 1 ;
            };
}
