import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHoraParaTexto {

    public static void main(String[] args) {
        
        LocalDate data04 = LocalDate.parse("2026-06-05");
        LocalDateTime data05 = LocalDateTime.parse("2026-06-05T01:30:26");
        Instant data06 = Instant.parse("2026-06-05T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault()); // Imprimindo no horário
        // local, vai imprimir 3 horas atrasado pois o instant pega o horário de Londres. É necessário formatar utilizando a TimeZone
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // É uma data que não tem fuso horário
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("data 04: " + data04.format(fmt1));
        System.out.println("data 04: " + fmt1.format(data04));
        System.out.println("data 04: " + data04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("data 05: " + data05.format(fmt2));
        System.out.println("data 05: " + fmt2.format(data05));
        System.out.println("data 05: " + data05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("data 05: " + data05.format(fmt4));

        System.out.println("data 06: " + fmt3.format(data06));
        System.out.println("data 06: " + fmt5.format(data06));
    }
}
