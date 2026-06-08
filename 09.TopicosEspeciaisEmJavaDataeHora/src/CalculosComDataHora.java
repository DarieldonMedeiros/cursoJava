import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {

    public static void main(String[] args) {
        
        LocalDate data01 = LocalDate.parse("2026-06-05");
        LocalDateTime data02 = LocalDateTime.parse("2026-06-05T01:30:26");
        Instant data03 = Instant.parse("2026-06-05T01:30:26Z");

        LocalDate pastWeekLocalDate = data01.minusDays(7);
        LocalDate nextWeekLocalDate = data01.plusDays(7);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = data02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = data02.plusDays(7);

        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = data03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = data03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant: " + pastWeekInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);

        // Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), data01.atTime(0, 0)); // Não tem como calcular tempo de duração com LocalDate (precisa converter para LocalDateTime)
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), data01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, data02);
        Duration t3 = Duration.between(pastWeekInstant, nextWeekInstant);
        Duration t4 = Duration.between(nextWeekInstant, pastWeekInstant);
        System.out.println("t1 dias: " + t1.toDays());
        System.out.println("t2 dias: " + t2.toDays());
        System.out.println("t3 dias: " + t3.toDays());
        System.out.println("t4 dias: " + t4.toDays()); // Fica negativo, pois o primeiro argumento foi a data mais recente

    }
}
