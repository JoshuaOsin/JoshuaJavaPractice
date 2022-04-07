package practiceDay24MethodReturn;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram( String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        if (Arrays.equals(chars1, chars2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("cba","bac"));
    }
}
