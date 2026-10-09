// Calculator program using switch case

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter 2 No.:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Loop to perform calculations repeatedly
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("+:add\n-:sub\n*:mul\n/:div\n#:exit");

            char ch = sc.next().charAt(0);

            // Perform operation according to choice
            switch (ch) {
                case '+':
                    System.out.println("a+b=" + (a + b));
                    break;

                case '-':
                    System.out.println("a-b=" + (a - b));
                    break;

                case '*':
                    System.out.println("a*b=" + (a * b));
                    break;

                case '/':
                    // Check division by zero
                    if (b != 0) {
                        System.out.println("a/b=" + (a / b));
                    } else {
                        System.out.println("Division by zero is not possible");
                    }
                    break;

                case '#':
                    sc.close();
                    return; // Exit the main method
                
                default:
                    System.out.println("Invalid choice");
            }// switch
        } // while
    }

}