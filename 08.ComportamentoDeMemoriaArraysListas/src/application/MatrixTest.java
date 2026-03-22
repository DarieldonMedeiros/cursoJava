package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrixTest {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns of the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter the values of the matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the chosen number: ");
        int chosenNumber = sc.nextInt();

        System.out.println();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == chosenNumber) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (j < matrix[i].length -1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
