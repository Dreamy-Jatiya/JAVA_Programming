// Program: Check Odd or Even using Methods

import java.util.Scanner;

public class If_ElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int i = sc.nextInt();

        // Create object
        If_ElseDemo ie = new If_ElseDemo();

        // Call methods
        ie.even_odd(i);
        ie.odd_even_bit(i);

        sc.close();

    } // main()

    // Check odd or even using %
    void even_odd(int i) {

        if (i % 2 == 0) {
            System.out.println(i + " is even");
        } 
        else {
            System.out.println(i + " is odd");
        }

    } // even_odd()

    // Check odd or even using bitwise &
    void odd_even_bit(int i) {

        if ((i & 1) == 0) {
            System.out.println(i + " : even bit");
        } 
        else {
            System.out.println(i + " : odd bit");
        }

    } // odd_even_bit()

}