package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();

        scanner.nextLine();
        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            String choice = scanner.next();
            while(!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
                System.out.print("Invalid choice. Please try again (y/n): ");
                choice = scanner.next();
            }
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            Double value = scanner.nextDouble();
            if (choice.equalsIgnoreCase("y")) {
                System.out.print("Additional charge: ");
                Double charge = scanner.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, value, charge));
            } else if (choice.equalsIgnoreCase("n")) {
                employees.add(new Employee(name, hours, value));
            }
        }

        System.out.println("\nPAYMENTS: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        scanner.close();
    }
}
