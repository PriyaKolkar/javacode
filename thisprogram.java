package package1;

public class thisprogram {

	thisprogram(){
		this(100);
		System.out.println(" Default constructor called");
	}
	
	thisprogram(int a)
	{
		this("RAM", 20);
		System.out.println(" parameterised constructor called  1");
		
	}
	
	
	thisprogram(String s, int a)
	{
		
		System.out.println(" parameterised constructor called  2   ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisprogram obj = new thisprogram();
			
			
	}

}
