//Bank Account Program using Encapsulation
//Using Setter and Getter Methods
//Checking Account Number and PIN

import java.util.Scanner;

// BankAccount class
class AccountA {
    int acc_no;
    double balance;
    private int pin; // Private data member

    // Setter method to initialize account details
    void setter(int a, double b, int p) {
        acc_no = a;
        balance = b;
        pin = p;
    }

    // Getter method to check account number and PIN
    void getter(int a, int p) {
        if (acc_no == a && pin == p) {
            System.out.println("Account No: " + acc_no);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid PIN or Account Number");
        }
    }
}

public class Bank_Account {
    public static void main(String[] args) {
        AccountA b1 = new AccountA();
        Scanner sc = new Scanner(System.in);

        // Set initial account details
        b1.setter(4561, 200000.54, 1234);

        // Enter account number and PIN
        System.out.print("Enter Account Number: ");
        int a = sc.nextInt();

        System.out.print("Enter PIN: ");
        int p = sc.nextInt();

        // Check account details
        b1.getter(a, p);

        sc.close();
    }
}