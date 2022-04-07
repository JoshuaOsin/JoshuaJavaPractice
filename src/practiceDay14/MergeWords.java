package practiceDay14;

import java.util.Scanner;

public class MergeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();

        if (word1.charAt(word1.length()-1) == word2.charAt(0)) {
            System.out.println(word1.substring(0,word1.length()-1)+word2);
        }

        for (int i=0 ; i<=2 ;System.out.println(i)) {
            i++;
        }
    }
}
