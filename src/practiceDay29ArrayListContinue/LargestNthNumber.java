package practiceDay29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNthNumber {

    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        System.out.println(numbers);

        // find max number and remove it from the list
        for (int i = 1; i < 5; i++) { // repeated 4th time
            int maxNumber = Collections.max(numbers);
            numbers.removeIf( p -> p==maxNumber);
        }
        System.out.println(Collections.max(numbers));
    }


}
/*
1. write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:
				4
 */