// Factorial using Recursion

public class Fact {

    int fact(int n) {
        if (n == 0 || n == 1) { // Base condition
            return 1;
        }
        else if (n < 0) { // Factorial is not defined for negative numbers
            return -1;
        }
        else {
            return n * fact(n - 1); // Recursive call
        }
    }
}