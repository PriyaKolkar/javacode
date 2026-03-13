package package1;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Java 123 @World!";

        int alphabets = 0;
        int digits = 0;
        int spaces = 0;
        int specialChars = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                alphabets++;
            } 
            else if (ch >= '0' && ch <= '9') {
                digits++;
            } 
            else if (ch == ' ') {
                spaces++;
            } 
            else {
                specialChars++;
            }
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + specialChars);
    }

	}


