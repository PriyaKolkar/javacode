package package1;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 12;

        if (age < 18) {
            throw new ArithmeticException("Not eligible for voting");
        }

        System.out.println("Eligible for voting");
    }
	}


