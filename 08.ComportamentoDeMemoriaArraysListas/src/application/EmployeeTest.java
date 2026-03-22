package application;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many employees will be registered? ");
        int numberOfEmployees = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for(int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Employee #" + i);
            System.out.print("Id: ");
            Long id = sc.nextLong();
            sc.nextLine();
            while(hasId(employees, id)){
                System.out.print("Id already taken! Try again: ");
                id = sc.nextLong();
                sc.nextLine();
            }
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            BigDecimal salary = sc.nextBigDecimal();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        Long idIncrease = sc.nextLong();

        employees.stream()
            .filter(e -> e.getId().equals(idIncrease))
            .findFirst()
            .ifPresentOrElse(employee -> {
                System.out.print("Enter the percentage: ");
                BigDecimal percentage = sc.nextBigDecimal();
                employee.setSalary(employee.increaseSalary(percentage));
            }, () -> System.out.println("This Id does not exist!"));

        System.out.println();
        System.out.println("List of employees:");
        employees.forEach(System.out::println);

        sc.close();
    }

    public static boolean hasId(List<Employee> list, Long id) {
        return list.stream().anyMatch(e -> e.getId().equals(id));
    }
}
