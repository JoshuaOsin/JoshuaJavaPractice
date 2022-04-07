package practiceDay19Recap;

import java.util.Scanner;

public class DuplicatedCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a String ");
        String str = new Scanner(System.in).nextLine();
        char firstChar = ' ';
        int indexOfFirstChar = -1;
        for (int i = 0; i < str.length(); i++) { //outer loop start checking each chars
            char ch = str.charAt(i); // brings the char

            for (int j = i+1; j < str.length(); j++) { //inner loop compares
                if (ch == str.charAt(j)) {
                    firstChar = ch;
                    indexOfFirstChar = i;
                    break;
                }
            }
            if (firstChar != ' ') {
                System.out.println("firstChar = " + firstChar);
                System.out.println("indexOfFirstChar = " + indexOfFirstChar);
                break;
            }
        }

    }
}
