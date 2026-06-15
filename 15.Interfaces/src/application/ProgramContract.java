package application;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramContract {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do Contrato: ");
        System.out.print("Número: ");
        Integer number = Integer.parseInt(scanner.nextLine());
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), dtf);
        System.out.print("Valor do contrato: ");
        Double valor = Double.parseDouble(scanner.nextLine());

        Contract contract = new Contract(number, date, valor);

        System.out.print("Entre com o número de parcelas: ");
        Integer parcelas = Integer.parseInt(scanner.nextLine());

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, parcelas);

        System.out.println("\nParcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        scanner.close();
    }
}
