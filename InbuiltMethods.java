import java.util.*;
public class InbuiltMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(56);
        list.add(75);
        list.add(12);
        list.add(1532);
        list.add(485);
        System.out.println("Original list : " + list);
        Collections.sort(list);
        System.out.print("Compile list : ");
        System.out.println(list);

        System.out.println();
        Collections.reverse(list);
        System.out.print("Print in reverse order : " + list);



    }
}
