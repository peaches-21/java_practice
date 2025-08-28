abstract class AbstractDemo{
    /*
     we cannot create object of abstarct class since it hinding implemetation
     we can inheritance abstract class to abstract class or not abstract class
     Abstract class: is a restricted class that cannot be used to create objects 
     (to access it, it must be inherited from another class).
     Abstract method: can only be used in an abstract class, and it does not have a body. 
     The body is provided by the subclass (inherited from).
    */
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

/*
output :
Constructor of AbstractDemo class
Static block of AbstractDemo class
Abstract method in AbstractInheritanceDemo
Show Method AbstractDemo
*/