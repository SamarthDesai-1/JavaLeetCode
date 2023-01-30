public class DigitsSum {
    static int digSum(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 23;
        System.out.println(digSum(n));
    }
}
