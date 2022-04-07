package practiceDay25MethodOverloading;

import java.util.Arrays;

public class MinNumberOfArray {


    // find min number of the given integer array, return integer
    public static int minNumberOfArray(int[] arr) {
            int min = arr[0];
            for (int each : arr) {
                min = (each < min)?each:min;
            }
            return min;
        }

    // find min number of the given double array, return double
    public static double minNumberOfArray(double[] arr) {
        double min = arr[0];
        for (double each : arr) {
            min = (each < min)?each:min;
        }
        return min;
    }

    // find min number of the given long array, return long
    public static long minNumberOfArray(long[] arr) {
        long min = arr[0];
        for (long each : arr) {
            min = (each < min)?each:min;
        }
        return min;
    }

    // find min number of the given short array, return short
    public static short minNumberOfArray(short[] arr) {
        short min = arr[0];
        for (short each : arr) {
            min = (each < min)?each:min;
        }
        return min;
    }

    // find min number of the given float array, return float
    public static float minNumberOfArray(float[] arr) {
        float min = arr[0];
        for (float each : arr) {
            min = (each < min)?each:min;
        }
        return min;
    }

    // find min number of the given byte array, return byte
    public static byte minNumberOfArray(byte[] arr) {
        byte min = arr[0];
        for (byte each : arr) {
            min = (each < min)?each:min;
        }
        return min;
    }

}
