package JavaPrograms;

public class ArrayCopyProgram {
	
	public static void main(String[] args) {
		
		int[] arr1= { 20,30,40,50,60};
		int[] arr2= new int[arr1.length];
		
		
		for(int i=0;i<arr1.length;i++) {
			
			arr2[i]=arr1[i];
			
		}
		
		
		System.out.println("Copied elements");
		for(int i=0;i<arr2.length;i++) {
			System.out.println("  array elemet "  + arr2[i]);
		}
	}

}
