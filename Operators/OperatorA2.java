/* Voting age >= 18
   Valid document
*/

import java.util.Scanner;

public class OperatorA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Do you have a valid document? (true/false): ");
        boolean document = sc.nextBoolean();

        if (age >= 18 && document) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }

        sc.close();
    }
}