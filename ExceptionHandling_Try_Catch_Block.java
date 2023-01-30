public class ExceptionHandling_Try_Catch_Block {
    public static void main(String[] args) {
        int a = 24;
        int b = 0;
        int result;
        try {
            result = a / b;
            System.out.println("Division is -> " + result);
        } catch (Exception e) {
            System.out.println("We cannot divide the commands reason is");
            System.out.println(e);
        }
        finally {
            System.out.println("ExceptionHandling_Try_Catch_Block.main()");
        }
        
    }
}
