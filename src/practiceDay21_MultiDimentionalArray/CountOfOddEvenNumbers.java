package practiceDay21_MultiDimentionalArray;

public class CountOfOddEvenNumbers {

    public static void main(String[] args) {

        int[] numbers = {2, 5, 1, 6, 3, 8, 9}; // declare and initialize

        int countEven =0;
        int countOdd =0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);

    }
}
