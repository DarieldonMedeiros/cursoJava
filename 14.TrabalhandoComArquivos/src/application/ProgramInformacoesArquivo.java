package application;

import java.io.File;
import java.util.Scanner;

public class ProgramInformacoesArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // C:\Users\darie\OneDrive\Documentos\Workspace\cursoJava\14.TrabalhandoComArquivos\src\anotações\06 - Informações do caminho do arquivo.txt
        System.out.print("Enter a file path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        scanner.close();
    }
}
