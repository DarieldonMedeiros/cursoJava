package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int numberProducts = scanner.nextInt();

        for (int i = 1; i <= numberProducts; i++) {
            scanner.nextLine();
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            String choice = scanner.nextLine();
            while(!choice.equalsIgnoreCase("c") && !choice.equalsIgnoreCase("u") && !choice.equalsIgnoreCase("i")) {
                System.out.print("Invalid choice, try again (c/u/i): ");
                choice = scanner.nextLine();
            }

            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            Double price = scanner.nextDouble();
            if(choice.equalsIgnoreCase("c")) {
                products.add(new Product(name, price));
            }
            if (choice.equalsIgnoreCase("u")) {
                scanner.nextLine();
                System.out.print("Manufacture date: (DD/MM/YYYY): ");
                String date = scanner.nextLine();
                products.add(new UsedProduct(name, price, sdf.parse(date)));
            }
            if (choice.equalsIgnoreCase("i")) {
                scanner.nextLine();
                System.out.print("Customs fee: ");
                Double customsFee = scanner.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
        scanner.close();
    }
}
