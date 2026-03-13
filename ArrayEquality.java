package package1;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10, 20, 30};
        int[] b = {10, 20, 30};

        if (Arrays.equals(a, b)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

	}


