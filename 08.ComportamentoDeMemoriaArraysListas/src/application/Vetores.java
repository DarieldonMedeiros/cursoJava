package application;
// Vetor -> Arranjos unidimensionais
// Arranjo (Array) -> Estrutura de dados que armazena um número fixo de valores do mesmo tipo
// Características dos Arrays:
// - Homogênea: dados do mesmo tipo
// - Ordenada: os elementos são acessados por meio de posições
// - Alocada de uma vez só, em um bloco contíguo de memória
// Vantagens:
// - Acesso imediato aos elementos pela sua posição
// Desvantagens:
// - Tamanho fixo: não pode ser redimensionado após a criação
// - Dificuldade para se realizar inserções e deleções

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}
