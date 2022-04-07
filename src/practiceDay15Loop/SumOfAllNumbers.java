package practiceDay15Loop;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {

        System.out.println("Please give the number");

        int num = new Scanner(System.in).nextInt();

        int sum = 0;

        for (int i = 1; i <=num; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
