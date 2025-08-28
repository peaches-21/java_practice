public class VariableDemo {
    int a = 10; // Instance variable
    static int c = 30; //Static variable
    /*
        When you do not want a variable's value to change, use the final keyword.
        A variable declared with final becomes a constant, which means unchangeable and read-only
    */
    final int myNum = 15;
    //myNum = 20; Error: cannot assign a value to final variable 'myNum'
    public void test() {
        int b = 20; // Local variable
        System.out.println("Static variable "+c);
        System.out.println("Local variable "+b);
        //Instance cannot access without creating object of class
        VariableDemo v = new VariableDemo(); // class name object = new constructor
        System.out.println("Instance variable "+v.a);
        //accessing class attributes
        v.a = 25;
        System.out.println("Accessing class attributes "+v.a);
        System.out.println("Final variable " +myNum);
    }
}
/*
Output :
Static variable 30
Local variable 20
Instance variable 10
Accessing class attributes 25
Final variable 15
*/