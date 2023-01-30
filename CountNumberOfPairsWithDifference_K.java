public class CountNumberOfPairsWithDifference_K {
    static void countAbsPairs(int[] nums ,int k) {
        int countAbsPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int absDifference = (nums[i] - nums[j]);
                if (Math.abs(absDifference) == k) {
                    countAbsPairs++;
                }
            }
        }
        System.out.println(countAbsPairs);
    }
    public static void main(String[] args) {
        // int[] nums = {1,2,2,1};
        // int[] nums = {1,3};
        int[] nums = {3,2,1,5,4};
        int k = 2;
        countAbsPairs(nums ,k);
    }
}
