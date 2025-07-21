public class ThisDemo {
    //represent instance of variable and current object
    int a = 10; //instance
    void display() {
        int a = 20; //local 1st preferece
        System.out.println(a);
        System.out.println("this keyword used "+ this.a);
    }
}
