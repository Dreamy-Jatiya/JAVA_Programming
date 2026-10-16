// Add two Time objects: t3 = t1 + t2
// Constructor overloading, passing objects and returning an object

class Time_A {
    int hr, min, sec;

    // Parameterized constructor
    Time_A(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    // Default constructor
    Time_A() {
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }

    // Add two Time objects and return the current object
    Time_A addTime(Time_A t1, Time_A t2) {
        this.sec = t1.sec + t2.sec;
        this.min = t1.min + t2.min;
        this.hr = t1.hr + t2.hr;

        // Convert seconds into minutes
        if (sec >= 60) {
            this.min += this.sec / 60;
            this.sec = this.sec % 60;
        }

        // Convert minutes into hours
        if (min >= 60) {
            this.hr += this.min / 60;
            this.min = this.min % 60;
        }

        return this; // Return the current object
    }
}

public class TimeObjA {
    public static void main(String[] args) {
        Time_A t1 = new Time_A(10, 120, 66);
        Time_A t2 = new Time_A(0, 3, 2);

        Time_A t3 = new Time_A();

        // Add t1 and t2 and store the returned object in t3
        t3 = t3.addTime(t1, t2);

        System.out.println(t3.hr + "::" + t3.min + "::" + t3.sec);
    }
}
