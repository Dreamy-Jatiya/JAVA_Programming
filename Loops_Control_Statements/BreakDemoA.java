// Program to demonstrate break statement

import java.util.Scanner;

public class BreakDemoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, a;

        while (true) { // Infinite loop
            System.out.print("enter num:");
            a = sc.nextInt();

            if (a == -1) {
                break; // Exit the loop
            }

            sum += a; // Add number to sum
        }

        System.out.println("sum=" + sum);
        sc.close();
    }
}