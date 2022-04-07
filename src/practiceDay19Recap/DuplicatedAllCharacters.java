package practiceDay19Recap;

import java.util.Scanner;

public class DuplicatedAllCharacters {
    public static void main(String[] args) {
        System.out.println("Enter a String ");
        String str = new Scanner(System.in).next();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;

            for (int j = i+1 ; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (result.contains(""+ch)) {
                continue;
            }
            if (count == 2) {
                result += ch;
                result += count;
            }
        }
        System.out.println("result = " + result);

    }
}
