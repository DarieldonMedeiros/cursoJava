package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01_Negativos {

    public static int NUMERO_MAXIMO = 10;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos números você vai digitar? (Se valor > " + NUMERO_MAXIMO + ", será limitado)");
        int n = sc.nextInt();
        if (n > NUMERO_MAXIMO) {
            n = NUMERO_MAXIMO;
        }
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
