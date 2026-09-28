//// Program to demonstrate Parameterized Constructor in Java

class Stud_A {

    int enr;
    String name;
    String uninm;

    // Parameterized constructor
    Stud_A(int e, String n) {
        System.out.println("Welcome to DU");

        enr = e;
        name = n;
        uninm = "Darshan University";
    }

    // Method to display student details
    int getter() {
        System.out.println(enr + ":" + name + ":" + uninm);
        return this.enr;
    }
}

public class ParamConstructA {

    public static void main(String[] args) {

        // Creating student objects
        Stud_A s1 = new Stud_A(111, "jay");
        Stud_A s2 = new Stud_A(222, "pooja");
        Stud_A s3 = new Stud_A(333, "mansi");

        // Displaying student details
        s1.getter();
        s2.getter();
        s3.getter();
    }
}