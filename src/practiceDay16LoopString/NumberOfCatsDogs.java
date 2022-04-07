package practiceDay16LoopString;

import java.util.Scanner;

public class NumberOfCatsDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string :");
        String str = scan.nextLine().toLowerCase();

        int countCats = 0;
        int countDogs = 0;

        while (str.contains("cat") || str.contains("dog")) {
            if (str.contains("cat")) {
                countCats++;
                str = str.replaceFirst("cat", "");
            }
            if (str.contains("dog")) {
                countDogs++;
                str = str.replaceFirst("dog", "");
            }
        }
        if (countCats == countDogs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
