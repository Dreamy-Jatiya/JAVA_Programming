// Static Variable
class Acc_A {
    int acc_no;
    double balance;
    static String bankNm; // Common among all account holders

    Acc_A(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
        // Static variable is accessed using the class name
    }

    void disp() {
        System.out.println(acc_no + ":" + balance + ":" + bankNm);
    }
}

public class StaticVarDemoA {
    public static void main(String[] args) {
        Acc_A a1 = new Acc_A(111, 5000);

        // Access static variable using class name
        // a1.bankNm = "DU"; // Not recommended
        Acc_A.bankNm = "DU";
        a1.disp();

        Acc_A a2 = new Acc_A(222, 7000);

        // Changing static variable affects all objects
        Acc_A.bankNm = "DU_ICICI";

        a1.disp();
        a2.disp();
    }
}