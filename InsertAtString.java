public class InsertAtString {
    static String insAt(String s ,String insert ,int idx ,boolean space) {
        String temp = "";
        if (s.length() == idx) {
            temp += s;
            if (space == true) {
                temp += " ";
            }
            temp += insert;
            return temp;
        }
        for (int i = 0; i < idx; i++) {
            temp += s.charAt(i);
        }
        if (space == true) {
            temp += " ";
        }
        temp += insert;
        for (int i = idx; i < s.length(); i++) {
            temp += s.charAt(i);
        }
        return temp;
    }
    public static void main(String[] args) {
        String str = "Hello Wolf";
        String insert = "WorldOf";
        int idx = 5;
        boolean sp = true;
        System.out.println("New String -> " + insAt(str ,insert ,idx ,sp));
    }
}
