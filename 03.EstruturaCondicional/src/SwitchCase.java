import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int dia;
        String nomeDia;
        System.out.println("Digite o número correspondente ao dia da semana: ");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-Feira";
                break;
            case 3:
                nomeDia = "Terça-Feira";
                break;
            case 4:
                nomeDia = "Quarta-Feira";
                break;
            case 5:
                nomeDia = "Quinta-Feira";
                break;
            case 6:
                nomeDia = "Sexta-Feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Valor Inválido";
                break;
        }

        System.out.println("Dia da semana: " + nomeDia);

        sc.close();
    }
}
