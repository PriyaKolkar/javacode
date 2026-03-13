package package1;

public class StringFunctionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 String s1 = "  Java Programming  ";
	        String s2 = "java programming";

	        // length()
	        System.out.println("Length: " + s1.length());

	        // toUpperCase()
	        System.out.println("Uppercase: " + s1.toUpperCase());

	        // toLowerCase()
	        System.out.println("Lowercase: " + s1.toLowerCase());

	        // concat()
	        String s3 = s1.concat(" Language");
	        System.out.println("Concatenated String: " + s3);

	        // trim()
	        System.out.println("Trimmed String: '" + s1.trim() + "'");

	        // equals()
	        System.out.println("Equals: " + s1.trim().equals(s2));

	        // equalsIgnoreCase()
	        System.out.println("Equals Ignore Case: " + s1.trim().equalsIgnoreCase(s2));
	    }
	}

		

