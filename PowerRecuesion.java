import java.util.*;
public class PowerRecuesion {
    public static void power(int n ,int i ,int rangeEnd) {
        if (n == rangeEnd) {
            System.out.println(Math.pow(n, i));
            return;
        }
        System.out.println(Math.pow(n, i));
        power(n + 1, 2, rangeEnd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int i = 2;
        System.out.print("Enter range end point : ");
        int rangeEnd = sc.nextInt();
        power(n, i, rangeEnd);
    }
}
