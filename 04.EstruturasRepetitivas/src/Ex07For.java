import java.util.Scanner;

public class Ex07For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de N");
        int N = sc.nextInt();
        while (N <= 0) {
            System.out.println("Número inválido, digite novamente: ");
            N = sc.nextInt();
        }
        int quadrado = 0;
        int cubo = 0;
        for (int i = 1; i <= N; i++) {
            quadrado = i * i;
            cubo = i * quadrado;
            System.out.println(i + " " + quadrado + " " + cubo);
        }

        sc.close();
    }
}
