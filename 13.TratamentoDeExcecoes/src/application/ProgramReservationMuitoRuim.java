package application;

// Muito ruim, pois a lógica de validação está no programa principal e não na reserva
@SuppressWarnings("unused")
public class ProgramReservationMuitoRuim {
    // Quando acrescenta a exceção no método, a exceção vai propagar no método
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
//            Date now = new Date();
//            if (checkIn.before(now) || checkOut.before(now)) {
//                System.out.println("Error in reservation: Reservation dates for update must be future dates");
//            } else if (!checkOut.after(checkIn)) {
//                System.out.println("Error in reservation: Check-out date must be before check-in date");
//            } else {
//                reservation.updateDates(checkIn, checkOut);
//                System.out.println("Reservation: " + reservation);
//            }
//        }
//
//        scanner.close();
//    }
}
