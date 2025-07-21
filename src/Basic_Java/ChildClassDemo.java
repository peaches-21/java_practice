public class ChildClassDemo extends ParentInheritanceDemo{
    //super(); implicitly called by JVM
    ChildClassDemo() {
        System.out.println("Child Constructor");
    }
    int b = 20;
    int a = 30;
    void show() {
        System.out.println("Child class");
        System.out.println("Child class " + a);
        //but I need to print parent class
        System.out.println("Parent class " + super.a);// super keyword to access immediate parent class
    }

    void display() {
        System.out.println("Child class display");
        // if both parent and child class having same method and in child you want to access parent method use super keyword it will be override
        super.display();
    }
}