package application;

import service.InterestService;
import service.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class ProgramInterest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Months: ");
        int months = Integer.parseInt(scanner.nextLine());

        InterestService service = new UsaInterestService(1.0);
        double payment = service.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.printf("%.2f%n", payment);

        scanner.close();
    }
}
