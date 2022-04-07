package practiceDay27WrapperClass;

import java.util.Arrays;

public class SwapTask {

    /*    method named swap that passes three parameters: integer array, integer i, integer j.
    the method swaps the element at index i with the element at index j, and returns the new array */
    public static int[] swap(int [] array, int i, int j) {

        if (i<0 || j<0 || i>= array.length || j>= array.length) {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    /*    method named swap that passes three parameters: double array, integer i, integer j.
the method swaps the element at index i with the element at index j, and returns the new array */
    public static double[] swap(double [] array, int i, int j) {

        if (i<0 || j<0 || i>= array.length || j>= array.length) {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    /*    method named swap that passes three parameters: char array, integer i, integer j.
the method swaps the element at index i with the element at index j, and returns the new array */
    public static char[] swap(char [] array, int i, int j) {

        if (i<0 || j<0 || i>= array.length || j>= array.length) {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    /*    method named swap that passes three parameters: String array, integer i, integer j.
the method swaps the element at index i with the element at index j, and returns the new array */
    public static String[] swap(String [] array, int i, int j) {

        if (i<0 || j<0 || i>= array.length || j>= array.length) {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};

        swap(arr, 2, 4); // ==>  {10, 20, 50, 40, 30}

        System.out.println(Arrays.toString(arr));
    }
    
}
