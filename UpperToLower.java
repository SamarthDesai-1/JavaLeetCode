public class UpperToLower {
    static String toLcase(String s ,int idx) {
        String temp = "";
        if (idx == s.length()) {
            return temp;
        }
        char convert = (char)((int)(s.charAt(idx) + 32));
        return temp + convert + toLcase(s, idx + 1);
    }
    static String toLcase(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char convert = (char)((int)(s.charAt(i) + 32));
            temp += convert;
        }
        return temp;
    }
    public static void main(String[] args) {
        String s = "SAMARTH";
        int idx = 0;
        System.out.println("Iterative Lowercase -> " + toLcase(s));
        System.out.println("Recursive Lowercase -> " + toLcase(s ,idx));
    }

}
