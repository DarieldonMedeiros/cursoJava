import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4.0 * a * c;

        if (a == 0) {
            System.out.printf("Como a = 0, a equação é de primeiro grau do tipo %.1fx + %.1f = 0\n", b, c);
            double x = -c/b;
            System.out.println("Logo, x = " + x);
        } else if (delta < 0.0) {
            System.out.println("Não é possível calcular no conjunto dos números reais, pois delta = " + delta);
        } else {
            double x1 = (-b + Math.sqrt(delta))/(2.0 * a);
            double x2 = (-b - Math.sqrt(delta))/(2.0 * a);
            System.out.printf("X1 = %.5f\n", x1);
            System.out.printf("X2 = %.5f\n", x2);
        }
        
        sc.close();
    }
}
