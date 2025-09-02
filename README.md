## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

Object : Any entity that has state and behavior is known as an object

Class : Collection of objects is called class. It is a logical entity.
A class can also be defined as a blueprint from which you can create an individual object. Class doesn't consume any space.

public class A  
{  
    static int static_var=100;//variable that is declared as static is called a static variable. It cannot be local
    int instance_var1=50;//variable declared inside the class but outside the body of the method 
    void method()  
    {    
        int local_var=90;//variable declared inside the body of the method  
    }  
    public static void main(String args[])  
    {  
        int instance_var2=50;//variable declared inside the class but outside the body of the method 
    }  
}

Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

Inheritance
When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability.
IS-A relationship which is also known as a parent-child relationship. extends class to another class
Aggregation represents HAS-A relationship. create object of class in another class

Polymorphism
If one task is performed in different ways, it is known as polymorphism

multiple methods having same name but different in parameters, it is known as Method Overloading.
Overloading is a form of compile-time polymorphism

If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
Overriding is a form of runtime polymorphism
Rules for Java Method Overriding
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).

Abstraction
Hiding internal details and showing functionality is known as abstraction. For example phone call, we don't know the internal processing.

Encapsulation
Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines.

Constructor :  is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.
Default and parametric constructor 
Constructor name same as class name, cannot be abstract, static, final, and synchronized, no return type

Static keyword : We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

this keyword : is a reference variable that refers to the current object.
this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.

super keyword : in Java is a reference variable which is used to refer immediate parent class object.
Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable
super can be used to refer immediate parent class instance variable. (same variable in both class to override child super)
super can be used to invoke immediate parent class method. (same method in both class to override child super)
super() can be used to invoke immediate parent class constructor. (super method can call parent constructor in child)

final keyword : in java is used to restrict the user. The java final keyword can be used in many context. Final can be: variable, method, class
The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only.
you cannot change the value of final variable(It will be constant).it stop value change, method overriding, inheritance.

The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
The instanceof in java is also known as type comparison operator because it compares the instance with type. It returns either true or false. If we apply the instanceof operator with any variable that has null value, it returns false.

java package : is a group of similar types of classes, interfaces and sub-packages. Package in java can be categorized in two form, built-in package and user-defined package. There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc. Here, we will have the detailed learning of creating and using user-defined packages.

     Data Structure	Stores	Keeps Order?	    Allows Duplicates?	    Best For
     ArrayList	            Ordered elements	Yes	                    Yes	Accessing elements by index
     HashSet	            Unique elements	No	No	                    Avoiding duplicates, fast checks
     HashMap	            Key-value pairs	No	Yes (keys are unique)	Fast lookup by key

     Interface	Common Classes	                    Description
     List	    ArrayList, LinkedList	            Ordered collection that allows duplicates
     Set	    HashSet, TreeSet, LinkedHashSet	    Collection of unique elements
     Map	    HashMap, TreeMap, LinkedHashMap	    Stores key-value pairs with unique keys

     Interface	Class	        Description
     List	    ArrayList	    Resizable array that maintains order and allows duplicates
                LinkedList	    List with fast insert and remove operations
     Set	    HashSet	        Unordered collection of unique elements
                TreeSet	        Sorted set of unique elements (natural order)
                LinkedHashSet	Maintains the order in which elements were inserted
     Map	    HashMap	        Stores key/value pairs with no specific order
                TreeMap	        Sorted map based on the natural order of keys
                LinkedHashMap	Maintains the order in which keys were inserted
    