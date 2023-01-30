interface A {
    void display();
}
interface B {
    void display();
}
class C implements A ,B {
    public void display() {
        System.out.println("Hello world of interface");
    }
}
public class Inteface {
    public static void main(String[] args) {
        C foo = new C();
        foo.display();
        
    }
}
