package practiceDay24MethodReturn;

public class MethodReturnPractice {

    public static void main(String[] args) {

        String sentence = "Java java java python python",
                word = "java";
        System.out.println(frequencyOfWord(sentence, word));
    }

    public static int frequencyOfWord(String sentence, String word) {
        int count =0;

        String [] words = sentence.split(" ");

        for (String each : words) {
            if (each.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;

    }



}
