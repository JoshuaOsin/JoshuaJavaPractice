package practiceDay24MethodReturn;

import java.util.Arrays;

public class MergeArrays {

    public static int [] merge ( int [] arr1 ,int [] arr2  ) {
        int [] newArray = new int[arr1.length+ arr2.length];

        int i = 0;

        for (int each : arr1) {
            newArray[i++]= each;
        }
        for (int each : arr2) {
            newArray[i++]= each;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3},
        arr2 = {4,5,6};

        int [] merged= merge(arr1, arr2); //====> {1,2,3,4,5,6}

        System.out.println(Arrays.toString(merged));

    }
}
