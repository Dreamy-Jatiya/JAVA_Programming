// Program: Calculate Volume of Cube using Setter and Getter Methods

class CubeA {
    String name;
    double height;
    double width;
    double depth;

    // Setter method to assign values
    void setter(String n, double h, double w, double d) {
        name = n;
        height = h;
        width = w;
        depth = d;
    }

    // Method to calculate volume
    double getVol() {
        return height * width * depth;
    }
}

public class CubeMainA {
    public static void main(String[] args) {

        // Create object
        // CubeA c1 = new CubeA();

        CubeA c2 = new CubeA();

        // Set values for cube
        c2.setter("c1", 20, 20, 20);

        // c2.setter("c2", 5, 5, 5);

        // Calculate and display volume
        // double ans1 = c1.getVol();
        // System.out.println(c1.name + ": volume:" + ans1);

        System.out.println(c2.name + ": volume:" + c2.getVol());
    }
}