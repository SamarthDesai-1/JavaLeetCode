public class MaximumProductDifferenceBetweenTwoPairs {
    static int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
    static int maximum(int[] nums) {
        int[] result = new int[nums.length - 1];
        int[] ref = sort(nums);
        int arr1 = ref[0];
        int arr2 = ref[1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                result[i] = (nums[i] * nums[j]) - (arr1 * arr2);
            }
        }
        return result[result.length - 1];
    }
    public static void main(String[] args) {
        int[] array = {4,2,5,9,7,4,8};
        System.out.println("Maximum product difference -> " + maximum(array));

    }
}
