package practiceDay15Loop;

import java.util.Scanner;

public class sumOfDigitsInString {
    public static void main(String[] args) {

        System.out.println("Enter String :");
        String word = new Scanner(System.in).nextLine();

        int sum =0;

        for (int i=0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= '0' && ch <= '9') {
                sum += ch -48;
            }
        }
        System.out.println("sum = " + sum);
    }
}
