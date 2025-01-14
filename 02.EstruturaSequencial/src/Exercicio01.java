// Crie um programa que leia dois números e imprima a soma deles.

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos números é: " + soma);
        sc.close();
    }
}
