package practiceDay25MethodOverloading;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] numbers = {2, 5, 1, 6, 3, 9, 8}; // declare and initialize

        int min = MinNumberOfArray.minNumberOfArray(numbers);
        int max = MaxNumberOfArray.maxNumberOfArray(numbers);
        int[] reversed = ReverseArray.reverseArray(numbers);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println(Arrays.toString(reversed));
    }

}
