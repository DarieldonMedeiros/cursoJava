package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramFinally {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\darie\\OneDrive\\Documentos\\Workspace\\cursoJava\\13.TratamentoDeExcecoes\\src\\anotações\\01 - Discussão inicial sobre exceções.txt");

        // Método try pode automaticamente gerenciar recursos
        Scanner scanner = null;
        //noinspection TryFinallyCanBeTryWithResources
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
//        método que está gerenciando recursos
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Error opening file: " + e.getMessage());
//        }
    }
}
