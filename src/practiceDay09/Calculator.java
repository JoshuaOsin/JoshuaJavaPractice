package practiceDay09;

public class Calculator {
    public static void main(String[] args) {
        double n1= 10.5,n2=2.5;

        //assign char operator to one of the arithmetic operators -, +, *, /
        char mathOperator = '+';

        // make calculation
        if (mathOperator=='+') {
            System.out.println(n1+n2);
        } else if (mathOperator=='-') {
            System.out.println(n1-n2);
        } else if(mathOperator=='*') {
            System.out.println(n1*n2);
        } else if(mathOperator=='/') {
            System.out.println(n1/n2);
        } else {
            System.err.println("Invalid operator");
        }


    }

}
/*
Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate c of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */