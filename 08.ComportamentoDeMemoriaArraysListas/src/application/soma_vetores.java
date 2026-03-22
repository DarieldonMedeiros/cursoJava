package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos valores vai ter cada vetor? ");
        int quantidade = sc.nextInt();
        int[] vetorA = new int[quantidade];
        int[] vetorB = new int[quantidade];
        int[] vetorResultante = new int[quantidade];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um valor para o vetor A: ");
            vetorA[i] = sc.nextInt();

            System.out.print("Digite um valor para o vetor B: ");
            vetorB[i] = sc.nextInt();

            vetorResultante[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("\nVETOR RESULTANTE: ");
        for( int vetor : vetorResultante){
            System.out.println(vetor);
        }
        
        sc.close();
    }
}
