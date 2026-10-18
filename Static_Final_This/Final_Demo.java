// Demonstration of final keyword
class Student_Gen {
    final int enroll = 111; // Constant variable

    void dispResult() {
        System.out.println("Parent: disp()");
    }
}

class BtechStud extends Student_Gen {
    void changeEnroll() {
        // enroll = 222; // Error: final variable cannot be changed
    }

    // Overriding the parent class method
    @Override
    void dispResult() {
        System.out.println("Child: disp()");
    }
}

public class Final_Demo {
    public static void main(String[] args) {
        Student_Gen s = new Student_Gen();

        System.out.println(s.enroll); // Prints 111
    }
}