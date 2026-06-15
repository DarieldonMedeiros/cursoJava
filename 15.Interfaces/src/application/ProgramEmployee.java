package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramEmployee {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\darie\\OneDrive\\Documentos\\Workspace\\cursoJava\\15.Interfaces\\src\\application\\files\\Employees.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list); // Essa é uma forma de ordenar a coleção
            for(Employee emp: list){
                System.out.println(emp);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
