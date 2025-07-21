public class VariableDemo {
    int a = 10; // Instance variable
    static int c = 30; //Static variable
    public void test() {
        int b = 20; // Local variable
        System.out.println("Static variable "+c);
        System.out.println("Local variable "+b);
        //Instance cannot access without creating object of class
        VariableDemo v = new VariableDemo(); // class name object = new constructor
        System.out.println("Instance variable "+v.a);
    }
}
