package practiceDay12;

import java.util.Scanner;

public class ConvertMilesToKM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Miles:");

        double  givenMiles = scan.nextDouble();

        System.out.println(givenMiles + " miles equal to "
                + givenMiles * 1.609 + " kilometers");
    }
}
