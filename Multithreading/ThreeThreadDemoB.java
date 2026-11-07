import java.time.LocalTime;

// t1: Print Odd Numbers
// t2: Print Even Numbers
// t3: Print Current Time

// Thread 1: Extending Thread class
class THB1 extends Thread {
    int n1, n2;

    THB1(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        start(); // Starts the thread and calls run()
    }

    public void run() {
        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0) { // Checks odd number
                System.out.println("Odd Thread:" + i);

                try {
                    Thread.sleep(1000); // Pauses for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// Thread 2: Extending Thread class
class THB2 extends Thread {
    int n1, n2;

    THB2(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        start(); // Starts the thread and calls run()
    }

    public void run() {
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) { // Checks even number
                System.out.println("Even Thread:" + i);

                try {
                    Thread.sleep(1000); // Pauses for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// Thread 3: Implementing Runnable interface
class Th3Time implements Runnable {
    Thread t;

    Th3Time() {
        t = new Thread(this);
        t.start(); // Starts the thread
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Time=" + LocalTime.now());

            try {
                Thread.sleep(1000); // Pauses for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class
public class ThreeThreadDemoB {
    public static void main(String[] args) {

        new THB1(10, 30); // Creates odd thread

        new THB2(10, 30); // Creates even thread

        new Th3Time(); // Creates time thread
    }
}