public class Assignment3_Strings_13 {
    static String alterStr(String s1 ,String s2) {
        String temp = "";
        int iterations = Math.max(s1.length(), s2.length());

        if (s1.length() == s2.length()) {
            for (int i = 0; i < iterations; i++) {
                if (i % 2 == 0) {
                    temp = temp + s1.charAt(i) + s2.charAt(i);
                }
                else {
                    temp = temp + s1.charAt(i) + s2.charAt(i);
                }
            }
            return temp;
        }
        else {
            int min = Math.min(s1.length(), s2.length());
            for (int i = 0; i < min; i++) {
                if (i % 2 == 0) {
                    temp = temp + s1.charAt(i);
                    if (i == s2.length()) {
                        temp += s2.substring(i);
                    }
                }
                else {
                    temp = temp + s2.charAt(i);
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        String s1 = "dog";
        String s2 = "carr";
        System.out.println("Alernate String -> " + alterStr(s1, s2));

    }   
}
