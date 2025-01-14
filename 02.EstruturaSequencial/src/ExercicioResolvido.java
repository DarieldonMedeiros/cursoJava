import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double largura, comprimento, metroQuadrado, area, precoTotal;
        System.out.println("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.println("Digite o preço do metro quadrado: ");
        metroQuadrado = sc.nextDouble();
        area = largura * comprimento;
        precoTotal = area * metroQuadrado;

        System.out.printf("Área do terreno = %.2fm²\n",  area);
        System.out.printf("Preço do terreno = R$%.2f\n", precoTotal);

        sc.close();
    }
}
