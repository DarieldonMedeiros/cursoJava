package application.exercicio.application;

import application.exercicio.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplicationProduct {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        String strPath = "C:\\Users\\darie\\OneDrive\\Documentos\\Workspace\\cursoJava\\14.TrabalhandoComArquivos\\src\\application\\exercicio\\Source.csv";
        File file = new File(strPath);
        String path = file.getParent();
        boolean success = new File(path + "\\out").mkdir();
        System.out.println("Folder out created: " + success);

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();
            while(line != null){
                String[] parts = line.split(",");
                String name = parts[0];
                Double price = Double.parseDouble(parts[1]);
                Integer quantity = Integer.parseInt(parts[2]);

                products.add(new Product(name, price, quantity));
                line = br.readLine();
            }

            System.out.println("Output:");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\out\\summary.csv", true))) {
                for (Product product : products) {
                    System.out.println(product);
                    bw.write(product.toString());
                    bw.newLine();
                }
                System.out.println(path + "\\out\\summary.csv" + " CREATED!");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
