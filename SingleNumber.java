public class SingleNumber {
    static int singleNumber(int[] nums) {
        // O(n ^ 2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        // O(n)
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i + 1] = 0;
            }
        }

        // O(n)
        for (int i : nums) {
            if (i != 0) {
                return i;
            } 
        }
        return -1;

        // Total time complexity would be : O(n ^ 2 + n);
    }
    public static void main(String[] args) {
        // int[] array = {2,2,1};
        // int[] array = {4,1,2,1,2};
        int[] array = {1};
        System.out.println(singleNumber(array));
    }
}
