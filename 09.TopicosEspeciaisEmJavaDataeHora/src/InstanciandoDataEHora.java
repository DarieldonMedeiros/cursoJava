import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataEHora {
    public static void main(String[] args) throws Exception {
        
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();

        LocalDate data4 = LocalDate.parse("2026-06-05");
        LocalDateTime data5 = LocalDateTime.parse("2026-06-05T01:30:26");
        Instant data6 = Instant.parse("2026-06-05T01:30:26Z");

        Instant data7 = Instant.parse("2026-06-05T01:30:26-03:00"); // Aqui no texto é o horário de São Paulo, o Instant pega o 
        // horário de Londres (3 horas adiantado)

        LocalDate data8 = LocalDate.parse("05/06/2026", fmt1);
        LocalDateTime data9 = LocalDateTime.parse("05/06/2026 01:30", fmt2);

        LocalDate data10 = LocalDate.of(2025, 6, 5);
        LocalDateTime data11 = LocalDateTime.of(2025, 6, 5, 1, 30);

        System.out.println("data 01: " + data1); // Implicitamente estão sendo chamados o método .toString() no método System.out.println
        System.out.println("data 02: " + data2);
        System.out.println("data 03: " + data3);
        System.out.println("data 04: " + data4);
        System.out.println("data 05: " + data5);
        System.out.println("data 06: " + data6);
        System.out.println("data 07: " + data7);
        System.out.println("data 08: " + data8);
        System.out.println("data 09: " + data9);
        System.out.println("data 10: " + data10);
        System.out.println("data 11: " + data11);
    }
}
