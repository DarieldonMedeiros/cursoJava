package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ReadStudents {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();
        
        System.out.print("Grade 1: ");
        student.grade1 = sc.nextDouble();

        System.out.print("Grade 2: ");
        student.grade2 = sc.nextDouble();

        System.out.print("Grade 3: ");
        student.grade3 = sc.nextDouble();

        System.out.println("\n" + student);

        sc.close();
    }
}
