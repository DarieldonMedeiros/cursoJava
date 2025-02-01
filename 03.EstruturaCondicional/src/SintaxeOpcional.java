import java.util.Locale;
import java.util.Scanner;

public class SintaxeOpcional {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite quantos minutos foram consumidos: ");
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        /*
         * a += b => a = a + b
         * a -= b => a = a - b
         * a *= b => a = a * b
         * a /= b => a = a / b
         * a %= b => a = a % b
         */

        System.out.println("Valor a pagar: R$ " + String.format("%.2f", conta));

        sc.close();
    }
}
