package practiceDay24MethodReturn;

public class ContainsArray {

    public static boolean contains ( int [] array , int number) {
        for (int each : array) {
            if (each == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int num = 3;

        System.out.println(contains(arr, num)); //===> false
    }
}
