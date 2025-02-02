import java.util.Scanner;

public class Ex01For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro entre 1 e 1000");
        int n = sc.nextInt();
        while(n <= 0 || n > 1000){
            System.out.println("Número não permitido, digite novamente: ");
            n = sc.nextInt();
        }
        System.out.println("Lista de números ímpares que vão até o número "+ n);
        int contador = 0;
        for(int i = 1; i<= n; i+=2) {
            System.out.println(i);
            contador++;
        }
        System.out.println("O número de números ímpares de 1 até " + n + " é: " + contador);
        sc.close();
    }
}
