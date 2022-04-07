package practiceDay13;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word 1:");
        String word1 = scan.next();
        System.out.println("Enter a word 2:");
        String word2 = scan.next();
        System.out.println("Enter a word 3:");
        String word3 = scan.next();

        // assign the lenght to variables
        int n1 = word1.length(),
                n2 = word2.length(),
                n3 = word3.length();

        //Check if the lenghts are same
        if (n1==n2 && n2==n3) {
            System.out.println("All words are same length");
        } else if (n1==n2 || (n2==n3) || (n1==n3)) {
            System.out.println("Not Same nor Different lengths");
        } else {
            System.out.println("All different length");
        }
    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
 */