public class TwoStringArrayAreEquivalent {
    static String merge(String[] s) {
        String temp = "";
        for (int i = 0; i < s.length; i++) {
            temp += s[i];
        }
        return temp;
    }
    static boolean result(String[] s1 ,String[] s2) {
        for (int i = 0; i < s2.length; i++) {
            if ((merge(s1).equals(merge(s2)))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] s1 = {"abc","c","defg"};
        String[] s2 = {"abccdefg"};
        System.out.println("Result -> " + result(s1, s2));
    }
    
}