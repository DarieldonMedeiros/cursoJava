import java.util.Scanner;

public class Ex02For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números a serem digitados: ");
        int N = sc.nextInt();
        while (N <= 0){
            System.out.println("O número tem que ser maior que zero, digite novamente: ");
            N = sc.nextInt();
        }
        int numeroVerificado = 0;
        int in = 0;
        int out = 0;
        for(int i = 0; i < N; i++) {
            System.out.println("Digite o número a ser verificado: ");
            numeroVerificado = sc.nextInt();
            if (numeroVerificado >= 10 && numeroVerificado <= 20) {
                in++;
            }
            else out++;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}