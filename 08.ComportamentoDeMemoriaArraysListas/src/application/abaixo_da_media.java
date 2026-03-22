package application;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidade = sc.nextInt();
        double[] vetor = new double[quantidade];

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.printf("\nMEDIA DO VETOR = %.3f", media);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
        for (double valor : vetor) {
            if (valor  < media) {
                System.out.printf("%.1f\n", valor);
            }
        }

        sc.close();
    }
}