package package1;

public class CountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "kv no 2 45";

        int charCount = 0;
        int numCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                charCount++;
            } 
            else if (ch >= '0' && ch <= '9') {
                numCount++;
            }
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Numeric count: " + numCount);
    
	}

}
