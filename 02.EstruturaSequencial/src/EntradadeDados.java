import java.util.Locale;
import java.util.Scanner;

public class EntradadeDados {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int numero;
        double numeroDouble;
        char caractere;

        // String
        System.out.println("Digite o que será colocado na variável x: ");
        x = sc.next();
        System.out.println("A string x digitada foi: " + x);
        
        // Int
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();
        System.out.println("O número digitado foi: " + numero);
        
        // Double
        System.out.println("Digite um número real: ");
        numeroDouble = sc.nextDouble();
        System.out.println("O número digitado foi: " + numeroDouble);

        // Ler vários dados na mesma linha (separados por espaço)
        String a;
        int b;
        double c;

        System.out.println("Digite uma string, um inteiro e um double: ");
        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        // Caractere
        System.out.println("Digite um caractere: ");
        caractere = sc.next().charAt(0);
        System.out.println("O caractere digitado foi: " + caractere);


        // Ler vários dados até a quebra de linha
        String s1, s2, s3;
        System.out.println("Digite 3 palavras: ");
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
