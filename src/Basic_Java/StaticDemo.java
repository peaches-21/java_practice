public class StaticDemo {
    static int a = 10;
    static void display() {
        System.out.println("Static Method");
    }
    //Whenever class excutes always runs static block
    static {
        System.out.println("Static Block");
    }
    /*
     we created a static method, 
     which means that it can be accessed without creating an object of the class, 
     unlike public, which can only be accessed by objects
    */
    public static void main(String[] args) {
        System.out.println(a);
        display();
    }
}

/*
 Static Block
 10
 Static Method
 */
