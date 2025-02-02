import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite quantos nímeros serão digitados: ");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            soma += sc.nextInt();
        }

        System.out.println("Soma = " + soma);

        sc.close();
    }
}
