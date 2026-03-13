package package1;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {

            // Skip even numbers
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
	}

}
