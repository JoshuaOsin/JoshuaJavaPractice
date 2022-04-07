package practiceDay20_Arrays;

import java.util.Arrays;

public class DescendingOrder2 {
    public static void main(String[] args) {

        int[] numbers = {2, 5, 1, 6, 3, 8, 9}; // declare and initialize

        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        int[] numbersDescending = new int[numbers.length]; // just declare how many elements


        System.out.println("Before numbersDescending is empty");
        System.out.println(Arrays.toString(numbersDescending));

        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            numbersDescending[i] = numbers[j];
        }
        System.out.println("After sort");
        System.out.println(Arrays.toString(numbersDescending));

    }
}
