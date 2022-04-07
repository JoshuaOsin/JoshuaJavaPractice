package practiceDay16LoopString;

import java.util.Scanner;

public class FrequencyOfSpecificChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string :");
        String str = scan.nextLine();
        System.out.println("Which char do you need to search for frequency?");
        char ch = scan.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
