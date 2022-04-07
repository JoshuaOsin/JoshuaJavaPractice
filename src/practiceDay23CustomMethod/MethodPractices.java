package practiceDay23CustomMethod;

import java.util.Arrays;

public class MethodPractices {
    public static void main(String[] args) {
        printOddNumbers();
        System.out.println();
        System.out.println(grade(75));
        calcArea(10);
        printEachCharacter("Joshua");
        fullName("cYdEo", "SCHOOL");
        System.out.println(anagram("silent", "listen"));
    }

    public static void printOddNumbers() {
        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i+ " ");
        }
    }

    public static void printEvenNumbers() {
        for (int i = 2; i <= 100; i+=2) {
            System.out.print(i+ " ");
        }
    }

    public static boolean isEligable(int age) {
        if (age > 21) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEligableToVote(int age, String country) {
        if (age >= 21 && country.equals("USA")) {
            return true;
        } else {
            return false;
        }
    }

    public static char grade(int score) {
        char grade= ' ';
        if (score < 0 || score > 100) {
            System.err.println("Invalid Entry");
            System.exit(0);
        } else if (score > 90) {
            grade='A';
        } else if (score > 80) {
            grade='B';
        } else if (score > 70) {
            grade='C';
        } else if (score > 60) {
            grade='D';
        } else {
            grade='F';
        }
        return grade;
    }

    public static void calcArea(double radius) {
        System.out.println(radius*radius*3.14/2);
    }

    public static void calcArea(double width, double length) {
        System.out.println(width*length);
    }

    public static double convertDollarToEuro(double dollar, double parite) {
        return dollar*parite;
    }

    public static double convertDollarTolira(double dollar, double parite) {
        return dollar*parite;
    }

    //  multiply the mass value by 2.205
    public static double converKgToLb(double kg) {
        return kg*2.205;
    }

    public static String evenOddOrZero(int number) {
        if (number>0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    public static void printEachCharacter(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(""+ word.charAt(i));
        }
    }

    public static void printEachElement( int [] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    public static double calculator(double num1, double num2, char mathOperator) {
        char ch = mathOperator;
        while (!(ch == '+' || ch == '-' ||ch == '*' ||ch == '/' )) {
            System.out.println("Invalid Entry math operator");
            System.exit(0);
        }

        double result=0;
        switch (ch){
            case '+':
                result = (num1 + num2);
                break;
            case '-':
                result = (num1 - num2);
                break;
            case '*':
                result = (num1 * num2);
                break;
            default:
                result = (num1 / num2);
                break;
        }
        return result;
    }

    public static void fullName(String name, String lastName) {
        String result = "";

        result += name.toUpperCase().charAt(0) +  name.toLowerCase().substring(1)+ " ";
        result += lastName.toUpperCase().charAt(0) + lastName.toLowerCase().substring(1) +" ";
        System.out.println(result);

    }

    public static boolean anagram( String word1, String word2 ) {

        char [] chars1 = word1.toCharArray();
        char [] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1,chars2);

    }

}