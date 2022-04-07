package practiceDay24MethodReturn;

public class FrequencyOfIntegerArray {

    public static int frequency(int[] array, int number) {
        int count =0;

        for (int each : array) {
            if (each == number) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};

        System.out.println(frequency(array, 1)); // ==> 5
    }
}
