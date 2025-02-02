import java.util.Locale;
import java.util.Scanner;

public class Ex04For {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();
        while (N <= 0) {
            System.out.print("\nN não pode ser <= 0, digite novamente: ");
            N = sc.nextInt();
        }


        for (int i = 0; i < N; i++) {
            double numerador = 0;
            double denominador = 0;
            double divisao;
            System.out.print("\nDigite o numerador: ");
            numerador += sc.nextInt();
            System.out.print("\nDigite o denominador: ");
            denominador = sc.nextInt();

            if (denominador != 0) {
                divisao = numerador / denominador;
                System.out.printf("\nA divisão de %.1f pelo %.1f é: %.1f", numerador, denominador, divisao);
            }
            else {
                System.out.println("\nDivisão impossível");
            }
        }

        sc.close();
    }
}