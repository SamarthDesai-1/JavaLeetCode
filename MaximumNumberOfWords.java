// Time Complexity -> O(n + n)
// Space Complexity -> O(1)
public class MaximumNumberOfWords {
    static int maxWords(String s) {
        int space = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                space++;
            }
        }
        return space + 1;
    }
    static int words(String[] s) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length; i++) {
            if (maxWords(s[i]) > max) {
                max = maxWords(s[i]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String[] array = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        words(array);
        maxWords(array[0]);
        System.out.println("MAximum words are -> " + words(array));
    }
}
