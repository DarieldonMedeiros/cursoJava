package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class aprovados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos alunos serão digitados? ");
        int quantidade = sc.nextInt();
        Alunos[] alunos = new Alunos[quantidade];

        double mediaMinima = 6.0;
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
            sc.nextLine(); // Consumir a quebra de linha
            String name = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            alunos[i] = new Alunos(name, nota1, nota2);
        }

        System.out.println("\nAlunos aprovados:");
        for (Alunos aluno : alunos){
            if (aluno.getMedia()>= mediaMinima){
                System.out.println(aluno.getName());
            }
        }

        sc.close();
    }
}
