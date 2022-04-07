package practiceDay24MethodReturn;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {

    public static String reverse(String word) {
        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static String reversed2(String word) {
        char[] chars = word.toCharArray();

        String reversed = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += chars[i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Java"));
        System.out.println(reversed2("Java"));

    }
}
