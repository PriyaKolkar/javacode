package package1;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {
	
		
		String s1 = "listen";
        String s2 = "silent";

        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Check length
        if (s1.length() != s2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        // Convert to char array
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        // Sort arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Compare arrays
        if (Arrays.equals(a1, a2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are Not Anagrams");
        }
    }
}

	


