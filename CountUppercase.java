public class CountUppercase {
    static int countUc(String s ,int idx) {
        int count = 0;
        if (idx == s.length()) {
            return count;
        }
        if (s.charAt(idx) >= 'a' && s.charAt(idx) <= 'z') {
            count++;
        }
        return count + countUc(s, idx + 1);
    }
    static int countUc(String s) {
        int count = 0;
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= 'a' && s.charAt(index) <= 'z') {
                count++;
            }
        }
        return s.length() - count;
    }
    public static void main(String[] args) {
        String s = "SamartH";
        int idx = 0;
        System.out.println("Upper Case letters in a string -> " + countUc(s));
        System.out.println("Upper Case letters in a string -> " + (s.length() - countUc(s ,idx)));
    }
}
