public class CountEqualsAndDivisiblePairs {
    

    static void pairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("[" + i + " ," + j + "]");
                if (nums[i] == nums[j] && ((i * j) % 2 == 0)) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] array = {3,1,2,2,2,1,3};
        // int[] array = {1,2,3,4};
        int k = 2;
        pairs(array);
    }
}
