package practiceDay25MethodOverloading;

public class ReverseArray {

    // reverse the given integer array, return reversed integer array
    public static int[] reverseArray(int[] arr) {
        int [] reversed = new int[arr.length];
        for (int i = 0, j= arr.length-1; i < arr.length ; i++,j--) {
            reversed[i] = arr [j];
        }
        return reversed;
    }

    // reverse the given integer array, return reversed integer array
    public static double[] reverseArray(double[] arr) {
        double [] reversed = new double[arr.length];
        for (int i = 0, j= arr.length-1; i < arr.length ; i++,j--) {
            reversed[i] = arr [j];
        }
        return reversed;
    }

    // reverse the given integer array, return reversed integer array
    public static char[] reverseArray(char[] arr) {
        char [] reversed = new char[arr.length];
        for (int i = 0, j= arr.length-1; i < arr.length ; i++,j--) {
            reversed[i] = arr [j];
        }
        return reversed;
    }

    // reverse the given integer array, return reversed integer array
    public static String[] reverseArray(String[] arr) {
        String [] reversed = new String[arr.length];
        for (int i = 0, j= arr.length-1; i < arr.length ; i++,j--) {
            reversed[i] = arr [j];
        }
        return reversed;
    }
}
