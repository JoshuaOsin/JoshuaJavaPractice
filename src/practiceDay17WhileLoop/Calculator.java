package practiceDay17WhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        double num1 = scan.nextDouble();
        System.out.println("Enter number");
        double num2 = scan.nextDouble();
        // ask user math operator
        System.out.println("please enter math operator");
        char ch = scan.next().charAt(0);
        while (!(ch == '+' || ch == '-' ||ch == '*' ||ch == '/' )) {
            System.out.println("Invalid Entry, please enter math operator");
            ch = scan.next().charAt(0);
        }
        switch (ch){
            case '+':
                System.out.println("Result = " + (num1 + num2) );
                break;
            case '-':
                System.out.println("Result = " + (num1 - num2) );
                break;
            case '*':
                System.out.println("Result = " + (num1 * num2) );
                break;
            default:
                System.out.println("Result = " + (num1 / num2) );
                break;
        }
    }
}
/*
write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)

 */