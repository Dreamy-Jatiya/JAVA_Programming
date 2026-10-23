// Overloading main() method

public class MainOverload {

    // Main method: Entry point of the program
    public final static void main(String[] args) {
        System.out.println("Hello World");

        MainOverload mo = new MainOverload();
        mo.main();  // Calling non-static main() method

        main(99);   // Calling static main(int) method
    }

    public void main() { // Non-static overloaded method
        System.out.println("inside main()");
    }

    public static void main(int i) { // Static overloaded method
        System.out.println("main() static:" + i);
    }
}