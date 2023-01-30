public class UpperCaseToEndString {
    static void upper(char i) {
        int convert = i - 32;
        System.out.println((char)(convert));
    }
    public static void main(String[] args) {
        char ch = 'a';
        upper(ch);
    }
}
