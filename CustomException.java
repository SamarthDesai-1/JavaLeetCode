import java.util.*;
class MyException extends Exception {
    public String toString() {
        return "I am toString();";
    }
    public String getMessage() {
        return "I am getMessage();";
    }
}
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyException foo = new MyException();
        
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        if (a < 9) {
           try {
                // throw new ArithmeticException("This is an zero division exception");
                throw new MyException();
           }
           catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                // e.printStackTrace();
           }
        }
    }
}
