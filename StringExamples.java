package package1;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Java Programming Language";

        // substring()
        System.out.println("Substring: " + str.substring(5, 16));

        // contains()
        System.out.println("Contains 'Program': " + str.contains("Program"));

        // matches()
        System.out.println("Matches regex 'Java.*': " + str.matches("Java.*"));

        // replace()
        System.out.println("Replace word: " + str.replace("Java", "Core Java"));

        // replaceAll()
        System.out.println("Replace all spaces with '-': " + str.replaceAll(" ", "-"));

        // charAt(index)
        System.out.println("Character at index 2: " + str.charAt(2));

        // indexOf(char)
        System.out.println("Index of character 'P': " + str.indexOf('P'));
    }

	}


