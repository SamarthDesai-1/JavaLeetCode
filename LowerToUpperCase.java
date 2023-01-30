public class LowerToUpperCase {
    static String toUcase(String s ,int idx) {
        String temp = "";
        if (idx == s.length()) {
            return temp;
        }
        char convert = (char)((int)(s.charAt(idx) - 32));
        return temp + convert + toUcase(s, idx + 1);
    }
    static String toUcase(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char convert = (char)((int)(s.charAt(i) - 32));
            temp += convert;
        }
        return temp;
    }
    public static void main(String[] args) {
        String s = "samarth";
        int idx = 0;
        System.out.println("Iterative UpperCase -> " + toUcase(s));
        System.out.println("Recursive UpperCase -> " + toUcase(s ,idx));

    }
}
