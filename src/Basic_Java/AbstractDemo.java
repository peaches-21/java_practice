abstract class AbstractDemo{
    //we cannot create object of abstarct class since it hinding implemetation
    //we can inheritance abstract class to abstract class or not abstract class
    AbstractDemo() {
        System.out.println("Constructor of AbstractDemo class");
    }
    static {
        System.out.println("Static block of AbstractDemo class");
    }
    abstract void display();
    void show() {
        System.out.println("Show Method AbstractDemo");
    }
}