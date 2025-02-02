import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int numero = sc.nextInt();
        int soma = 0;
        while(numero != 0){
            soma += numero;
            System.out.println("Digite outro número: ");
            numero = sc.nextInt();
        }

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
