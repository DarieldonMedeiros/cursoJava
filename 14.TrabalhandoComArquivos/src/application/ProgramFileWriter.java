package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class ProgramFileWriter {
    public static final Logger logger = Logger.getLogger(ProgramFileWriter.class.getName());
    public static void main(String[] args) {

        String[] lines = new String[] {"Primeira linha inserida pelo Programa!", "Segunda linha inserida pelo Programa!", "Terceira linha inserida pelo Programa!"};

        String path = "C:\\Users\\darie\\OneDrive\\Documentos\\Workspace\\cursoJava\\14.TrabalhandoComArquivos\\src\\anotações\\04 - Linhas inseridas pelo programa.txt";

        // Ao colocar o true no parâmetro do FileWriter, ele não recria o arquivo!
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            logger.severe(e.getMessage());
        }
    }
}
