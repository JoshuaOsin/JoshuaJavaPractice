package practiceDay19Recap;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {

        System.out.println("Enter a String ");
        String str = new Scanner(System.in).next();

        String result = "";
        int countPrevious =0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j <str.length() ; j++) {

                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count > countPrevious ) {
                result = ""+ ch;
                countPrevious =count;
            }
        }
        System.out.println(result+ " displayed "+ countPrevious + " times");
    }
}
