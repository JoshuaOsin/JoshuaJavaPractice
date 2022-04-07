package practiceDay24MethodReturn;

import java.util.Arrays;

public class ReversedArray {

    public static int[] reverse(int [] array) {
        int [] reversed = new int[array.length];

        for (int i = 0, j = array.length-1; i < array.length; i++,j--) {
            reversed [i] = array[j];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int [] array = {10,20,30,40};
        System.out.println(Arrays.toString(reverse(array)));
    }
}
