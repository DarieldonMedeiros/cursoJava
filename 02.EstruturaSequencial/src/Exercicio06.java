// Programa que lê 3 valores double, A, B e C e calcula:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os valores de A, B e C: ");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaTriangulo = A * C / 2.0;
        System.out.printf("Área do triângulo: %.3f\n", areaTriangulo);
        
        double areaCirculo = Math.PI * C * C;
        System.out.printf("Área do círculo: %.3f\n", areaCirculo);
        
        double areaTrapezio = (A + B) * C / 2.0;
        System.out.printf("Área do trapézio: %.3f\n", areaTrapezio);

        double areaQuadrado = B * B;
        System.out.printf("Área do quadrado: %.3f\n", areaQuadrado);

        double areaRetangulo = A * B;
        System.out.printf("Área do retângulo: %.3f",  areaRetangulo);

        sc.close();
    }
}
