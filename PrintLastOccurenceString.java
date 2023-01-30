public class PrintLastOccurenceString {
    static void printLastOccur(String s , char target ,int idx) {
        if (idx == 0) {
            return;
        }
        if (s.charAt(idx) == target) {
            System.out.println(idx);
            return;
        }
        printLastOccur(s, target, idx - 1);
    }
    public static void main(String[] args) {
        String str = "Samarth";
        char target = 'a';
        int idx = str.length() - 1;
        printLastOccur(str, target, idx);
    }
}
