package JavaPrograms;

import java.util.Arrays;

public class AnagramProgram {
	
	public static void main( String[] args){
		
		
		String s1= "silent";
		String s2= "listen";
		
		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replaceAll("\\s2", "").toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println(" not anagram");
		}
		
		
		char[] a1= s1.toCharArray();
		char[] a2= s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1,a2)) {
			
			System.out.println(" anagram");
		}
		
		else {
			System.out.println("Not Angram");
		}
		}
		
	}
	


