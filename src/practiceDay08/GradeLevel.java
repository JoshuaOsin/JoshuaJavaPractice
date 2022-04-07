package practiceDay08;

public class GradeLevel {
    public static void main(String[] args) {

        byte gradeLevel = 18;

        if (gradeLevel>16){
            System.out.println("Grad School");
        } else if (gradeLevel>12){
            System.out.println("College");
        } else if(gradeLevel>8){
            System.out.println("High school");
        } else if(gradeLevel>5){
            System.out.println("Middle school");
        } else {
            System.out.println("Elementary school");
        }

    }
}
/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */