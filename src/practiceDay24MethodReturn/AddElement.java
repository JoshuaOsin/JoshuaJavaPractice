package practiceDay24MethodReturn;

import java.util.Arrays;

public class AddElement {

    public static int[] addElement(int[] array, int newElement) {

        int [] newArray = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {
            newArray[i]= array[i];
        }
        newArray[array.length]= newElement;

        return newArray;
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3};
        int num = 4;

        arr = addElement(arr, num); // ==> {1,2,3,4}

        System.out.println(Arrays.toString(arr));
    }
}
