package practiceDay17WhileLoop;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        int sumEven = 0;

        for (int i = 0; i <= 100; i++) {
            if ( i % 2 == 0) {
                sumEven += i;
            }
        }
        System.out.println("sumEven = " + sumEven);
    }
}
