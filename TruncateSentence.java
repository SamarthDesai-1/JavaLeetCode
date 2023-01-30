public class TruncateSentence {
  
    static String[] toStringArray(String str) {
        String[] strArray = str.split(" ");
        return strArray;
        
    }
    static void truncateSentence(String s ,int k) {
        String[] ref = toStringArray(s);
        String temp = "";
        for (int i = 0; i < k; i++) {
            temp += ref[i] += " ";
        }
        System.out.println(temp);
        
    }
    public static void main(String[] args) {
        String str = "What is the solution to this problem";
        int k = 4;
        truncateSentence(str, k);
    }
}
