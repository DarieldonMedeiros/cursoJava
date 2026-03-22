package application;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Quantos números voce vai digitar? ");
        int numeros = sc.nextInt();
        double valores[] = new double[numeros];

        double maior = 0;
        int posicaoMaior = 0;
        for (int i = 0; i < numeros; i++){
            System.out.print("Digite um número: ");
            valores[i] = sc.nextDouble();
            if (valores[i] > maior){
                maior = valores[i];
                posicaoMaior = i;
            }
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Posição do maior valor: " + posicaoMaior);
        sc.close();
    }
}
