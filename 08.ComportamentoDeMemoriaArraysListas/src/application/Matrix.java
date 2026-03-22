package application;

import java.util.Locale;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns of the matrix  (line = column): ");
        int dimensionMatrix = sc.nextInt();
        
        int[][] matrix = new int[dimensionMatrix][dimensionMatrix];

        int negativeNumbers = 0;
        for ( int i = 0; i < matrix.length; i++){
            for ( int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] < 0) {
                    negativeNumbers++;
                }
            }
        }

        System.out.println("Main diagonal:");
        for ( int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println("\nNegative numbers = " + negativeNumbers);

        sc.close();
    }
}
