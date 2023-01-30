public class NumberOfLowerCase {
    static int lowerCase(String s ,int idx) {
        int count = 0;
        if (idx == s.length()) {
            return count;
        }
        char currChar = (char)((int)(s.charAt(idx) - 32));
        if (s.charAt(idx) == currChar) {
            count++;
        }
        return count + lowerCase(s, idx + 1);
    }
    public static void main(String[] args) {
        String s = "CollegeWallah";
        int idx = 0;
        System.out.println("Number of lower case letters -> " + (s.length() - lowerCase(s, idx)));
    }
}
