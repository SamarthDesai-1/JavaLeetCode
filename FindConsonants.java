public class FindConsonants {
    static int vowel(String s ,int idx) {
        int count = 0;
        if (idx == s.length()) {
            return count;
        }
        if (s.charAt(idx) == 'a' || s.charAt(idx) == 'e' || s.charAt(idx) == 'i' || s.charAt(idx) == 'o' || s.charAt(idx) == 'u') {
            count++;
        }
        return count + vowel(s, idx + 1);
    }
    public static void main(String[] args) {
        String s = "pwskills";
        int idx = 0;
        System.out.println("Consonants -> " + (s.length() - vowel(s, idx)));
    }
}
