import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.println("Digite a hora final: ");
        int horaFinal = sc.nextInt();
        int duracao;
        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else if (horaFinal < horaInicial) {
            duracao = 24 - horaInicial + horaFinal;
        } else {
            duracao = 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
