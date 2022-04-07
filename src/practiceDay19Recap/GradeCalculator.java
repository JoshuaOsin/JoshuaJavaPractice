package practiceDay19Recap;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")) {

            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (score < 0 || score > 100) {
                System.err.println("Invalid Entry");
                System.exit(0);
            } else if (score > 90) {
                System.out.println("A");
            } else if (score > 80) {
                System.out.println("B");
            } else if (score > 70) {
                System.out.println("C");
            } else if (score > 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Would you like to calculate another rectangle?");
            answer = scan.next().toLowerCase();
            if (answer.equals("no")) {
                System.out.println("hank you for using Cydeo Grade Calculator APP");
            }
        }
    }
}
