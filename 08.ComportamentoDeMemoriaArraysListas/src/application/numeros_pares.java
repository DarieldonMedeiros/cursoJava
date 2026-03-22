package application;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int quantidadePares = 0;
        for (int i = 0; i< numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            }
        }
        System.out.println("\n\nNUMEROS PARES: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println("\nQUANTIDADE DE PARES: " + quantidadePares);
        sc.close();
    }
}