package practiceDay24MethodReturn;

public class Palindrom {

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        boolean result= true;
        for (int i = 0,j=word.length()-1; i < word.length(); i++,j--) {
            if (word.charAt(i) != word.charAt(j)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isPalindrome2(String word) {

        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
        }
        return reversed.equalsIgnoreCase(word);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Level"));
        System.out.println(isPalindrome2("Level"));
    }
}
