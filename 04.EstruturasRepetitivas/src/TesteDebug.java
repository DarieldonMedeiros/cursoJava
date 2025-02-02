import java.util.Locale;
import java.util.Scanner;

public class TesteDebug {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digire a largura: ");
        double largura = sc.nextDouble();
        System.out.println("Digite o comprimento: ");
        double comprimento = sc.nextDouble();
        System.out.println("Digite o preço do Metro Quadrado: ");
        double precoMetroQuadrado = sc.nextDouble();


        double area = largura * comprimento;
        double precoTotal = area * precoMetroQuadrado;

        System.out.printf("ÁREA = %.2fm²\n", area);
        System.out.printf("PREÇO = R$%.2f", precoTotal);

        sc.close();
    }
}
