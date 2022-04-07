package practiceDay14;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {

        System.out.println("Enter new word");
        String word = new Scanner(System.in).next();

        int lenght = word.length();

        if ((word.charAt(lenght - 2) == 'l') && (word.charAt(lenght - 1) == 'y')) {
            System.out.println("Really???");
        } else {
            System.out.println("Never Mind");
        }

        //------------------------------------

        if (word.toLowerCase().charAt(0) == 'x') {
            System.out.println(word.substring(1));
        } else {
            System.out.println(word);
        }
        //------------------------------------
        char ch =word.charAt(0);
        if ( ch >= '0' && ch <= '9') {
            System.out.println("first character is digit");
        } else if ( ch >= 'a' && ch <= 'z'){
            System.out.println("first character is lowercase letter");
        } else if ( ch >= 'A' && ch <= 'Z'){
            System.out.println("first character is uppercase letter");
        } else {
            System.out.println("first character is special character");
        }
    }
}
