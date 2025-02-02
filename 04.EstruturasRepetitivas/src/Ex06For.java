import java.util.Scanner;

public class Ex06For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de N: ");
        int N = sc.nextInt();

        System.out.println("Lista dos divisores de " + N);
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) System.out.println(i);
        }

        sc.close();
    }
}
