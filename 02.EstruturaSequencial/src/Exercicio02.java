// Crie um programa que leia o valor da área de um círculo e depois calcule o valor da área com 4 casas decimais

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é: %.4f\n", area);
        sc.close();
    }
}
