package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TheatreReservations {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);

        System.out.println("Please enter your first and last name");
        String fullName = userEntry.nextLine().trim();
        int spaceIndex = fullName.indexOf(" ");
        String firstName = fullName.substring(0,spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1);
        System.out.println("Please enter the date of the show you'd like to reserve (yyyy-mm-dd):");
        LocalDate dateOfEvent = LocalDate.parse(userEntry.nextLine());
        System.out.println("Please enter the quantity of tickets to be purchased:");
        int ticketQty = userEntry.nextInt();
        String ticketTotal;
        if (ticketQty ==1){
            ticketTotal = "ticket";
        } else if (ticketQty == 0 || ticketQty>1) {
            ticketTotal = "tickets";
        }else {
            return;
        }
        userEntry.close();


        System.out.println(ticketQty + " " + ticketTotal + " reserved for " + dateOfEvent +  " under " + lastName + ", " + firstName);



    }
}
