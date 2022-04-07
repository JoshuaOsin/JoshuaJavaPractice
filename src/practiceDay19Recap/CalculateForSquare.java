package practiceDay19Recap;

import java.util.Scanner;

public class CalculateForSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")) {


            System.out.println("Please enter side of square");
            double side = scan.nextDouble();

            while (side <= 0) {
                System.err.println("Invalid entry");
                System.out.println("Please enter side");
                side = scan.nextDouble();
            }
            System.out.println("Area : " + (side * side));
            System.out.println("Perimeter : " + (4 * side));

            System.out.println("Would you like to calculate another Square?");
            answer = scan.next().toLowerCase();
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
            }
        }
    }
}
