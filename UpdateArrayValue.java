package package1;

import java.util.Scanner;

public class UpdateArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index to update: ");
        int index = sc.nextInt();

        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;
            System.out.println("Array updated successfully");
        } else {
            System.out.println("Invalid index");
        }

        // Print updated array
        System.out.print("Updated Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    
	}

}
