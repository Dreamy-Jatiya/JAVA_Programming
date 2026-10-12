// Program to find the sum of numbers from 1 to n

import java.util.Scanner;

public class LoopDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        int n = sc.nextInt();

        // Create an object
        LoopDemo1 ld1 = new LoopDemo1();

        // Call the sum() method
        int ans_add = ld1.sum(n);

        // Display the result
        System.out.println("sum=" + ans_add);

        sc.close();
    }//main

    // Method to calculate the sum
    int sum(int n) {
        int ans = 0;

        // Add numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            ans = ans + i; // ans += i; (short-hand operator)
        }

        return ans;
    }
}
