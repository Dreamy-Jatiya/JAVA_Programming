// Reverse a String using for loop and charAt()

public class StrRevA {
    public static void main(String[] args) {

        String s = "btech";
        String rev = ""; // Stores the reversed string

        // Traverse the string from last index to first index
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i); // Add each character to rev
        }

        System.out.println("Reverse: " + rev);
    }
}