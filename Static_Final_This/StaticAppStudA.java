// Static variable and static method
class StaticStuA {
    String name;
    String branch;
    static int tot_admission; // Shared by all objects

    StaticStuA(String name, String branch) {
        this.name = name;
        this.branch = branch;
        tot_admission++; // Increment admission count
    }

    static void getter() { // Static method
        // name = "def"; // Error: non-static variable
        // System.out.println(name); // Cannot access directly

        System.out.println("total stu took admission:" + tot_admission);
    }
}

public class StaticAppStudA {
    public static void main(String[] args) {
        StaticStuA stud1 = new StaticStuA("abc", "ce");
        StaticStuA stud2 = new StaticStuA("pqr", "me");
        StaticStuA stud3 = new StaticStuA("xyz", "mba");
        StaticStuA stud4 = new StaticStuA("xyz", "ce");

        // Use the objects
        System.out.println(stud1.name);
        System.out.println(stud2.name);
        System.out.println(stud3.name);
        System.out.println(stud4.name);

        StaticStuA.getter(); // Call static method using class name
    }

    static {
        // Static block executes before main()
        // Initialize the static variable
        StaticStuA.tot_admission = 0;
        StaticStuA.getter(); // Call static method
        System.out.println("static blk-1");
    }
}