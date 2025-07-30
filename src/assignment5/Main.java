package assignment5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bookingDetails = sc.nextLine().split(",");
        String stageEvent = bookingDetails[0];
        String customer = bookingDetails[1];
        int noOfSeats = Integer.parseInt(bookingDetails[2]);

        TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);

        int choice = Integer.parseInt(sc.nextLine());

        tb.displayDetails();

        switch (choice) {
            case 1:
                double cashAmount = Double.parseDouble(sc.nextLine());
                tb.makePayment(cashAmount);
                break;
            case 2:
                double walletAmount = Double.parseDouble(sc.nextLine());
                String walletNumber = sc.nextLine();
                tb.makePayment(walletAmount, walletNumber);
                break;
            case 3:
                String holderName = sc.nextLine();
                double cardAmount = Double.parseDouble(sc.nextLine());
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                tb.makePayment(holderName, cardAmount, cardType, ccv);
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

