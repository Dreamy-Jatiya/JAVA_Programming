// Program to find the sum by skipping negative numbers using continue statement

import java.util.Scanner;

public class ContinueA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n:"); // Number of inputs
        int n = sc.nextInt();

        int sum = 0, a;

        // Loop to accept n numbers
        for (int i = 0; i < n; i++) {
            System.out.print("enter num:");
            a = sc.nextInt();

            if (a < 0) {
                continue; // Skip negative numbers
            }
            sum += a; // Add non-negative numbers to sum
        }
        System.out.println("sum=" + sum); // Display the sum

        sc.close();
    }
}