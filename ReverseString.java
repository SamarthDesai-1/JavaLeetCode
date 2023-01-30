public class ReverseString {
    // Recursive Approach
    static String rev(String s ,int idx) {
        String temp = "";
        if (idx == s.length()) {
            return temp;
        }
        return rev(s, idx + 1) + s.charAt(idx) + temp; 
    }
    // Iterative Approach
    static String rev(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        return temp;
    }
    public static void main(String[] args) {
        String s = "ceo";
        System.out.println("Using Recursive Approach -> " + rev(s, 0));
        System.out.println("Using Iterative Approach -> " + rev(s));
    }
}
