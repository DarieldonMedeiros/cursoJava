package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class dados_pessoas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidade = sc.nextInt();
        Person[] pessoas = new Person[quantidade];

        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.NEGATIVE_INFINITY;
        double somaAlturaMulheres = 0.0;
        int contadorHomens = 0;
        int contadorMulheres = 0;

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
            double altura = sc.nextDouble();
            System.out.print("Gênero da " + (i + 1) + "ª pessoa (M/F): ");
            String genero = sc.next();

            pessoas[i] = new Person("Nome", 0, genero, altura);

            if (pessoas[i].getGender().equalsIgnoreCase("M")) {
                contadorHomens++;
            } else if (pessoas[i].getGender().equalsIgnoreCase("F")) {
                somaAlturaMulheres += pessoas[i].getHeight();
                contadorMulheres++;
            }

            if (pessoas[i].getHeight() < menorAltura) {
                menorAltura = pessoas[i].getHeight();
            }
            if (pessoas[i].getHeight() > maiorAltura) {
                maiorAltura = pessoas[i].getHeight();
            }
        }

        System.out.println("\nMenor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);

        if (contadorMulheres > 0) {
            System.out.printf("Média das alturas das mulheres: %.2f%n", somaAlturaMulheres / contadorMulheres);
        } else {
            System.out.println("Nenhuma mulher foi cadastrada.");
        }

        System.out.println("Número de homens: " + contadorHomens);

        sc.close();
    }
}