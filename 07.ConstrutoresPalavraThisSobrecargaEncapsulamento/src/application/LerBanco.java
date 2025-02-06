package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class LerBanco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Banco banco;
        
        System.out.print("Enter the account number: ");
        int numeroDaConta = sc.nextInt();
        // O nextInt só pega inteiro, logo a quebra de linha fica pendente de ser consumida
        System.out.print("Enter the  account holder: ");
        sc.nextLine(); // a quebra de linha é consumida aqui
        String nomeDoTitular = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        String escolha = sc.nextLine();
        while (!escolha.equals("y") && !escolha.equals("n")) {
            System.out.print("Only (y/n) are valid options, choose again: ");
            escolha = sc.nextLine();
        }

        if (escolha.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double depositoInicial = sc.nextDouble();
            banco = new Banco(numeroDaConta, nomeDoTitular, depositoInicial);
        }
        else {
            banco = new Banco(numeroDaConta, nomeDoTitular);
        }

        System.out.println("\nAccount data: ");
        System.out.println(banco);

        System.out.print("\nEnter a deposit value: ");
        double deposito = sc.nextDouble();
        banco.deposito(deposito);
        System.out.println("Updated account data: ");
        System.out.println(banco);

        System.out.print("\nEnter a withdraw value: ");
        double saque = sc.nextDouble();
        banco.saque(saque);
        System.out.println("Updated account data: ");
        System.out.println(banco);
        
        sc.close();
    }
}
