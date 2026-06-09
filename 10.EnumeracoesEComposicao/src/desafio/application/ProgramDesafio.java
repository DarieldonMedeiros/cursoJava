package desafio.application;

import desafio.entities.Client;
import desafio.entities.Order;
import desafio.entities.OrderItem;
import desafio.entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramDesafio {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.nextLine());
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.nextLine());
        Order order = new Order(new Date(), status, client);

        System.out.print("How many items in this order? ");
        int items = scanner.nextInt();
        for(int i = 1; i <= items; i++) {
            scanner.nextLine(); // Retirar o buffer do nextInt (serve tanto para o buffer do items e do quantity para i > 1)
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            String priceStr = scanner.nextLine();
            Double price = Double.parseDouble(priceStr);
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            Product product = new Product(productName, price);
            OrderItem item = new OrderItem(quantity, product);
            order.addItem(item);
        }
        System.out.println();
        System.out.println(order);

        scanner.close();
    }
}
