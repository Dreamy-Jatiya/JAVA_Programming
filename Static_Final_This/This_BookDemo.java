// this keyword

class BookA {
    int isbn;
    String title;
    String author;

    // Parameterized constructor
    BookA(int isbn, String title, String author) {
        // 'this' refers to the current object
        // It distinguishes instance variables from parameters
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    void dispBook() { // Display book details
        System.out.println(isbn + ":" + title + ":" + author);
    }
}

public class This_BookDemo {
    public static void main(String[] args) {
        // Create book objects using the constructor
        BookA b1 = new BookA(111, "JavaFundamental", "HShield");
        BookA b2 = new BookA(222, "PointersC", "yKanetkar");

        // Display details of both books
        b1.dispBook();
        b2.dispBook();
    }
}