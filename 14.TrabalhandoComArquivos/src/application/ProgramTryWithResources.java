package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramTryWithResources {
    public static void main(String[] args) {
        String path = "C:\\Users\\darie\\OneDrive\\Documentos\\Workspace\\cursoJava\\14.TrabalhandoComArquivos\\src\\anotações\\02 - FileReader e BufferedReadera.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
