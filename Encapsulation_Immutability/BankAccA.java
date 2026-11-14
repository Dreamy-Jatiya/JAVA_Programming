// Bank Account: Display balance if PIN is correct
import java.util.Scanner;

class AccountA {
    int acc_no;
    double balance;
    private int pin; // PIN is private for data security

    // Setter method to initialize account details
    void setter(int a, double b, int p) {
        acc_no = a;
        balance = b;
        pin = p;
    }

    // Getter method to check PIN and display balance
    void getter(int p) {
        if (pin == p) {
            System.out.println(acc_no + ":" + balance);
        } else {
            System.out.println("Wrong PIN!");
        }
    }
}

public class BankAccA {
    public static void main(String[] args) {
        AccountA b1 = new AccountA();
        AccountA b2 = new AccountA();

        Scanner sc = new Scanner(System.in);

        // Ask user to set PIN for both accounts
        System.out.print("Set PIN for b1:");
        b1.setter(1111, 200000.56, sc.nextInt());

        System.out.print("Set PIN for b2:");
        b2.setter(2222, 500000.89, sc.nextInt());

        System.out.println("Now value for both accounts is set");

        // Check balance of account b1
        System.out.print("Want to check balance for B1? Enter PIN:");
        b1.getter(sc.nextInt());

        // Check balance of account b2
        System.out.print("Want to check balance for B2? Enter PIN:");
        b2.getter(sc.nextInt());

        sc.close();
    }
}