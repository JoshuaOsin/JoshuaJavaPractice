package practiceDay19Recap;

import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        System.out.println("Enter a String ");
        String str = new Scanner(System.in).next();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j <str.length() ; j++) {

                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1 ) {
                result += ch;
                break;
            }
        }
        System.out.println("First Unique = " + result);
    }
}
