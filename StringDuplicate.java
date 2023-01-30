public class StringDuplicate {
    static String strDup(int times ,String s ,int idx) {
        String temp = "";
        if (idx == times) {
            return temp;
        }
        return temp + s + strDup(times, s, idx + 1);
    }
    static String strDup(int times ,String s) {
        String temp = "";
        for (int i = 0; i < times; i++) {
            temp += s;
        }
        return temp;
    }
    public static void main(String[] args) {
        int times = 12;
        String str = "#";
        int idx = 0;
        System.out.println("Iterative Approach -> " + strDup(times, str));
        System.out.println("Recursive Approach -> " + strDup(times, str, idx));
    }
}
