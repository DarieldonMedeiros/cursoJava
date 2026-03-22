package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        Person[] vect = new Person[n];

        double heightSum = 0.0;
        int under16Count = 0;
        for (int i = 0; i < vect.length; i++){
            System.out.println("Dados da " + (i + 1) + "° pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new Person(name, age,"X", height);
            heightSum += vect[i].getHeight();
            if (vect[i].getAge() < 16){
                under16Count++;
            }
        }
        System.out.println();

        double avgHeight = heightSum / vect.length;
        System.out.printf("Altura média: %.2f%n", avgHeight);
        System.out.println("Pessoas com menos de 16 anos: " + (double)under16Count/vect.length * 100 + "%");

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
