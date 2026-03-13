package package1;

public class ArrayContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 25, 54, 40, 60};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 54) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("54 is present in the array");
        } else {
            System.out.println("54 is not present in the array");
        }
    }

	}


