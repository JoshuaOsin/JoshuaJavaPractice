package practiceDay21_MultiDimentionalArray;

public class FindNumberOfSpecialChars {

    public static void main(String[] args) {

        String str = "I like Java Programming really but ";
        String specialChars1 ="â€œjavaâ€�";
        String specialChars2 ="â€œpythonâ€�";

        char[] chars = str.toCharArray();

        int count1 =0;

        for (char each : chars) {
            if (specialChars1.contains(""+each)) {
                count1++;
            }
        }
        int count2 =0;

        for (char each : chars) {
            if (specialChars2.contains(""+each)) {
                count2++;
            }
        }
        System.out.println("â€œjavaâ€� = " + count1);
        System.out.println("â€œpythonâ€� = " + count2);
    }
}
