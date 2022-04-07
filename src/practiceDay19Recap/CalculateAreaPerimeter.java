package practiceDay19Recap;

import java.util.Scanner;

public class CalculateAreaPerimeter {
    public static void main(String [] arg) {
        Scanner scan = new Scanner(System.in);

        String  answer= "";
        do {

            System.out.println("Please enter radius");
            double radius = scan.nextDouble();

            if (radius <= 0) {
                System.err.println("Invalid entry");
                System.exit(0);
            }
            System.out.println("Diameter : " + (2 * radius));
            System.out.println("Area : " + (3.14 * radius / 2));
            System.out.println("Perimeter : " + (2 * 3.14 * radius));

            System.out.println("Would you like to calculate another circle?");
            answer = scan.next().toLowerCase();
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
            }
        } while (answer.equals("yes"));
    }
}
