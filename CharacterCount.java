package package1;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "kv no 2";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + " is an Alphabet");
            }
            else if (ch >= '0' && ch <= '9') {
                System.out.println(ch + " is a Numeric value");
            }
            else if (ch == ' ') {
                System.out.println("Space");
            }
        }
    



	}

}
