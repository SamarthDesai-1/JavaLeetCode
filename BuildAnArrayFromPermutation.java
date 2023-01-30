public class BuildAnArrayFromPermutation {
    static int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array = {0,2,1,5,3,4};
        for (int i : buildArray(array)) {
            System.out.print(i + " ");
        }
    }
}
