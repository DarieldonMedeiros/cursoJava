package service;

import entities.CarRental;
import entities.Invoice;

import java.time.Duration;

public class RentalService {
    private final Double pricePerHour;
    private final Double pricePerDay;
    private final TaxService taxService; // Não é uma boa prática especificar o TaxService no RentalService, pois fica dependente

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        long minutes = Duration.between(carRental.getStart(), carRental.getEnd()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment = 0;
        if(hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours); // ceil arredonda para cima
        }
        if (hours > 12) {
            basicPayment = pricePerDay * Math.ceil(hours / 24.00);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
