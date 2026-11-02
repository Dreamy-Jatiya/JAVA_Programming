// wait(): Releases the lock and waits until notified.
// notify(): Wakes up one waiting thread.

class ProductB {
    int item;
    boolean isProducing = false; // Checks whether an item is produced or not

    // synchronized method for producing an item
    synchronized void put(int item) {

        while (isProducing) { // Wait if the previous item is not consumed
            try {
                wait(); // Releases the lock and waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.item = item; // Store the produced item
        System.out.println("Produced: " + item);

        isProducing = true; // Item is produced
        notify(); // Notify the consumer
    }

    // synchronized method for consuming an item
    synchronized int get() {

        while (!isProducing) { // Wait if no item is available
            try {
                wait(); // Releases the lock and waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + item);

        isProducing = false; // Item is consumed
        notify(); // Notify the producer

        return item;
    }
}

// Producer thread
class ProducerB extends Thread {
    ProductB p;

    ProducerB(ProductB p) {
        this.p = p;
        start(); // Starts producer thread
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            p.put(i); // Produces an item

            try {
                Thread.sleep(500); // Pauses for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer thread
class ConsumerB extends Thread {
    ProductB p;

    ConsumerB(ProductB p) {
        this.p = p;
        start(); // Starts consumer thread
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            p.get(); // Consumes an item

            try {
                Thread.sleep(500); // Pauses for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class
public class ProducerConsumerB {
    public static void main(String[] args) {

        ProductB p = new ProductB(); // Shared resource

        new ProducerB(p); // Creates and starts producer thread
        new ConsumerB(p); // Creates and starts consumer thread
    }
}