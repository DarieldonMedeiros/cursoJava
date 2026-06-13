package application;

// Solução ruim, pois ainda tem validação acontecendo no método principal
@SuppressWarnings("unused")
public class ProgramReservationRuim {
//    public static void main(String[] args) throws ParseException {
//        Scanner scanner = new Scanner(System.in);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//        System.out.print("Room number: ");
//        Integer roomNumber = Integer.parseInt(scanner.nextLine());
//        System.out.print("Check-in date (dd/MM/yyyy): ");
//        Date checkIn = sdf.parse(scanner.nextLine());
//        System.out.print("Check-out date (dd/MM/yyyy): ");
//        Date checkOut = sdf.parse(scanner.nextLine());
//
//        if (!checkOut.after(checkIn)) {
//            System.out.println("Error in reservation: Check-out date must be after check-in date");
//        } else {
//            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
//            System.out.println("Reservation: " + reservation);
//
//            System.out.println("\nEnter data to update the reservation: ");
//            System.out.print("Check-in date (dd/MM/yyyy): ");
//            checkIn = sdf.parse(scanner.nextLine());
//            System.out.print("Check-out date (dd/MM/yyyy): ");
//            checkOut = sdf.parse(scanner.nextLine());
//
//            String error = reservation.updateDates(checkIn, checkOut);
//            if (error != null) {
//                System.out.println("Error in reservation: " + error);
//            }
//            else {
//                reservation.updateDates(checkIn, checkOut);
//                System.out.println("Reservation: " + reservation);
//            }
//        }
//
//        scanner.close();
//    }
}
