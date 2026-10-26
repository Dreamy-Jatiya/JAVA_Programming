
// Demonstration of Static and Non-static Methods

class Calculate {
    // Non-static method of another class
    void multi(int a, int b) {
        System.out.println("a*b:" + (a * b));
    }

    // Static method of another class
    static void div(int a, int b) {
        System.out.println("a/b:" + (a / b));
    }
}

public class StaticMethA1 {
    public static void main(String[] args) {

        // Calling non-static method using an object
        // StaticMethA1 s = new StaticMethA1();
        // s.add(20, 10);
        new StaticMethA1().add(20, 10);

        // Calling static method directly within the same class
        sub(20, 10);

        // Calling non-static method of another class using an object
        // Calculate c = new Calculate();
        // c.multi(20, 10);
        new Calculate().multi(20, 10);

        // Calling static method of another class using class name
        Calculate.div(20, 10);
    }

    // Non-static method of the same class
    void add(int a, int b) {
        System.out.println("a+b:" + (a + b));
    }

    // Static method of the same class
    static void sub(int a, int b) {
        System.out.println("a-b:" + (a - b));
    }
}