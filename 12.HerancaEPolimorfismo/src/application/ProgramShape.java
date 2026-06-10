package application;

import entities.Circle;
import entities.enums.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramShape {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numberOfShapes = scanner.nextInt();

        for (int i = 1; i <= numberOfShapes; i++) {
            scanner.nextLine();
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or circle (r/c)? ");
            String choice = scanner.nextLine();
            while (!choice.equalsIgnoreCase("r") && !choice.equalsIgnoreCase("c")) {
                System.out.print("Invalid choice, please try again (r/c): ");
                choice = scanner.nextLine();
            }
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = scanner.nextLine();
            while (!color.equals("BLACK") && !color.equals("BLUE") && !color.equals("RED")) {
                System.out.print("Invalid color, please try again (BLACK/BLUE/RED): ");
                color = scanner.nextLine();
            }

            if (choice.equalsIgnoreCase("r")) {
                System.out.print("Width: ");
                Double width = scanner.nextDouble();
                System.out.print("Height: ");
                Double height = scanner.nextDouble();
                shapes.add(new Rectangle(Color.valueOf(color), width, height));
            }

            if (choice.equalsIgnoreCase("c")) {
                System.out.print("Radius: ");
                Double radius = scanner.nextDouble();
                shapes.add(new Circle(Color.valueOf(color), radius));
            }
        }
        System.out.println("\nSHAPE AREAS:");
        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }

        scanner.close();
    }
}
