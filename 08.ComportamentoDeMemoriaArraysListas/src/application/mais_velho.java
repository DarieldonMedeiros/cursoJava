package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class mais_velho {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas você vai digitar? ");
        int quantidade = sc.nextInt();
        Person[] pessoas = new Person[quantidade];

        int indiceMaisVelho = 0;
        int maiorIdade = 0;
        for (int i = 0; i < pessoas.length; i++){
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            sc.nextLine(); // Consumir a quebra de linha
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new Person(nome, idade, "X", 0);

            if (pessoas[i].getAge() > maiorIdade){
                maiorIdade = pessoas[i].getAge();
                indiceMaisVelho = i;
            }
        }

        System.out.println("\nPESSOA MAIS VELHA: " + pessoas[indiceMaisVelho].getName());

        sc.close();
    }
}
