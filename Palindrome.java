package package1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
	}


