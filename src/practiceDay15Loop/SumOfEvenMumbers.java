package practiceDay15Loop;

public class SumOfEvenMumbers {

    public static void main(String[] args) {

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            } else {
                sumOfOdd += i;
            }
        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);
    }
}
