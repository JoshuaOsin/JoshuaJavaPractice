package practiceDay12;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("how many total shares have you had already?");

        int totalShare = scan.nextInt();

        if (totalShare <= 0){ // does not have any share
            System.out.println("Invalid Entry");
        } else{ // calculation of shares

            System.out.println("how much is your total value in the stock market");
            double totalValue = scan.nextDouble();

            System.out.println("enter the name of the company in which you have the most shares");
            scan.nextLine(); // clear the previous nextDouble()
            String  nameOfTheCompany = scan.nextLine();

            System.out.println("Your total stock market holding is $"
                    + totalValue +" which is made up of " + totalShare +" shares. "
                    + nameOfTheCompany +" is your company holdings");
        }

    }
}
/*
 - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */