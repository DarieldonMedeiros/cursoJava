import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDataHoraGlobalParaLocal {

    public static void main(String[] args) {
        
        LocalDate data01 = LocalDate.parse("2026-06-05");
        LocalDateTime data02 = LocalDateTime.parse("2026-06-05T01:30:26");
        Instant data06 = Instant.parse("2026-06-05T01:30:26Z");

        LocalDate resultado1 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
        LocalDate resultado2 = LocalDate.ofInstant(data06, ZoneId.of("Portugal"));
        LocalDateTime resultado3 = LocalDateTime.ofInstant(data06, ZoneId.systemDefault());
        LocalDateTime resultado4 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));

        System.out.println("data 01: " + data01);
        System.out.println("data 02: " + data02);
        System.out.println("data 06: " + data06);
        System.out.println("resultado 01: " + resultado1); // Como é 3 horas antes o fuso horário do Brasil, logo retorna no dia anterior devido ao horário
        System.out.println("resultado 02: " + resultado2);
        System.out.println("resultado 03: " + resultado3);
        System.out.println("resultado 04: " + resultado4);

        System.out.println("data 01 dia = " + data01.getDayOfMonth());
        System.out.println("data 01 mês = " + data01.getMonthValue());
        System.out.println("data 01 ano = " + data01.getYear());

        System.out.println("data 02 hora = " + data02.getHour());
        System.out.println("data 02 minuto = " + data02.getMinute());
        System.out.println("data 02 segundo = " + data02.getSecond());

        // Lista todos os fusos horários existentes
        // System.out.println();
        // for (String s : ZoneId.getAvailableZoneIds()){
        //     System.out.println(s);
        // }
    }
}
