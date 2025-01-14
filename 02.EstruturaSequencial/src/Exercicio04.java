// Programa que lê o número de um funcionário, horas trabalhadas, valor que recebe por hora e calcula o salário desse funcionário com 2 casas decimais.
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor recebido por hora trabalhada: ");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("Número do funcionário: " + numeroFuncionario);
        System.out.printf("Salário do funcionário: R$%.2f", salario);
        sc.close();
    }
}
