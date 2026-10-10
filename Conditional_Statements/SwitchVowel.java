// Program to check vowel or consonant using switch case

import java.util.Scanner;

public class SwitchVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter char: ");
        char ch = sc.next().charAt(0);

        // Check whether the character is a vowel
        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println(ch + ": vowel");
                break;

            // Check whether the character is an alphabet
            default:
                if ((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {
                    System.out.println(ch + ": consonant");
                } else {
                    System.out.println(ch + ": not an alphabet");
                }
                break;
        }

        sc.close();
    }
}