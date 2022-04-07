package practiceDay17WhileLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("would you like to make a reservation? (Yes/N0");
        String answer = scan.next().toLowerCase();
        while (!(answer.equals("yes")|| answer.equals("no"))) {
            System.out.println("Invalid entry");
            System.out.println("would you like to make a reservation? (Yes/N0");
            answer = scan.next().toLowerCase();
        }
        if (answer.equals("yes")) {
            System.out.println("Which type of room? ");
            System.out.println("King Bed ==> 120$\n" +
                    "Queen Bed ==> 100$\n" +
                    "single Bed ==> 80$\n");
            scan.nextLine(); // empty nextLine (enter)
            String roomChoice = scan.nextLine();
            while (!(roomChoice.equals("King Bed")
                    || roomChoice.equals("Queen Bed")
                    || roomChoice.equals("single Bed"))) {
                System.out.println("Invalid entry");
                System.out.println("Which type of room? ");
                roomChoice = scan.nextLine();
            }
            switch (roomChoice) {
                case "King Bed":
                    System.out.println("King Bed ==> 120$");
                    break;
                case "Queen Bed":
                    System.out.println("Queen Bed ==> 100$");
                    break;
                case "single Bed":
                    System.out.println("single Bed ==> 80$");
                    break;
            }

        } else {
            System.out.println("Have a nice day");
        }

    }
}
/*
Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */