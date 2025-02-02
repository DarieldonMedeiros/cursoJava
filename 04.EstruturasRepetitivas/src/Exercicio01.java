import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma senha: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha inválida, digite de novo: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido!");


        sc.close();
    }
}
