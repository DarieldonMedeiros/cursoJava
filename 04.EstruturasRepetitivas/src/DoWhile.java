import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double temperaturaC = 0;
        double temperaturaF = 0;
        String opcao;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            temperaturaC = sc.nextDouble();
            temperaturaF = 9.0*temperaturaC/5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f\n", temperaturaF);
            System.out.print("Deseja repetir (s/n)?");
            opcao = sc.next();
            while (!opcao.equals("s") && !opcao.equals("n")) {
                System.out.println("Opção inválida, deseja repetir (s/n)?");
                opcao = sc.next();
            }
        } while (!opcao.equals("n"));

        sc.close();
    }
}
