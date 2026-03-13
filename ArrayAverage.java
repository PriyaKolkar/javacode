package package1;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);

        // Accept array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Accept array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        System.out.println("Average of array elements: " + average);
    }

	}


