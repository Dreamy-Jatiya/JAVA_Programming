//Program to Find Factorial of a Number Using Recursion in Java

import java.util.Scanner;

// Class to calculate factorial
class FactA {
    int calFact(int n) {
        if (n == 1)
            return 1; // Base condition
        else
            return n * calFact(n - 1); // Recursive call
    }
}

public class RecursionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n:");
        int n = sc.nextInt();

        FactA f = new FactA(); // Create object
        int ans = f.calFact(n); // Calculate factorial

        System.out.println(n + "!=" + ans); // Display result
        sc.close();
    }
}
