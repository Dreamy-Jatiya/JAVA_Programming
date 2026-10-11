// Find the largest number among 3 numbers using ternary operator

import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter a,b,c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Find the largest number using ternary operator
        int ans = (((a > b) && (a > c)) ? a : ((b > c) ? b : c));

        // Display the largest number
        System.out.println("ans=" + ans);

        sc.close();
    }
}