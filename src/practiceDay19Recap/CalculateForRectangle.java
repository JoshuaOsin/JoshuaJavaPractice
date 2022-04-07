package practiceDay19Recap;

import java.util.Scanner;

public class CalculateForRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")) {


            System.out.println("Please enter length of rectangle");
            double side = scan.nextDouble();
            if (side <= 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.println("Please enter width of rectangle");
            double width = scan.nextDouble();
            if (width <= 0) {
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }

            System.out.println("Area : " + (width * side));
            System.out.println("Perimeter : " + (2 * (width + side)));

            System.out.println("Would you like to calculate another rectangle?");
            answer = scan.next().toLowerCase();
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo rectangle APP");
            }
        }
    }
}
