package JavaPrograms;

public class palindromeProgram {

	public static void  main(String[] args) {
	
		
		String str="madam";
		String rev=" ";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev + str.charAt(i);
			
		}
		
		System.out.println(" reverse string" +rev);
		
	}
	
}
