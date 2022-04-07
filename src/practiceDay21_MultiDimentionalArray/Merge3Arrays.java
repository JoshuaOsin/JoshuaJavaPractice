package practiceDay21_MultiDimentionalArray;

import java.util.Arrays;

public class Merge3Arrays {

    public static void main(String[] args) {

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        int [] merged = new int[arr1.length+ arr2.length+ arr3.length];

        int i = 0;

        for (int each : arr1) {
            merged[i++]= each;
        }
        for (int each : arr2) {
            merged[i++]= each;
        }
        for (int each : arr3) {
            merged[i++]= each;
        }
        System.out.println(Arrays.toString(merged));
    }
}
