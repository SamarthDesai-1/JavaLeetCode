public class Demo {
    static int answer(String s) {
        int x = 0;
        int countPos = 0;
        int countNeg = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                countPos++;
            }
            else if (s.charAt(i) == '-') {
                countNeg--;
            }
        }
        if (countPos == 2) {
            x = x + 1;
        }
        else {
            x = x - 1;
        }
        return x;
    }
    static int operations(String[] operations) {
        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            ans += answer(operations[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] array = {"--X","X++","X++"};
        // String[] array = {"++X","X++","X++"};
        String s = "++X";
        System.out.println("Final Result -> " + operations(array));
        System.out.println(s + " = " + answer(s));
    }
}
