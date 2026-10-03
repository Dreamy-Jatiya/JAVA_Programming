// Implementing Class & Object

import java.util.Scanner;

class PersonA {
    String name;
    int age;
    String prof;

    // Setter method
    void setter(String n, int a, String p) {
        name = n;
        age = a;
        prof = p;
    }

    // Getter method
    void getter() {
        System.out.println(name + ":" + age + ":" + prof);
    }
}

public class Class_ObjDemoA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating objects
        PersonA p1 = new PersonA();
        PersonA p2 = new PersonA();

        // Input for P1
        System.out.println("Enter name age & prof for P1:");
        p1.setter(sc.next(), sc.nextInt(), sc.next());

        // Input for P2
        System.out.println("Enter name age & prof for P2:");
        p2.setter(sc.next(), sc.nextInt(), sc.next());

        // Display values
        p1.getter();
        p2.getter();

        sc.close();
    }
}

