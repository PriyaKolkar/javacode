package JavaPrograms;

public class CountDigitAlhaSpace {

		
		static int countOfSpace=0;
		static int countOfNumeric=0;
		static int countOfALphabet=0;
		static int countOfSpecial=0;

		public static void main(String[] args) 
		{
			String input="manish no 2145";
			char [] output=	input.toCharArray();
			
			for(int i=0;i<input.length();i++)
			{
		boolean b1=	Character.isAlphabetic(output[i]);
		System.out.println(b1);
			if(b1)
			{
				countOfALphabet++;
			}
		boolean b2=	Character.isDigit(output[i]);
		System.out.println(b2);
		if(b2)
		{
			countOfNumeric++;
		}
		boolean b3=	Character.isWhitespace(output[i]);
		System.out.println(b3);
		if(b3)
		{
			countOfSpace++;
		}
		System.out.println("at index->" +i);

			}
			System.out.println(countOfALphabet);
			System.out.println(countOfNumeric);
			System.out.println(countOfSpace);

		}		
	}
	

