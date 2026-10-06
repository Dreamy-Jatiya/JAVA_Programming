// Program: Demonstration of Copy Constructor in Java

class Student_A{
    int enr;
    int b_code;
    String uniNm;

    // Parameterized constructor
    Student_A(int enr,int b_code,String uniNm){
        this.enr=enr;
        this.b_code=b_code;
        this.uniNm=uniNm;
    }

    // Copy constructor - copies values from another object
    Student_A(Student_A s){
        this.enr=s.enr;
        this.b_code=s.b_code;
        this.uniNm=s.uniNm;
    }

    // Display student details
    void getter(){
        System.out.println(enr+":"+b_code+":"+uniNm);
    }
}

public class CopyConstA {
    public static void main(String[] args) {

        // Create first object using parameterized constructor
        Student_A s1=new Student_A(111,23,"DU");

        // Create second object by copying s1
        Student_A s2=new Student_A(s1);

        // Display both objects
        s1.getter();
        s2.getter();
    }
}