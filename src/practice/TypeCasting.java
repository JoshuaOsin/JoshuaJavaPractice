package practice;

public class TypeCasting {

    public static void main(String[] args) {
        // implicit casting smaller > bigger
        int a = 100;
        double b = a;
        System.out.println(a+ "\n"+b );

        // explicit casting bigger > smaller
        double x = 20.5;
        int y = (int)x;
        System.out.println(x);
        System.out.println(y);
    }

}
