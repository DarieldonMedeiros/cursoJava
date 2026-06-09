package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorker {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o nome do departamento: ");
        String departmentName = scanner.nextLine();
        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome: ");
        String workerName = scanner.nextLine();
        System.out.print("Nível: ");
        String workerLevel = scanner.nextLine();
        System.out.print("Salário Base: ");
        double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("Informe a quantidade de contratos que este trabalhador possui: ");
        int numberContracts = scanner.nextInt();

        for (int i = 1; i <= numberContracts; i++) {
            System.out.println("Entre com o contrato #" + i + " do trabalhador: ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = simpleDateFormat.parse(scanner.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duração (horas): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        scanner.nextLine();
        System.out.print("Entre com o mês e ano para calcular a renda (MM/YYYY): ");
        String monthAndYear = scanner.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Nome do trabalhador: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Renda em " + monthAndYear + ": U$" + String.format("%.2f", worker.income(year, month)));

        scanner.close();
    }
}
