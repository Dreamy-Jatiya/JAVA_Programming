// Synchronization with Thread
// 1) By synchronized method - Done
// 2) By synchronized block
// Multiplication table

class MTableB {
    void printMTable(int n) { // Critical section
        for (int i = 1; i <= 5; i++) {
            System.out.print(n * i + " ");

            try {
                Thread.sleep(500); // Checked exception
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TabTh1 extends Thread {
    MTableB mt;

    TabTh1(MTableB mt) {
        this.mt = mt; // Shares the common object
        // start(); // Starts the thread
    }

    public void run() {
        synchronized (mt) { // Acquires lock on mt object
            mt.printMTable(5);
        } // Releases lock
    }
}

class TabTh2 extends Thread {
    MTableB mt;

    TabTh2(MTableB mt) {
        this.mt = mt; // Shares the common object
        // start();
    }

    public void run() {
        synchronized (mt) { // Acquires lock on mt object
            mt.printMTable(100);
        } // Releases lock
    }
}

public class ThreadSyncB1 {
    public static void main(String[] args) {

        MTableB mt = new MTableB(); // Common shared object

        TabTh1 th1 = new TabTh1(mt);
        TabTh2 th2 = new TabTh2(mt);

        th1.start(); // Starts thread 1
        th2.start(); // Starts thread 2

        th1.setPriority(10); // Sets thread 1 priority

        // Displays thread priorities
        System.out.println("th1 priority:" + th1.getPriority());
        System.out.println("th2 priority:" + th2.getPriority());
    }
}