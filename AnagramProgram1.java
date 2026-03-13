package JavaPrograms;

import java.util.Arrays;

public class AnagramProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				String input1="silent";
				String input2="listen";
				if(input1.length()!=input2.length())
				{
					System.out.println("the 2 given Strings are not ANAGRAM");
				}
				else
				{
				//step 1
				
				char [] array1=	input1.toCharArray();
				char [] array2=	input2.toCharArray();
				System.out.println("After step 1:");
				System.out.println(Arrays.toString(array1));
				System.out.println(Arrays.toString(array2));

				//step 2
				Arrays.sort(array1);
				Arrays.sort(array2);
				System.out.println("After step 2:");
				System.out.println(Arrays.toString(array1));
				System.out.println(Arrays.toString(array2));
				
				if(Arrays.equals(array1, array2))
				{
					System.out.println("Yes, the given 2 strings are Anagram");
				}
				else
				{
					System.out.println("No, They are not Anagram");
				}

				
				}
			}		
	}


