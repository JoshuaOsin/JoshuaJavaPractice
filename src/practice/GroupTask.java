package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupTask {
    public static void main(String[] args) {
        System.out.println("1: "+findLongestPalindrome("dasdasddsadsaa"));
        System.out.println("---------------------------------------------------");
        System.out.println("2: "+findShortestPalindrome("asdasddsadsa"));
        System.out.println("---------------------------------------------------");
        System.out.println("3: "+countSubstring("asdasdasdsdsasd","a"));
        System.out.println("---------------------------------------------------");

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,7,7,7));
        System.out.println("4: "+countRepeatingElements(arr));


    }

    public static String findLongestPalindrome(String word){
        String substring;
        int size = word.length();

        while(size>0){
            int firstIndex = 0;
            int lastIndex = size;
            while(lastIndex<=word.length()){
                substring = word.substring(firstIndex,lastIndex);
                String reverse = "";

                for(int i = substring.length()-1; i>=0; i--){
                    reverse += substring.charAt(i);
                }
                if(substring.equals(reverse)){
                    return substring;
                }
                firstIndex++;
                lastIndex++;
            }
            size--;
        }
        return "";
    }

    public static String findShortestPalindrome(String word){
        String substring = "";
        int size = 3;

        while(size<=word.length()){
            int firstIndex = 0;
            int lastIndex = size;
            while(lastIndex<=word.length()){
                substring = word.substring(firstIndex,lastIndex);
                String reverse = "";

                for(int i = substring.length()-1; i>=0; i--){
                    reverse += substring.charAt(i);
                }
                System.out.println(substring);
                if(substring.equals(reverse)){
                    return substring;
                }
                firstIndex++;
                lastIndex++;
            }
            size++;
        }
        return "";
    }

    public static int countSubstring(String word, String substring){
        if(!word.contains(substring)){
            return 0;
        }
        int count = 0;

        for(int i = 0, j = substring.length(); j <= word.length(); i++,j++){
            String newSubstring = word.substring(i,j);
            if(newSubstring.equals(substring)){
                count++;
            }
        }
        return count;
    }

    public static int countRepeatingElements(ArrayList<Integer> arr){
        int count = 0;
        String repeatingElements = "";
        for(int i = 0; i<arr.size(); i++){

            int num = arr.get(i);
            int frequency = 0;

            if(repeatingElements.contains(""+num)){
                continue;
            }

            for(int j = 0; j<arr.size(); j++){
                if(arr.get(j) == num){
                    frequency++;
                }
            }
            if(frequency > 1){
                repeatingElements += ""+num;
                count++;
            }
        }

        return count;
    }
}
