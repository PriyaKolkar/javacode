package package1;

public class ThrowsExample {

	
	static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        divide(10, 0);
    }
}
