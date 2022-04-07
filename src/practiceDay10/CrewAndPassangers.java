package practiceDay10;

public class CrewAndPassangers {
    public static void main(String[] args) {

        int peopleOnboad = 70;

        if (peopleOnboad >= 50 && peopleOnboad <= 125) {
            if (peopleOnboad >= 100) {
                System.out.println("30 crew, " + (peopleOnboad - 30) + " passengers");
            } else if (peopleOnboad >= 75) {
                System.out.println("25 crew, " + (peopleOnboad - 25) + " passengers");
            } else {
                System.out.println("20 crew, " + (peopleOnboad - 20) + " passengers");
            }
        } else {
            System.err.println("invalid ");
        }


    }
}
/*
Create a class called CrewAndPassangers, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */