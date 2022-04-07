package practiceDay16LoopString;

import java.util.Scanner;

public class ManualMultiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = 0;
        if (num1 < 0 || num2 < 0) {
            System.out.println("Invalid entry");
        } else {
            for (int i = 0; i < num2; i++) {
                result += num1;
            }
            System.out.println(result);
        }
    }

}
