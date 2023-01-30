public class MoveZerosToEnd {
    static void moveZeros(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] == 0 && nums[j + 1] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {0,4,0,4,5,2,0,7,8};
        moveZeros(array);
    }
}