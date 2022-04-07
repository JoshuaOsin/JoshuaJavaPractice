package practice;

public class LongestPalindrome {

    public static void main(String[] args) {

        String word = "dasdasddsadsaa";
        String longestPalindrome = "";


        // Starting from first index to last index create possible substring
        // integer i will be used first index of substring
        for (int i = 0; i < word.length() ; i++) {

            String subWord =  "";

            // integer j will be used last index of substring
            // since i is the first index last index should be more than i at least +1
            for (int j = i; j < word.length() ; j++) {

                subWord = word.substring(i,j);

                // Check first it is palindrome then is it the longest
                if (isPalindrome(subWord) && subWord.length()>longestPalindrome.length()){
                        longestPalindrome = subWord;
                }
           }
        }
        System.out.println(longestPalindrome);

    }

    public static boolean isPalindrome(String str) {
        if (str.length()<3) {
            return false;
        }
        return reverse(str).equalsIgnoreCase(str);
    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

}
/*
1.Write a program that finds the longest palindrome in a String
    Ex:
    String = "dasdasddsadsaa";
    output:
    asdasddsadsa
 */