import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro semestre: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota do segundo semestre: ");
        double nota2 = sc.nextDouble();
        double notaFinal = nota1 + nota2;
        if (notaFinal < 60) {
            System.out.println("NOTA FINAL = " + notaFinal);
            System.out.println("REPROVADO");
        } else {
            System.out.println("NOTA FINAL = " + notaFinal);
        }

        sc.close();
    }
}
