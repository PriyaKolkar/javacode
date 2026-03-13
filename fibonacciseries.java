package JavaPrograms;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a=0, b=1,c;
		for(int i=1;i<=n;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
	}

}
