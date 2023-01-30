public class UppercaseToEnd {
    static String toEnd(String s ,int idx) {
        String temp = "";
        if (idx == s.length()) {
            return temp;
        }
        if (s.charAt(idx) >= 'A' && s.charAt(idx) <= 'Z') {
            return temp += s.substring(idx);
        }
        return temp + toEnd(s, idx + 1);
    }
    public static void main(String[] args) {
        String s = "collegeWallah";
        int idx = 0;
        System.out.println("New String -> "+ toEnd(s, idx));
    }
}
