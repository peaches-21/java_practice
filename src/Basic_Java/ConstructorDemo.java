public class ConstructorDemo {
    //constructor overloading default and parameterized
    String name;
    int id;
    //Default constructor
    ConstructorDemo() {
        name = "TestJava";
        id = 12;
    }

    public void testDefaultConstructor() {
        ConstructorDemo c_default = new ConstructorDemo();
        System.out.println("Constructor name "+ c_default.name);
        System.out.println("Constructor id "+ c_default.id);
    }

    //Parametarized constructor
    ConstructorDemo(String cname, int cid) {
        name = cname;
        id = cid;
    }

    public void testParametarizedConstructor() {
        ConstructorDemo c_parametarized = new ConstructorDemo("P name", 15);
        System.out.println("Constructor name "+ c_parametarized.name);
        System.out.println("Constructor id "+ c_parametarized.id);
    }
}