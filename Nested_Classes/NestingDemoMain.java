// Static nested class
class OuterA {
    static int out_a = 10;
    static private int out_b = 55;

    void outerMeth() {
        System.out.println("out_a:" + out_a);

        // Create an object of NestedA to call its method
        // NestedA n = new NestedA();
        // n.inMeth();
    }

    static class NestedA {
        int in_a = 20;

        void inMeth() {
            // Can access private and static members of OuterA
            System.out.println("InMeth():" + (in_a + out_a + out_b));
        }
    }
}

public class NestingDemoMain {
    public static void main(String[] args) {
        OuterA o = new OuterA();
        o.outerMeth();

        // Access the static nested class using the outer class name
        OuterA.NestedA on = new OuterA.NestedA();
        on.inMeth();
    }
}
