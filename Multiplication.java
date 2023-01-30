import java.util.*;
public class Multiplication {
    public static void mul(int n ,int i) {
        if (i == 1) {
            System.out.println(n + " * " + i + " = " + (n * i));
            return;
        }
        mul(n, i - 1);
        System.out.println(n + " * " + i + " = " + (n * i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        final int i = 10;
        mul(n, i);
        
    }
}
