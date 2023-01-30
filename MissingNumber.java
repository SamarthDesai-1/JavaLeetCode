public class MissingNumber {
    static int missing(int[] nums) {
        int n = nums.length;
        int actualSum = n * (n + 1) / 2;
        int wrongSum = 0;
        for (int i = 0; i < nums.length; i++) {
            wrongSum += nums[i];
        }
        int result = actualSum - wrongSum;
        return Math.abs(result);
    }
    public static void main(String[] args) {
        int[] array = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing Number is -> " + missing(array));
    }
}
