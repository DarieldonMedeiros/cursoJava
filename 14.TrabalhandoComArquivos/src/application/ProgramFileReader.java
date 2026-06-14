package application;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class ProgramFileReader {
    private static final Logger logger = Logger.getLogger(ProgramFileReader.class.getName());
    public static void main(String[] args) {
        String path = "C:\\Users\\darie\\OneDrive\\Documentos\\Workspace\\cursoJava\\14.TrabalhandoComArquivos\\src\\anotações\\02 - FileReader e BufferedReader.txt";

        FileReader fr = null;
        BufferedReader br = null;

        //noinspection TryFinallyCanBeTryWithResources
        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
           try{
               if (br != null) {
                   br.close();
               }
               if (fr != null) {
                   fr.close();
               }
           } catch (IOException e) {
               logger.severe("Error: " + e.getMessage());
           }
        }
    }
}
