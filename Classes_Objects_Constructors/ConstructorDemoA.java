// Demonstrating no-argument constructor

class StudentA {
    int enr;

    // No-argument constructor
    StudentA() {
        // Initializes the object
        // Constructor is called when object is created
        enr = 111;

        System.out.println("inside constructor enr=" + enr);
    }
}

public class ConstructorDemoA {
    public static void main(String[] args) {

        // Creating first object
        StudentA sa1 = new StudentA();

        // Creating second object
        StudentA sa2 = new StudentA();
    }
}