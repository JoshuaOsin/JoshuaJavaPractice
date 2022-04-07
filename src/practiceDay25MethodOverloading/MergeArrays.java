package practiceDay25MethodOverloading;

import java.util.Arrays;

public class MergeArrays {

    // merge given two integer array, return merged array
    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            mergedArray[i++] = each;
        }
        for (int each : arr2) {
            mergedArray[i++] = each;
        }
        return mergedArray;
    }

    // merge given two double array, return merged array
    public static double[] mergeArray(double[] arr1, double[] arr2) {
        double[] mergedArray = new double[arr1.length + arr2.length];
        int i = 0;
        for (double each : arr1) {
            mergedArray[i++] = each;
        }
        for (double each : arr2) {
            mergedArray[i++] = each;
        }
        return mergedArray;
    }

    // merge given two char array, return merged array
    public static char[] mergeArray(char[] arr1, char[] arr2) {
        char[] mergedArray = new char[arr1.length + arr2.length];
        int i = 0;
        for (char each : arr1) {
            mergedArray[i++] = each;
        }
        for (char each : arr2) {
            mergedArray[i++] = each;
        }
        return mergedArray;
    }

    // merge given two String array, return merged array
    public static String[] mergeArray(String[] arr1, String[] arr2) {
        String[] mergedArray = new String[arr1.length + arr2.length];
        int i = 0;
        for (String each : arr1) {
            mergedArray[i++] = each;
        }
        for (String each : arr2) {
            mergedArray[i++] = each;
        }
        return mergedArray;
    }
}
