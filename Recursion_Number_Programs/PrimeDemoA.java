//prime numbers between 100 and 999

import java.util.Scanner;

public class PrimeDemoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("enter r1 & r2 no.:");
        // int r1 = sc.nextInt();
        // int r2 = sc.nextInt();

        PrimeDemoA p = new PrimeDemoA();

        // Check all three-digit numbers
        for (int i = 100; i <= 999; i++) {
            p.primeA(i);
        }
        
        sc.close();

    }//main()

    void primeA(int n) {
        boolean flag = true; // Assume the number is prime

        // Check whether n is divisible by any number from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false; // Number is not prime
                break;
            }
        }

        if (flag) { // If flag is true, print the prime number
            System.out.print(n + ",");
        }

        // else {
        //     System.out.println(n + ": is composite");
        // }

    }//primeA()

}//class