package practice;

public class ShortestPolindrome {

    public static void main(String[] args) {

        String word = "asdasddsadsa";
        // Make temporary string which has more char than word
        String shortestPalindrome = word + "!"; // adding ! char at the end

        // Starting from first index to last index create possible substring
        // integer i will be used first index of substring
        for (int i = 0; i < word.length(); i++) {

            String subWord = ""; // initially empty

            // integer j will be used last index of substring
            // since i is the first index last index should be more than i at least +1
            for (int j = i+1; j < word.length(); j++) {

                subWord = word.substring(i, j);

                // Check first it is palindrome then is it the shortest
                if (isPalindrome(subWord) && subWord.length() < shortestPalindrome.length()) {
                    shortestPalindrome = subWord;
                }
            }
        }

        System.out.println(shortestPalindrome);
    }

    public static boolean isPalindrome(String str) {
        if (str.length()<3) {
            return false;
        }
        return reverse(str).equalsIgnoreCase(str);
    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


}
/*
2.Write a program that finds the shortest palindrome in a String (minimum substring with 3 letters)
    Ex:
    String = "asdasddsadsa";
    output:
    sdds
 */