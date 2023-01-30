import java.util.*;
public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements in ArrayList
        list.add(4);
        list.add(75);
        list.add(26);

        // Get element index i
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Or another way to print arraylist");
        System.out.println();
        System.out.println(list);

        // Add element at some index i
        list.add(1 ,256);
        System.out.println();
        System.out.println(list);

        // Modifying element at index i
        list.set(1 ,356);
        System.out.println();
        System.out.println(list);

        // Remove an element at some index i
        list.remove(1);
        System.out.println();
        System.out.println(list);

        // Remove an element 
        list.remove(Integer.valueOf(26));
        System.out.println();
        System.out.println(list);

        // Checking an element if it's exists or not
        System.out.println();
        System.out.println(list.contains(Integer.valueOf(0)));

        // If you don't specify any class yout can put anything inside arraylist
        // ArrayList l = new ArrayList<>();
        // l.add("Samarth");
        // l.add("Desai");
        // l.add(26);
        // l.add(0.26f);
        // System.out.println(l);
    }
}