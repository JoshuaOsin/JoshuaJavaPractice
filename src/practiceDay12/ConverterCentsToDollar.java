package practiceDay12;

import java.util.Scanner;

public class ConverterCentsToDollar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents");

        int givenCents = scan.nextInt();

        System.out.println(givenCents+ " cents equal to: "
                +givenCents/100+" dollars and "+givenCents%100+" cents");

    }
}
/*
Write a program that can convert cents to dollars,
if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */