// Method Overloading: add() is overloaded
// Compile-time polymorphism

class Add_A {
    int z = 20;

    void add(int a) {
        System.out.println("a+z:" + (a + z));
    }

    void add(int a, int b) { // Same method name, different parameters
        System.out.println("a+b+z:" + (a + b + z));
    }

    void add(double a, int b) { // Different parameter types
        System.out.println("Double a+b+z:" + (a + b + z));
    }

    void add(int a, int b, int c) { // Different number of parameters
        System.out.println("a+b+c+z:" + (a + b + c + z));
    }
}

public class OverloadingDemoA {
    public static void main(String[] args) {
        Add_A a = new Add_A();

        a.add(11);          // Calls add(int)
        a.add(11, 12);      // Calls add(int, int)
        a.add(11.67, 12);   // Calls add(double, int)
        a.add(11, 12, 13);  // Calls add(int, int, int)
    }

    // The main() method can also be overloaded
    void main() {
        // Non-static overloaded main() method
    }

    int main(int a) {
        return a; // Returns the given integer
    }
}
