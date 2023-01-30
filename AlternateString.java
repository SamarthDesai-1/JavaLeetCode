public class AlternateString {
    // Recursive Approach
    static String alterStr(String s1 ,String s2 ,int idx) {
        String temp = "";
        if (idx == s1.length()) {
            return temp;
        }
        if (idx % 2 == 0) {
            temp = temp + s1.charAt(idx) + s2.charAt(idx);
        }
        else {
            temp = temp + s1.charAt(idx) + s2.charAt(idx);
        }
        return temp += alterStr(s1, s2, idx + 1);
    }
    // Iterative Approach
    static String alterStr(String s1 ,String s2) {
        String temp = "";
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (i % 2 == 0) {
                    temp = temp + s1.charAt(i) + s2.charAt(i);
                }
                else {
                    temp = temp + s1.charAt(i) + s2.charAt(i);
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        String s1 = "sap";
        String s2 = "pqr";
        int idx = 0;
        System.out.println("Iterative Approach Alernate string : " + alterStr(s1 ,s2));
        System.out.println("Recursive Approach Alernate string : " + alterStr(s1 ,s2 ,idx));
        // Output -> spaqpr
    }
}
