package practice;

import java.util.Scanner;

public class NameOfNumbers {

    public static void main(String[] args) {


        // int number =1;
        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);
        // request user input
        System.out.println("Please give the number between 1-9");
        // create int variable, read user input and assign the int
        int number = Integer.parseInt(inputInteger.next());
        // use the input


        if (number==0){
            System.out.println("Zero");
        }
        if (number==1){
            System.out.println("One");
        }
        if (number==2){
            System.out.println("Two");
        }
        if (number==3){
            System.out.println("Three");
        }
        if (number==4){
            System.out.println("Four");
        }
        if (number==5){
            System.out.println("Five");
        }
        if (number==6){
            System.out.println("Six");
        }
        if (number==7){
            System.out.println("Seven");
        }
        if (number==8){
            System.out.println("Eight");
        }
        if (number==9){
            System.out.println("Nine");
        }

/*
1. Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One
 */




    }



}
