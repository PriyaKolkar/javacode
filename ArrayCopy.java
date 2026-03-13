package package1;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];

        // Copy elements
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Display copied array
        System.out.println("Copied array elements:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
	}


