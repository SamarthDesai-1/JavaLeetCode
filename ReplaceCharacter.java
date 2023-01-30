public class ReplaceCharacter {
    // Recursive Approach
    static String rep(String s ,char target ,char replace ,int idx) {
        String temp = "";
        if (idx == s.length()) {
            return temp;
        }
        if (s.charAt(idx) != target) {
            temp += s.charAt(idx);
        }
        if (s.charAt(idx) == target) {
            temp += replace;
        }
        return temp += rep(s, target, replace, idx + 1);
    }
    // Iteration Approach 
    // static String rep(String s ,char target ,char replace) {
    //     String temp = " ";
    //     for (int i = 0; i < s.length(); i++) {
    //         if (s.charAt(i) != target) {
    //             temp += s.charAt(i);
    //         }
    //         else {
    //             temp += replace;
    //         }
    //     }
    //     return temp;
    // } 
    public static void main(String[] args) {
        String s = "Raxit";
        char target = 'x';
        char replace = 's';
        int idx = 0;
        System.out.println("New String -> " + rep(s, target, replace ,idx));
    }
}
