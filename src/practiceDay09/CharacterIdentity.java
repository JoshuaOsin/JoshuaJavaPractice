package practiceDay09;

public class CharacterIdentity {
    public static void main(String[] args) {
        char a = '*';
        int ascii = (int)a;

        // ASCII for A-Z between 65-90; a-z between 97-122
        if ((ascii>=65&&ascii<=90)||(ascii>=97&&ascii<=122)) {
            System.out.println("Alphabetic Character");
        // ASCII for 0-9 between 48-57
        } else if(ascii>48&&ascii<=57){
            System.out.println("Digital");
        } else {
            System.out.println("Special Character");
        }

    }
}
/*
Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'

		output:
			Special Character
 */