import java.util.*;
public class ExceptionHandling_Handle_Specific_Exceptions {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        Scanner foo = new Scanner(System.in);
        int n = 266;
        System.out.print("Enter N : ");
        int divide = foo.nextInt();
        int result = n / divide;
        System.out.print("Enter Index : ");
        int idx = foo.nextInt(); 
        try {
            System.out.println("Result = " + result);
            System.out.println("Array index element : " + array[idx]);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException Occures!!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException s) {
            System.out.println("ArrayIndexOutOfBoundsException Occures!!");
            System.out.println(s);
        }
        catch (Exception e) {
            System.out.println("Some another exception is occures!!");
        }
        
    }
}
