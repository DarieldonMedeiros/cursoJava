// Programa para ler o código, número e o valor de 2 peças e somar o valor total a ser pago

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o código, quantidade e valor da primeira peça: ");
        int codigo1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        
        System.out.print("\nDigite o código, quantidade e valor da segunda peça: ");
        int codigo2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double total = quantidade1 * valor1 + quantidade2 * valor2;
        System.out.println("\nPeça 1: Código: " + codigo1 + ", Quantidade: " + quantidade1 + ", Valor: R$ " + valor1);
        System.out.println("Peça 2: Código: " + codigo2 + ", Quantidade: " + quantidade2 + ", Valor: R$ " + valor2);
        System.out.printf("\nValor total a pagar é:  R$ %.2f%n", total);
        sc.close();
    }
}
