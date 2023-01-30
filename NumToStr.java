public class NumToStr {
    static String digits[] = {"Zero" ,"One" ,"Two" ,"Three" ,"Four" ,"Five" ,"Six" ,"Seven" ,"Eight" ,"Nine"};
    static void con(int n) {
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        con(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }
    public static void main(String[] args) {
        con(2533);
        System.out.println();
    }
}