public class FindTheHighestAltitude {
    static int netGain(int[] nums) {
        int[] result = new int[nums.length + 1];
        result[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            // arr[i + 1] = (arr[i] ^ a[i]);
            result[i + 1] = result[i] + nums[i];
        }
        int neg = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] < 0) {
                neg++;
            }
        }
        if (neg == result.length - 1) {
            return 0;
        }
        else {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < result.length; i++) {
                max = Math.max(max ,result[i]);
            }
            return max;
        }
    }
    public static void main(String[] args) {
        // int[] gain = {52,-91,72};
        int[] gain = {-5,1,5,0,-7};
        // int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(netGain(gain));
    }
}
