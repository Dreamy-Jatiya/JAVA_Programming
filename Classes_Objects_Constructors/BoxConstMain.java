// Cube Volume using Constructor and Setter

class Cube2A {
    double height;
    double width;
    double depth;

    public Cube2A() {
        // Constructor
        height = 1;
        width = 1;
        depth = 1;
    }

    void setter(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    double calVol() {
        return height * width * depth;
    }
}

public class BoxConstMain {
    public static void main(String[] args) {
        Cube2A c1 = new Cube2A();
        Cube2A c2 = new Cube2A();

        c1.setter(10, 10, 10);
        c2.setter(20, 20, 20);

        double v = c1.calVol();
        System.out.println("C1 volume of cube = " + v);

        v = c2.calVol();
        System.out.println("C2 volume of cube = " + v);
    }
}