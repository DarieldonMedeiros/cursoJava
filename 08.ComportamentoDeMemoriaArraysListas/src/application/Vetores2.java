package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vetores2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos produtos você vai digitar?");
        int numberProducts = sc.nextInt();
        Product[] vect = new Product[numberProducts];

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite os dados do produto #" + (i + 1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preço: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("Preço médio: %.2f%n", avg);

        sc.close();
    }
}
