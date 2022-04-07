package practiceDay09;

public class CalculateSalary {
    public static void main(String[] args) {

        double salary = 100_000, netSalary, taxRate;

        boolean isMarried = true;

        if (salary > 130_000) {           //35% for salary of 130K or more
            taxRate = 0.35;
        } else if (salary > 100_000) {    // 	30% for salary of 100K to 130k (excluded)
            taxRate = 0.30;
        } else if (salary > 80_000) {    //25% for salary of 80K to 100K (excluded)
            taxRate = 0.25;
        } else {    //20% for salary less than 80K
            taxRate = 0.20;
        }
        if (isMarried) {
            taxRate -= 0.05;
        }
        netSalary = salary * (1 - taxRate);
        System.out.println("netSalary = " + netSalary);

    }
}
/*
Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
 */