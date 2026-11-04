// Implementing Thread using Thread Class

class MyThreadB extends Thread {

    MyThreadB() {
        start(); // Starts the child thread and calls run()
    }

    public void run() {
        // Child thread execution
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread:" + i);

            try {
                Thread.sleep(500); // Pauses child thread for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handles checked exception
            }
        }
    }
}

public class ThreadDemoB1 {
    public static void main(String[] args) {

        new MyThreadB(); // Creates and starts child thread

        // Parent thread execution
        for (int i = 0; i < 5; i++) {
            System.out.println("Parent Thread:" + i);

            try {
                Thread.sleep(1000); // Pauses parent thread for 1000 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handles checked exception
            }
        }
    }
}