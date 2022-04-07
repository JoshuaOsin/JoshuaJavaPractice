package practiceDay12;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Product name:");
        String productName = scan.nextLine();

        System.out.println("Enter price");
        double price = scan.nextDouble();

        System.out.println("Enter quantity");
        int quantity = scan.nextInt();

        System.out.println("Plase enter your first name");
        String firstName = scan.next();

        System.out.println(firstName +", your order for "
                + quantity + " " + productName +" has been places. Your total is "+ quantity*price);

    }
}
/*
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */