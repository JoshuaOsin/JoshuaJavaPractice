package practiceDay17WhileLoop;

import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0;
        int num = 0;

        while (true) {
            System.out.println(" Enter number : ");
            num = scan.nextInt();
            if (num < 0 ) {
                break;
            }
            result += num;
        }
        System.out.println("result = " + result);
    }
}
/*
. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */