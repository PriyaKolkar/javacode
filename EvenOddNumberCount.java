package JavaPrograms;

public class EvenOddNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345;
		int even=0;
		int odd=0;
		
		while(num>0) {
			int rem=num%10;
		if(rem%2==0) {
			even++;
		}
		else {
			odd++;
		}
		num=num/10;
		
		}
		
	System.out.println(" even digits--> "   +even);
	System.out.println(" odd digits--> "   +odd);
	}

}
