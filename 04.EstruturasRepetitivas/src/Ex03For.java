import java.util.Locale;
import java.util.Scanner;

public class Ex03For {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de casos a serem testados: ");
        int N = sc.nextInt();
        while(N <= 0) {
            System.out.println("Número de casos não pode ser <= 0, digite novamente");
            N = sc.nextInt();
        }
        double a = 0;
        double b = 0;
        double c = 0;
        double media = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor de a: ");
            a = sc.nextDouble();
            System.out.print("\nDigite o valor de b: ");
            b = sc.nextDouble();
            System.out.print("\nDigite o valor de c: ");
            c = sc.nextDouble();

            media = (a * 2 + b * 3 + c * 5)/(2 + 3 + 5);
            System.out.printf("\nA média é: %.1f\n", media);
        }

        sc.close();
    }
}