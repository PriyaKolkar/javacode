package package1;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
            int a = 10;
            int b = 0;
            int result = a / b;   // Exception occurs
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
        finally {
            System.out.println("Finally block always executes");
        }
    }
	}


