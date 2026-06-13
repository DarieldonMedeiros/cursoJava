package application;

import model.entities.Account;
import model.exception.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = Integer.parseInt(scanner.nextLine());
        System.out.print("Holder: ");
        String holder = scanner.nextLine();
        System.out.print("Initial balance: ");
        Double initialBalance = Double.parseDouble(scanner.nextLine());
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = Double.parseDouble(scanner.nextLine());

        Account account = new Account(number, holder, initialBalance, withdrawLimit);
        System.out.print("\nEnter amount for withdraw: ");
        Double amount = Double.parseDouble(scanner.nextLine());

        try{
            account.withdraw(amount);
            System.out.printf("New balance: %.2f", account.getBalance() );
        }
        catch(WithdrawException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error: " + e.getMessage());
        }

        scanner.close();
    }
}
