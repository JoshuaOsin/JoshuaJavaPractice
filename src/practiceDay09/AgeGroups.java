package practiceDay09;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);
        // request user input
        System.out.print("Please give the age :");
        // create int variable, read user input and assign the int
        int age = Integer.parseInt(inputInteger.next());
        // use the input

        if (age>=1&&age<=2){            //infant (1 - 2)
            System.out.println("infant");
        } else  if (age>=3 && age<=5){    //Toddler (3 - 5)
            System.out.println("Toddler");
        } else  if (age>=6 && age<=9){    //Kid (6 - 9)
            System.out.println("Kid");
        } else  if (age>=10 && age<=12){    //Pre-Teen (10 - 12)
            System.out.println("Pre-Teen");
        } else  if (age>=13 && age<=17){       //Teenager (13 - 17)
            System.out.println("Teenager");
        } else  if (age>=18 && age<=20){        //Young Adult (18 - 20)
            System.out.println("Young Adult");
        } else if (age>=21 && age<=39){         //Adult (21 - 39)
            System.out.println("Adult");
        } else if (age>=40 && age<= 49){         //Young Middle-Aged Adult (40 - 49)
            System.out.println("Young Middle-Aged Adult");
        } else if (age>=50 && age<=54){             //Middle-Aged Adult (50 - 54),
            System.out.println("Middle-Aged Adult");
        } else if (age>=55 && age<=64){             //Very Young Senior Citizen (55 - 64)
            System.out.println("Very Young Senior Citizen");
        } else if (age>=75 && age<=84){             //Senior Citizen (75 - 84)
            System.out.println("Senior Citizen");
        } else {                                    //Old Senior Citizen (85+)
            System.out.println("Old Senior Citizen");
        }

    }
}
/*
Create a class called AgeGroups, and write a program that can define the age groups of a person
	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */