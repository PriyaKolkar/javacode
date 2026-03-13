package package1;

public class CopyReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];

        
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }

        // Print original array
        System.out.print("Original Array: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        // Print reversed copied array
        System.out.print("\nReversed Copied Array: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    
	}

}
