package practiceDay13;

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName = scan.next();
        System.out.println("Enter password:");
        String password = scan.next();

        String credentialUsername = "Cydeo";
        String credentialPasword = "WoodenSpoon";

        if (userName.equals(credentialUsername) && password.equals(credentialPasword)){
            System.out.println("Log in");
        } else{
            System.out.println("Incorrect username or password");
        }

    }
}
