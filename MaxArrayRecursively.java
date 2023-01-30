public class MaxArrayRecursively {
    static int maxArray(int[] array ,int idx) {
        if (idx == array.length - 1) {
            return array[idx];
        }

        int smallAns = maxArray(array, idx + 1);
        return Math.max(array[idx] ,smallAns);
    }
    public static void main(String[] args) {
        int array[] = {50,8,3,2,10};
        int idx = 0;
        System.out.println(maxArray(array, idx));
    }
}
