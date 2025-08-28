public class ThisDemo {
    //represent instance of variable and current object
    /*
     The this keyword in Java refers to the current object in a method or constructor.
     The this keyword is often used to avoid confusion 
     when class attributes have the same name as method or constructor parameters.
     */
    // Constructor with one parameter x
    public ThisDemo(int a) {
        this.a = a; // refers to the class variable x
    }
    int a = 10; //instance
    void display() {
        int a = 20; //local 1st preferece
        System.out.println(a);
        System.out.println("this keyword used "+ this.a);
        ThisDemo td = new ThisDemo(35);
        System.out.println("this keyword used from constructor "+ td.a);
    }
}
/*
 20
 this keyword used 10
this keyword used from constructor 35
 */