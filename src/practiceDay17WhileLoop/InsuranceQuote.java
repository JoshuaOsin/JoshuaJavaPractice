package practiceDay17WhileLoop;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your name");
        String name = scan.nextLine();
        // user needs to put valid gender
        System.out.println("enter your gender");
        String gender = scan.next().toLowerCase();
        while (!(gender.equals("male")||gender.equals("female"))) {
            System.out.println("Invalid entry");
            System.out.println("enter your gender");
            gender = scan.next().toLowerCase();
        }
        // user needs to put valid status
        System.out.println("are you married(Yes/No)");
        String status = scan.next().toLowerCase();
        while (!(status.equals("yes")||status.equals("no"))) {
            System.out.println("Invalid entry");
            System.out.println("are you married(Yes/No)");
            status = scan.next().toLowerCase();
        }
        // user needs to put valid input
        System.out.println("Enter your age (1-120)");
        int age = scan.nextInt();
        while (!(age > 0 && age <=120)) {
            System.out.println("Invalid entry");
            System.out.println("Enter your age (1-120)");
            age = scan.nextInt();
        }
        // user needs to put valid input
        System.out.println("how many miles he/she drives in a day");
        int mile = scan.nextInt();
        while (!(mile > 5)) {
            System.out.println("Invalid entry");
            System.out.println("how many miles he/she drives in a day");
            mile = scan.nextInt();
        }
        System.out.println("Do you want full coverage or liability insurance?");
        scan.nextLine();
        String  typeOfInsurance = scan.nextLine();
        // user needs to put valid input
        System.out.println("Do you have any accidents or claims in past 5 years (Yes/No)");
        String checkAccident = scan.next().toLowerCase();
        while (!(checkAccident.equals("yes")||checkAccident.equals("no"))) {
            System.out.println("Invalid entry");
            System.out.println("Do you have any accidents or claims in past 5 years (Yes/No)");
            checkAccident = scan.next().toLowerCase();
        }
        // user needs to put valid input
        System.out.println("Does your car has an anti-theft device (Yes/No)");
        String checkAntiTheft = scan.next().toLowerCase();
        while (!(checkAntiTheft.equals("yes")||checkAntiTheft.equals("no"))) {
            System.out.println("Invalid entry");
            System.out.println("Does your car has an anti-theft device (Yes/No)");
            checkAntiTheft = scan.next().toLowerCase();
        }
        double price = 0;
        double discount = 0;
        // calculation sequence
        if (typeOfInsurance.equals("full coverage")) {
            price += (age < 25)? 160: 120;
            price += (mile <= 10)? 20 : (mile <=50 )? 40: 70;
        } else {
            price += (age < 25) ? 90 : 50;
            price += (mile <= 10) ? 10 : (mile <= 50) ? 30 : 50;
        }
        if (checkAntiTheft.equals("yes")) {
            discount -= price * 0.05;
        }
        if (checkAccident.equals("yes")) {
            discount += price * 0.15;
        } else {
            discount -= price * 0.10;
        }
        if (status.equals("yes")) {
            discount -= price * 0.05;
        }
        // display All user info
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("status = " + status);
        System.out.println("mile = " + mile);
        System.out.println("typeOfInsurance = " + typeOfInsurance);
        System.out.println("Accident in 5 year = " + checkAccident);
        System.out.println("Any AntiTheft = " + checkAntiTheft);
        System.out.println("Starting Price " + price);
        System.out.println("discount = " + discount);
        System.out.println("Total Price = " +(price +discount));
    }
}
/*
Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount


 */