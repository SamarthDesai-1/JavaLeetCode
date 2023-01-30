import java.util.*;
public class SubString {
    // Recursion Approach
    static String subStr(String s ,int idx) {
        String temp = "";
        if (idx == s.length()) {
            return temp;
        }
        return temp += s.charAt(idx) + subStr(s, idx + 1);
    }

    // Iteration Approach
    // static String subStr(String s ,int idx) {
    //     String temp = "";
    //     for (int i = idx; i < s.length(); i++) {
    //         temp += s.charAt(i);
    //     }
    //     return temp;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        System.out.print("Enter Index : ");
        int idx = sc.nextInt();
        System.out.println("Sub String -> " + subStr(s, idx));
    }
}
