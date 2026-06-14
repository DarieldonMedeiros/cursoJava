package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFile {

    public static void main(String[] args) {

        // A barra invertida é o prefixo de caracteres especiais, logo \\ representa \
        File file = new File("C:\\Users\\darie\\OneDrive\\Documentos\\Workspace\\cursoJava\\14.TrabalhandoComArquivos\\src\\anotações\\01 - Lendo arquivo texto com classes File e Scanner.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
