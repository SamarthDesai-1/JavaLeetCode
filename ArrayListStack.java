import java.util.*;

class Stack {
    int tos = -1;
    ArrayList<Integer> list = new ArrayList<>(5);

    public void push(int value) {
        tos++;
        list.add(value);
    }

    public void pop() {
        int x;
        x = list.remove(list.size() - 1);
        System.out.println("Popped element is : " + x);
        tos--;
    }

    public void peep() {
        System.out.println("Peep element is : " + list.get(tos));
    }

    public void display() {
        System.out.println(list);
    }

    public void stackSize() {
        System.out.println("Size of stack : " + list.size());
    }
}
public class ArrayListStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack foo = new Stack();

        int choice = 1;
        while (choice != 0) {
            System.out.println();
            System.out.println("0 : Exit");
            System.out.println("1 : Push");
            System.out.println("2 : Display");
            System.out.println("3 : Stack Size");
            System.out.println("4 : Pop");
            System.out.println("5 : Peep");
            System.out.println();
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    break;
            
                case 1:
                    System.out.print("Enter value to be pushed : ");
                    int value = sc.nextInt();
                    foo.push(value);
                    break;
            
                case 2:
                    foo.display();
                    break;

                case 3:
                    foo.stackSize();
                    break;

                case 4:
                    foo.pop();
                    break;

                case 5:
                    foo.peep();
                    break;
            
                default: System.out.println("Please enter valid input");
                    break;
            }
        } 
    }
}