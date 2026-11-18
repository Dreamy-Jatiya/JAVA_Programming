// Immutable attribute: Cannot be changed after initialization
// Mutable attribute: Value can be changed

class Stud_A1 {
    final int enr; // Immutable attribute
    double spi;    // Mutable attribute

    Stud_A1(int enr) {
        this.enr = enr; // Initializes final variable
    }

    // Sets or updates SPI
    void setMarks(double spi) {
        this.spi = spi;
    }

    // Displays enrollment number and SPI
    void getMarks() {
        System.out.println(enr + ":Marks:" + spi);
    }
}

public class ImmutableA {
    public static void main(String[] args) {

        Stud_A1 s1 = new Stud_A1(111);
        Stud_A1 s2 = new Stud_A1(222);

        // Assigning initial SPI values
        s1.setMarks(9.0);
        s2.setMarks(9.5);

        s1.getMarks();
        s2.getMarks();

        // Updating SPI values
        s1.setMarks(9.5);
        s2.setMarks(9.8);

        s1.getMarks();
        s2.getMarks();
    }
}