import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido03 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("MENOR = " + n1);
        } else if (n2 < n3) {
            System.out.println("MENOR = " + n2);
        } else if(n1 == n2 && n2 < n3) {
            System.out.println("MENOR = " + n1 + " e " + n2);
        } else  if(n1 == n3 && n1 < n2){
            System.out.println("MENOR = " + n1 + " e " + n3);
        } else if(n2 == n3 && n2 < n1){
            System.out.println("MENOR = " + n2 + " e " + n3);
        } else if(n1 == n3 && n1 == n2){
            System.out.println("MENOR = " + n1 + ", " + n2 + " e " + n3);
        }
        else {
            System.out.println("MENOR = " + n3);
        }

        sc.close();
    }
}
