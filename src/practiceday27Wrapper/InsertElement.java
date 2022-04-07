package practiceday27Wrapper;

public class InsertElement {

    // Create a method named insert that passes three parameters: double array, double index, double element.
    // the method inserts the given element to the given index of the array and returns the new array
    public static int[] insertElement(int[] arr, int index, int element) {
        arr[index]= element;
        return arr;
    }

    // Create a method named insert that passes three parameters: double array, double index, double element.
    // the method inserts the given element to the given index of the array and returns the new array
    public static double[] insertElement(double[] arr, int index, double element) {
        arr[index]= element;
        return arr;
    }

    // Create a method named insert that passes three parameters: char array, char index, char element.
    // the method inserts the given element to the given index of the array and returns the new array
    public static char[] insertElement(char[] arr, int index, char element) {
        arr[index]= element;
        return arr;
    }

    // Create a method named insert that passes three parameters: String array, String index, String element.
    // the method inserts the given element to the given index of the array and returns the new array
    public static String[] insertElement(String[] arr, int index, String element) {
        arr[index]= element;
        return arr;
    }



}
