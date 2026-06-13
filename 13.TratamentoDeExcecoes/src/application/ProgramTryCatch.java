package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTryCatch {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program!");
    }

    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2(){
        System.out.println("***METHOD2 START***");
        Scanner scanner = new Scanner(System.in);

        try {
            String[] vector = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        scanner.close();
        System.out.println("***METHOD2 END***");
    }
}
