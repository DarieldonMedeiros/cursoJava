import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tipo de conbustível: (1. Álcool, 2. Gasolina, 3. Diesel, 4. Fim)");
        int combustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (combustivel != 4) {
            switch (combustivel){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Código Inválido, digite mais uma vez!");
            }

            System.out.println("Digite o tipo de conbustível: (1. Álcool, 2. Gasolina, 3. Diesel, 4. Fim)");
            combustivel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
