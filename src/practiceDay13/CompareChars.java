package practiceDay13;

import java.util.Scanner;

public class CompareChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        char firstChar = word.charAt(0),
                lastChar = word.charAt(word.length()-1);

        if (firstChar == lastChar){
            System.out.println("same");
        } else{
            System.out.println("different");
        }

    }
}
