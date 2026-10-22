// Use of this keyword

public class ThisDemo2 {
    int result = 78;

    ThisDemo2(int result) { // Constructor
        System.out.println(this.result);
        System.out.println(result);
    }

    void disp() {
        System.out.println("This keyword demo");
    }

    public static void main(String[] args) {
        ThisDemo2 obj = new ThisDemo2(98);
        obj.disp();
    }
}