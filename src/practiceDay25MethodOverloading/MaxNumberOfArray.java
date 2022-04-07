package practiceDay25MethodOverloading;

import java.util.Arrays;


public class MaxNumberOfArray {

    // find max number of the given integer array, return integer
    public static int maxNumberOfArray(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            max = (each > max)?each:max;
        }
        return max;
    }

    // find max number of the given double array, return double
    public static double maxNumberOfArray(double[] arr) {
        double max = arr[0];
        for (double each : arr) {
            max = (each > max)?each:max;
        }
        return max;
    }

    // find max number of the given long array, return long
    public static long maxNumberOfArray(long[] arr) {
        long max = arr[0];
        for (long each : arr) {
            max = (each > max)?each:max;
        }
        return max;
    }

    // find max number of the given short array, return short
    public static short maxNumberOfArray(short[] arr) {
        short max = arr[0];
        for (short each : arr) {
            max = (each > max)?each:max;
        }
        return max;
    }

    // find max number of the given float array, return float
    public static float maxNumberOfArray(float[] arr) {
        float max = arr[0];
        for (float each : arr) {
            max = (each > max)?each:max;
        }
        return max;
    }

    // find max number of the given float array, return float
    public static byte maxNumberOfArray(byte[] arr) {
        byte max = arr[0];
        for (byte each : arr) {
            max = (each > max)?each:max;
        }
        return max;
    }
}
