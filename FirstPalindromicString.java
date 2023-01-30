public class FirstPalindromicString {
    static String palin(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        return temp;
    }
    static String first(String[] a) {
        for (int i = 0; i < a.length; i++) {
            String temp = palin(a[i]);
            if (temp.equals(a[i])) {
                return a[i];
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] array = {"abc","car","ada","racecar","cool"};
        System.out.println("First palindromic string -> " + first(array));
    }
}
