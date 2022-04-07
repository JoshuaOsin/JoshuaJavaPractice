package practiceDay16LoopString;

import java.util.Scanner;

public class FrequncyOfWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string :");
        String str = scan.nextLine();
        int count = 0;
        while (str.contains("Java")) {
            count++;
            str= str.replaceFirst("Java","");
        }
        System.out.println(count);
    }
}
