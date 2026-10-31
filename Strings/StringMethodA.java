// String class methods: length(), equals(), charAt(), substring(),
// concat(), indexOf(), lastIndexOf(), replace(), toUpperCase(), toLowerCase()

public class StringMethodA {
    public static void main(String[] args) {

        String s1 = "Darshan"; // String literal (String Pool)
        String s2 = new String("Darshan"); // Object created in Heap memory
        String s3 = "Darshan"; // Reuses the same String Pool object
        String s4 = "University";
        String s5 = new String("Darshan"); // New object in Heap memory

        // Method 1: length() - returns the length of a string
        System.out.println("s1 length():" + s1.length());
        System.out.println("computer".length());

        // Method 2: String comparison
        // == compares references (memory addresses)
        // equals() compares string contents
        // Never use == to compare String contents

        System.out.println("s1==s2:" + (s1 == s2)); // false
        System.out.println("s1==s3:" + (s1 == s3)); // true
        System.out.println("s1==s5:" + (s1 == s5)); // false

        // equals() - compares string contents (case-sensitive)
        System.out.println("s1.equals(s2):" + s1.equals(s2));

        // equalsIgnoreCase() - compares strings ignoring case
        System.out.println("darshan".equalsIgnoreCase(s5));

        // Method 3: charAt(index) - returns character at given index
        System.out.println("charAt(3):" + s1.charAt(3));

        // Method 4: substring() - extracts a part of a string
        // substring(start, end): end index is excluded
        System.out.println("substring(2,6):" + s1.substring(2, 6));

        // substring(start): extracts from start index to the end
        System.out.println(s1.substring(4));

        // Method 5: String concatenation
        // + operator and concat() are used to join strings
        System.out.println(s1 + s4);
        System.out.println(s1.concat(s4));

        // Method 6: indexOf() and lastIndexOf()
        // indexOf() returns the first occurrence of a character/string
        System.out.println("index:" + s1.indexOf('a'));

        // lastIndexOf() returns the last occurrence
        System.out.println("last index:" + s1.lastIndexOf('a'));

        // Searches for a substring
        System.out.println("index str:" + s4.indexOf("Uni"));

        // Method 7: replace() - replaces characters or substrings
        String snew = "BTechCSE";
        System.out.println(snew.replace('e', '#'));

        // Method 8: toUpperCase() and toLowerCase()
        // Converts the string into uppercase and lowercase
        System.out.println("toUpperCase:" + snew.toUpperCase());
        System.out.println("toLowerCase:" + snew.toLowerCase());

        // H.W.: Convert "darshan" into "DaRsHaN"
        String str = "darshan";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0)
                result += Character.toUpperCase(str.charAt(i));
            else
                result += Character.toLowerCase(str.charAt(i));
        }

        System.out.println("Alternate Case:" + result);
    }
}