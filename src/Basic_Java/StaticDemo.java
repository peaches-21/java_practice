public class StaticDemo {
    static int a = 10;
    static void display() {
        System.out.println("Static Method");
    }
    //Whenever class excutes always runs static block
    static {
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
        System.out.println(a);
        display();
    }
}
