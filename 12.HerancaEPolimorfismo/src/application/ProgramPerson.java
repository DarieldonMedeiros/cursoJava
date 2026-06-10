package application;

import entities.CompanyPerson;
import entities.IndividualPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramPerson {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayers = scanner.nextInt();

        for (int i = 1; i <= numberOfTaxPayers; i++){
            scanner.nextLine();
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or Company (i/c)?: ");
            String typePerson = scanner.nextLine();
            while(!typePerson.equals("i") && !typePerson.equals("c")){
                System.out.print("Invalid input, please try again (i/c): ");
                typePerson = scanner.nextLine();
            }
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Annual Income: ");
            Double annualIncome = scanner.nextDouble();
            scanner.nextLine();
            if (typePerson.equals("i")){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = scanner.nextDouble();
                persons.add(new IndividualPerson(name, annualIncome, healthExpenditures));
            }
            if (typePerson.equals("c")){
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = scanner.nextInt();
                persons.add(new CompanyPerson(name, annualIncome, numberOfEmployees));
            }
        }
        System.out.println("\nTAXES PAID: ");
        double sumTax = 0.0;
        for (Person person : persons){
            System.out.println(person);
            sumTax += person.tax();
        }

        System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", sumTax));
        scanner.close();
    }
}
