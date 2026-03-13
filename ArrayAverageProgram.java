package JavaPrograms;

import java.util.Scanner;

public class ArrayAverageProgram {

	
	public static void main(String[] args) {
		
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("print Array elemets");
	 int n= sc.nextInt();
	 
	int[] arry= new int[n] ;
	int sum=0;
	
	System.out.println("Array eklemets are");
	for(int i=0;i<n;i++) {
	  arry[i]	= sc.nextInt();
	  sum=sum+arry[i];
	}
		
	
	double avr= sum/n;
	System.out.println(" average array elements="   +avr);
	}
}
