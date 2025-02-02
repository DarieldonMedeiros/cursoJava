import java.util.Locale;
import java.util.Scanner;

public class Ex05For {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de N: ");
        int N = sc.nextInt();
        while (N < 0) {
            System.out.println("O valor de N não pode ser negativo, digite de novo: ");
            N = sc.nextInt();
        }

        int fatorial = 1;
        for (int i = 1; i <= N; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + N + " é: " + fatorial);

        sc.close();
    }
}
