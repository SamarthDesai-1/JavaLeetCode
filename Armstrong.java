public class Armstrong {
    static int arm(int n) {
        if (n < 10) {
            return n * n * n;
        }
        return (n % 10) * (n % 10) * (n % 10) + arm(n / 10);
    }
    public static void main(String[] args) {
        int n = 153;
        int r = arm(n);
        if (n == r) {
            System.out.println(n + " Armstrong number");
        }
        else {
            System.out.println(n + "Non-Armstrong number");
        }
    }
}
// 153 // true
// 123 // false