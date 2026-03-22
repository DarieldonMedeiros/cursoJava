package application;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidade = sc.nextInt();
        int[] vetor = new int[quantidade];

        int somaPares = 0;
        int quantidadePares = 0;
        for (int valor : vetor){
            System.out.print("Digite um número: ");
            valor = sc.nextInt();
            if (valor % 2 == 0){
                somaPares += valor;
                quantidadePares++;
            }
        }

        double mediaPares = quantidadePares > 0 ? somaPares / (double) quantidadePares : 0;
        if (quantidadePares > 0) {
            System.out.printf("\nMédia dos pares: %.1f" , mediaPares);
        } else {
            System.out.println("\nNenhum número par foi digitado.");
        }


        sc.close();
    }
}
