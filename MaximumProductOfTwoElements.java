public class MaximumProductOfTwoElements {
    static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    static int maxProdTwo(int[] sortedArray) {
        int result = (sortedArray[(sortedArray.length - 1)] - 1) * (sortedArray[(sortedArray.length - 2)] - 1);
        return result;
    }
    public static void main(String[] args) {
        int[] array = {0,0};
        int[] ans = sort(array);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(maxProdTwo(ans));

    }
}