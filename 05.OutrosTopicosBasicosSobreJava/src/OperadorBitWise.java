import java.util.Scanner;

public class OperadorBitWise {

    public static void main(String[] args) {
        /**
         * Operadores bitwise:
         * & -> Operação "E"(AND) bit a bit
         * | -> Operação "OU"(OR) bit a bit
         * ^ -> Operação "OU-exclusivo"(XOR) bit a bit
         */

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        Scanner sc = new Scanner(System.in);
        
        int mask = 0b100000;
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true");
        }
        else {
            System.out.println("6th bit is false");
        }

        sc.close();
    }
}
