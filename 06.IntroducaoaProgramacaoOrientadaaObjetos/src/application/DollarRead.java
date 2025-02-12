package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class DollarRead {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dollar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = R$%.2f", CurrencyConverter.dollarToReal());

        sc.close();
    }
}
