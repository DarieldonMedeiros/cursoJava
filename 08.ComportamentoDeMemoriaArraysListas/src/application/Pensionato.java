package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Pensionato {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student rooms[] = new Student[10];
        
        System.out.print("How many rooms will be rented? ");
        int roomsRented = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= roomsRented; i++){
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine(); // Limpa o buffer do teclado
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room] = new Student(name, email);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for(int i = 0; i < rooms.length; i++){
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i].toString());
            }
        }
        
        sc.close();
    }
}
