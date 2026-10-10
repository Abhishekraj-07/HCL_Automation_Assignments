/*4	Differentiate String, StringBuffer and StringBuilder. Write a program to perform String related operations using 
length(), isEmpty(), charAt(), toString(), equals(), compareTo(), contains(), indexOf(), lastIndexOf(), startsWith(), 
endsWith(), matches(), substring(), toLowerCase(), trim(), replace(), split(), join(), and valueOf(). */

public class StringOperations {

    public static void main(String[] args) {
        /*
         * Difference between String, StringBuffer, and StringBuilder:
         *
         * String:
         * - String is immutable, which means it cannot be changed after creation.
         * - If we change a String, a new object is created.
         *
         * StringBuffer:
         * - StringBuffer is mutable, which means it can be changed.
         * - It is thread-safe, so it is slower than StringBuilder.
         *
         * StringBuilder:
         * - StringBuilder is also mutable.
         * - It is not thread-safe, so it is faster than StringBuffer.
         */

        String str = "Java Programming";
        String str2 = "Java Programming";
        String str3 = "Python";
        String emptyString = "";
        String spacedString = "   Welcome to Java   ";

        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("World");

        System.out.println("----- Difference Example -----");

        // String creates a new object when changed.
        str = str + " Language";
        System.out.println("String: " + str);

        // StringBuffer can be changed using append().
        stringBuffer.append(" Students");
        System.out.println("StringBuffer: " + stringBuffer);

        // StringBuilder can also be changed using append().
        stringBuilder.append(" Program");
        System.out.println("StringBuilder: " + stringBuilder);

        System.out.println("\n----- String Methods -----");

        // length() returns the total number of characters in a string.
        System.out.println("length(): " + str.length());

        // isEmpty() checks whether the string has no characters.
        System.out.println("isEmpty(): " + emptyString.isEmpty());

        // charAt() returns the character available at the given index.
        System.out.println("charAt(2): " + str.charAt(2));

        // toString() converts an object into string form.
        System.out.println("toString(): " + stringBuffer.toString());

        // equals() compares the values of two strings.
        System.out.println("equals(): " + str2.equals("Java Programming"));

        // compareTo() compares two strings alphabetically.
        System.out.println("compareTo(): " + str2.compareTo(str3));

        // contains() checks whether a string contains a particular word or character.
        System.out.println("contains(): " + str.contains("Java"));

        // indexOf() returns the first position of a character or word.
        System.out.println("indexOf('a'): " + str.indexOf('a'));

        // lastIndexOf() returns the last position of a character or word.
        System.out.println("lastIndexOf('a'): " + str.lastIndexOf('a'));

        // startsWith() checks whether a string starts with the given text.
        System.out.println("startsWith('Java'): " + str.startsWith("Java"));

        // endsWith() checks whether a string ends with the given text.
        System.out.println("endsWith('Language'): " + str.endsWith("Language"));

        // matches() checks whether the string follows the given pattern.
        System.out.println("matches('[A-Za-z ]+'): " + str.matches("[A-Za-z ]+"));

        // substring() returns a part of the string.
        System.out.println("substring(5, 16): " + str.substring(5, 16));

        // toLowerCase() converts all letters into lowercase.
        System.out.println("toLowerCase(): " + str.toLowerCase());

        // trim() removes extra spaces from the beginning and ending.
        System.out.println("trim(): " + spacedString.trim());

        // replace() replaces old characters or words with new characters or words.
        System.out.println("replace(): " + str.replace("Java", "Core Java"));

        // split() divides a string into many parts.
        String[] words = str.split(" ");
        System.out.println("split():");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // join() joins many strings using a separator.
        String joinedString = String.join("-", "Java", "is", "easy");
        System.out.println("join(): " + joinedString);

        // valueOf() converts different data types into String.
        int number = 100;
        String convertedString = String.valueOf(number);
        System.out.println("valueOf(): " + convertedString);
    }
}
