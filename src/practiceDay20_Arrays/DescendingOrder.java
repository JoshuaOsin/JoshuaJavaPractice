package practiceDay20_Arrays;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {

        int[] numbers = {2, 5, 1, 6, 3, 8, 9}; // declare and initialize

        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        int[] numbersAscending = numbers;

        int[] numbers3 = Arrays.copyOf(numbersAscending, numbersAscending.length);

        System.out.println("After sort");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers3));
        System.out.println(Arrays.toString(numbersAscending));


        if (numbers == numbersAscending) { // checking if the reference memory allocation
            System.out.println("true == check numbersAscending"); // true
        } else {
            System.out.println("false == check numbersAscending");
        }
        if (numbers == numbers3) { // checking if the reference memory allocation
            System.out.println("true == check numbers3");
        } else {
            System.out.println("false == check numbers3");// false
        }

        if (Arrays.equals(numbers, numbers3)) { // checking if the elements are matched
            System.out.println("true numbers");
        } else {
            System.out.println("false numbers");
        }

        if (Arrays.equals(numbers, numbersAscending)) {  // checking if the elements are matched
            System.out.println("true Ascending ");
        } else {
            System.out.println("false Ascending ");
        }


        int[] numbersDescending = new int[numbers.length]; // just declare how many elements


        System.out.println("Before");
        System.out.println(Arrays.toString(numbersDescending));

        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            numbersDescending[i] = numbers[j];
        }
        System.out.println("After");
        System.out.println(Arrays.toString(numbersDescending));

    }

}
/*
    We have an array, want to sort in Descending   order
 */