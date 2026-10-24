
// Method Overriding: Run-time Polymorphism
// Definition: Same method name and same signature in parent and child classes

class Shape_A {
    void draw() {
        System.out.println("Draw Shape");
    }
}

class Circle_A extends Shape_A {
    @Override
    void draw() { // Overridden method
        super.draw(); // Calls the parent class method
        System.out.println("Draw Circle");
    }
}

class Square_A extends Shape_A {
    @Override
    void draw() { // Overridden method
        super.draw(); // Calls the parent class method
        System.out.println("Draw Square");
    }
}

public class MethOverrideA {
    public static void main(String[] args) {
        Shape_A s = new Shape_A();
        Circle_A c = new Circle_A();
        Square_A sq = new Square_A();

        s.draw();
        c.draw();
        sq.draw();
    }
}