package practiceDay12;

import java.util.Scanner;

public class NumberOfPeople {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people do you live with?");

        int numberOfPeople = scan.nextInt();

        if (numberOfPeople < 3 ){
            System.out.println("Live with less than 3 people");
        } else if (numberOfPeople > 6){
            System.out.println("Live with more than 6 people");
        } else{
            System.out.println("Live with 3 - 6 people");
        }
    }
}
