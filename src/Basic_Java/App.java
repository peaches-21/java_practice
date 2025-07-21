public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        VariableDemo v = new VariableDemo();
        v.test();
        ConstructorDemo c = new ConstructorDemo();
        c.testDefaultConstructor();
        c.testParametarizedConstructor();
        StaticDemo s = new  StaticDemo();
        System.out.println(s.a);
        s.display();
        
        ThisDemo t = new ThisDemo();
        t.display();

        //Single Inheritance
        ChildClassDemo cc = new ChildClassDemo();
        cc.display();
        cc.show(); 

        NonAbstractInheritanceDemo1 na1 = new NonAbstractInheritanceDemo1();
        na1.display();
        na1.show();

        NonAbstractInheritanceDemo2 na2 = new NonAbstractInheritanceDemo2();
        na2.display();
        na2.show();

        ImplementInterface ii = new ImplementInterface();
        ii.adisplay();
        ii.bdisplay();
    }
}
