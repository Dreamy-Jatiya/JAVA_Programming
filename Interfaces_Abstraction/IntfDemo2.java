// Interface: defines abstract methods

interface CarIntfA {
    void start();
    void stop();
    void turnLeft();
    void turnRight();
}

// Implementing interface in TeslaA class
class TeslaA implements CarIntfA {

    // Implementing interface methods
    public void start() {
        System.out.println("Tesla starts with finger print scan");
    }

    public void turnLeft() {
        System.out.println("Tesla turn left()");
    }

    public void turnRight() {
        System.out.println("Tesla turn right()");
    }

    public void stop() {
        System.out.println("Tesla stops!");
    }
}

public class IntfDemo2 {
    public static void main(String[] args) {

        // Creating object of TeslaA
        TeslaA t1 = new TeslaA();

        // Calling interface methods
        t1.start();
        t1.turnLeft();
        t1.turnRight();
        t1.stop();
    }
}