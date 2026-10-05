// Program to demonstrate constructor overloading

class Payment {
    double amt;

    // Constructor for COD payment
    Payment(double amt) {
        this.amt = amt;
    }

    // Constructor for card payment
    Payment(int cardno, int cvv, double amt) {
        this.amt = amt;
    }

    // Constructor for UPI payment
    Payment(String upiId, double amt) {
        this.amt = amt;
    }

    // Getter method to return amount
    double getter() {
        return amt;
    }
}

public class ConstructorOverloadA {
    public static void main(String[] args) {

        // Creating object for COD payment
        Payment user1 = new Payment(2000);

        // Creating object for UPI payment
        Payment user2 = new Payment("3746328@upi", 5000);

        // Creating object for card payment
        Payment user3 = new Payment(327428, 333, 7000);

        // Display payment amounts
        System.out.println(user1.getter());
        System.out.println(user2.getter());
        System.out.println(user3.getter());
    }
}
