package package1;

public class StringFunctionExample {

	public static void main(String[] args) {

		String str = "Java is very easy language";
  System.out.println(" SubString "   +str.substring(1,7));
        // 1. split()
        String[] words = str.split(" ");
        System.out.println("split():");
        for (String w : words) {
            System.out.println(w);
        }

        // 2. split(limit)
        String[] wordsLimit = str.split(" ", 3);
        System.out.println("\nsplit(limit=3):");
        for (String w : wordsLimit) {
            System.out.println(w);
        }

        // 3. lastIndexOf()
        int index = str.lastIndexOf("easy");
        System.out.println("\nlastIndexOf(\"easy\"): " + index);

        // 4. repeat()
        String s = "Hi ";
        System.out.println("\nrepeat(): " + s.repeat(3));

        // 5. startsWith()
        System.out.println("\nstartsWith(\"Java\"): " + str.startsWith("Java"));

        // 6. endsWith()
        System.out.println("endsWith(\"language\"): " + str.endsWith("language"));

        // 7. isBlank()
        String blankStr = "   ";
        System.out.println("\nisBlank(): " + blankStr.isBlank());

        // 8. isEmpty()
        String emptyStr = "";
        System.out.println("isEmpty(): " + emptyStr.isEmpty());
    }

}
