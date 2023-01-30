public class DifferenceSumArrayAndSumDigits {
    static int count(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
    static void check(int[] array) {
        int digitsArraySum = 0;
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            digitsArraySum += count(array[i]);
            arraySum += array[i];
            
        }
        System.out.println("Array sum -> " + arraySum);
        System.out.println("Sum of digits of array -> " + digitsArraySum);
        int result = digitsArraySum - arraySum;
        System.out.println(Math.abs(result));
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        check(array);
        
    }
}
