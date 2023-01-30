public class SumArrayRecursively {
    static int sumArray(int[] array ,int i) {
        if (i == array.length - 1) {
            return array[i];
        }
        return array[i] + sumArray(array, i + 1);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int idx = 0;
        System.out.println("Sum of array : " + sumArray(array, idx));
    }
}
