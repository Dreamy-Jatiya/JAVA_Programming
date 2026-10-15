// Math: java.lang.Math class

public class MathA {
    public static void main(String[] args) {

        // Mathematical constants
        System.out.println("Math.PI:" + Math.PI);
        System.out.println("Math.E:" + Math.E); // Euler's number

        // Math methods
        System.out.println("Math.abs:" + Math.abs(-9.8)); // Absolute value
        System.out.println("Math.min(20,2):" + Math.min(20, 2)); // Minimum value
        System.out.println("Math.min(20,10,2):" + Math.min(20, Math.min(10, 2)));
        System.out.println("Math.max(20,10,2):" + Math.max(20, Math.max(10, 2)));

        System.out.println("Math.sqrt(900):" + Math.sqrt(900)); // Square root
        System.out.println("Math.pow(5,3):" + Math.pow(5, 3)); // Power
        System.out.println("Math.ceil(30.89):" + Math.ceil(30.89)); // Rounds up
        System.out.println("Math.floor(30.89):" + Math.floor(30.89)); // Rounds down

        // Trigonometric methods (angle in radians)
        System.out.println("Math.sin(Math.PI/2):" + Math.sin(Math.PI / 2));
        System.out.println("Math.cos(Math.PI/2):" + Math.cos(Math.PI / 2));

        // Generate 10 random integers from 1 to 100
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random() * 100) + 1);
        }

    }//main
}//class
