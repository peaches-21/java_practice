public class OverloadingDemo {
    //constructor overloading
    OverloadingDemo() {
        System.out.println("Constructor 1");
    }
    OverloadingDemo(int a) {
        System.out.println("a "+a);
    }

    //method overloading
    void display() {
        System.out.println("Display method");
    }
    void display(String str) {
        System.out.println("String "+ str);
    }

    //oprator overloading + use as addition and concatination
    int a = 5, b = 7;
    public static void main(String[] args) {
        OverloadingDemo o1 = new OverloadingDemo();
        OverloadingDemo o2 = new OverloadingDemo(2);

        OverloadingDemo o = new OverloadingDemo();
        o.display();
        o.display("Hello");

        System.out.println("int a + int b "+ (o.a+o.b));
    }
}
