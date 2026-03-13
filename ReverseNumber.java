package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" enter the number");
Scanner sc= new Scanner(System.in);
 int num= sc.nextInt();
 
 int rev=0;
 while(num!=0) {
	 rev=rev*10+num%10;
	 num=num/10;
	 
 }
System.out.println(" Reversed Number is "   +rev);
	}

}
