package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        System.out.println();

        System.out.printf("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        double avg = sum / vect.length;
        System.out.printf("%nSOMA = %.2f%n", sum);
        System.out.printf("MÉDIA = %.2f%n", avg);

        sc.close();
    }
}
