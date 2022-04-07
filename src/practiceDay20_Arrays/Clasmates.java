package practiceDay20_Arrays;

import java.io.FilterOutputStream;

public class Clasmates {
    public static void main(String[] args) {
        String [] classmates = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };

        for (String classmate : classmates){
            String initials = "";
            initials = classmate.charAt(0)+ "." +classmate.charAt(classmate.indexOf(" ")+1);
            System.out.println(initials.toUpperCase());
        }

        for (String classmate : classmates) {
            String result = "";
            for (int i = classmate.length()-1; i >=0 ; i--) {
                result += classmate.charAt(i);
            }
            System.out.println(result);
        }


    }
}
