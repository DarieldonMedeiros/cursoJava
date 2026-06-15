package application;

import entities.CarRental;
import entities.Vehicle;
import service.BrazilTaxService;
import service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramInvoice {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String model = scanner.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), dtf);
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        LocalDateTime end = LocalDateTime.parse(scanner.nextLine(), dtf);
        CarRental rental = new CarRental(start, end, new Vehicle(model));

        System.out.print("Enter price per hour: ");
        Double pricePerHour = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter price per day: ");
        Double pricePerDay = Double.parseDouble(scanner.nextLine());

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(rental);

        System.out.println("\nINVOICE: ");
        System.out.println("Basic payment: " + String.format("%.2f", rental.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", rental.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", rental.getInvoice().getTotalPayment()));

        scanner.close();
    }
}
