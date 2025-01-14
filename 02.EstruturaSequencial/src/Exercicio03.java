// Ler 4 valores inteiros e calcular a diferença do produto dos dois primeiros pelo produto dos dois últimos

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Digite o valor de a: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de b: ");
        b = sc.nextInt();
        System.out.println("Digite o valor de c: ");
        c = sc.nextInt();
        System.out.println("Digite o valor de d: ");
        d = sc.nextInt();
        
        int diferenca = (a * b) - (c * d);
        System.out.println("Diferença = " + diferenca);
        sc.close();
    }

}
