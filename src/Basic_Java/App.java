public class App {
    public static void main(String[] args) throws Exception {

        /* Access modifier
        public : The code is accessible for all classes	
        private	: The code is only accessible within the declared class	
        default	: The code is only accessible in the same package. 
                  This is used when you don't specify a modifier. 	
        protected : The code is accessible in the same package and subclasses.
         */
        //non-access modifiers are final, static, and abstract
        System.out.println("Hello, World!");

        VariableDemo v = new VariableDemo();
        v.test();
        ConstructorDemo c = new ConstructorDemo();
        c.testDefaultConstructor();
        c.testParametarizedConstructor();
        StaticDemo s = new  StaticDemo();
        System.out.println(s.a);
        s.display();
        
        // ThisDemo t = new ThisDemo();
        // t.display();

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
