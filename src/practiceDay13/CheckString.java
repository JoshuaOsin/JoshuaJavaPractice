package practiceDay13;

import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        int lenght = word.length();
        if (lenght == 0 ){
            System.out.println("string is empty");
        } else if (lenght > 3 ){
            System.out.println(""+ word.charAt(lenght-3) // ""empty requires for making it a string
                    + word.charAt(lenght-2)
                    + word.charAt(lenght-1) );
        } else {
            System.out.println(word);
        }
    }
}
/*
 Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */