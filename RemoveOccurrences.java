public class RemoveOccurrences {
    static String remove(String str ,int idx) {
        if (idx == str.length()) {
            return " ";
        }
        String smallAns = remove(str, idx + 1);
        char currChar = str.charAt(idx);
        if (currChar != 'a') {
            return currChar + smallAns;
        }
        else {
            return smallAns;
        }
    }
    public static void main(String[] args) {
        String str = "Samarth";
        int idx = 0;
        System.out.println("New String : " + remove(str, idx));
    }   
}
