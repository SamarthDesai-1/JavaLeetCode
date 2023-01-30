public class ConcatArray {
    static int[] concat(int[] nums) {
        int[] newArray = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
        }
        int idx = 0;
        for (int i = nums.length; i < newArray.length; i++) {
            newArray[i] = nums[idx];
            idx++;
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array = {1,3,2,1}; // Output -> 1 3 2 1 1 3 2 1
        for (int i : concat(array)) {
            System.out.print(i + " ");
        }
    }
}

