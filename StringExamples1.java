package package1;

public class StringExamples1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str = "Java";

        // toCharArray()
        char[] ch = str.toCharArray();
        System.out.println("Characters in the string:");

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

        // toString()
        String newStr = str.toString();
        System.out.println("String using toString(): " + newStr);
    }
	}


