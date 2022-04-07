package practiceDay17WhileLoop;

import java.util.Scanner;

public class ManualMultiplyDivide {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first numbers ");
        int num1 = scan.nextInt();

       System.out.println("Enter second numbers ");
        int num2 = scan.nextInt();
        int result = 0;

        if (num1 < 0 || num2 < 0) { // for Multiplication
            System.out.println("Invalid entry");
        } else {
            for (int i = 0; i < num2; i++) {
                result += num1;
            }
            System.out.println("Multiplication " +result);
        }
        int i = 1;
        result =0;
        if ((num1 < 0 || num2 < 0) && num1 > num2) { // for Division
            System.out.println("Invalid entry");
        } else {
            for (; num1 > num2; i++) {
                num1 -= num1;
            }
            System.out.println("Division " +i);
        }

    }
}
/*
Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */