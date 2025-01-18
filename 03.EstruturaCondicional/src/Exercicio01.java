import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número não negativo");
        }

        sc.close();
    }
}
