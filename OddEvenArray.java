package package1;

public class OddEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {12, 7, 9, 20, 15, 8};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is Even");
            } else {
                System.out.println(arr[i] + " is Odd");
            }
        }
    
	}

}
