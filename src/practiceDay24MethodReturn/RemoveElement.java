package practiceDay24MethodReturn;

import java.util.Arrays;

public class RemoveElement {

    public static int[] removeElement( int [] array, int index) {
        int [] newArray = new int[array.length-1];


        for (int i = 0, j= 0 ; i < array.length; i++) {
            if (i != index) {
                newArray[j++]= array[i];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int []array = {10, 20, 30, 40, 50, 60};
        int index = 2;

        System.out.println(Arrays.toString(removeElement(array, index))); //==== {10, 20, 40, 50, 60}
    }
}
