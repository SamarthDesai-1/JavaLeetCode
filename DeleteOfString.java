public class DeleteOfString {
    static String deleteOf(String s ,int idx) {
        String temp = "";
        if (idx == s.length()) {
            temp += s.subSequence(0, s.length() - 1);
        }
        else {
            temp += s.substring(0, idx);
            temp += s.substring(idx + 1);
            return temp;
        }
        return temp;
    }
    public static void main(String[] args) {
        String s = "Hello";
        // int idx = s.length();
        int idx = 0;
        System.out.println("New String -> " + deleteOf(s, idx));
    }
}

