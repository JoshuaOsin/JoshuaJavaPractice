package practiceDay16LoopString;

import java.util.Scanner;

public class CountPosNegNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countPos = 0;
        int countNeg = 0;
        for (int i = 1; i <=3 ; i++) {
            System.out.println("Please enter a number " + i + " : ");
            int num = scan.nextInt();
            if (num > 0) {
                countPos++;
            } else if (num < 0) {
                countNeg++;
            }
        }
        System.out.println(countPos + " positive and "+ countNeg + " negative");
    }
}
