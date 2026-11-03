// Implementing Thread using Runnable Interface

class RunThB implements Runnable {

    Thread t; // Reference variable of Thread class

    RunThB() {
        t = new Thread(this); // Creates a new thread
        t.start(); // Starts the child thread and calls run()
    }

    // Overriding run() method of Runnable interface
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread:" + i);

            try {
                Thread.sleep(500); // Pauses child thread for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handles interruption exception
            }
        }

        System.out.println("Child Thread ends!");
    }
}

public class RunnableBDemo {

    public static void main(String[] args)
            throws InterruptedException {

        new RunThB(); // Creates the child thread

        // Main thread (Parent Thread)
        for (int i = 0; i < 5; i++) {
            System.out.println("Parent Thread:" + i);
            Thread.sleep(500); // Pauses parent thread for 500 milliseconds
        }

        System.out.println("parent thread ends!");
    }
}