public class SortingAlgorithms {
    static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.print("[");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[min]) {
                    min = i;
                }
            }
            if (min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        System.out.print("[");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[] bubble = {7,2,1,4,5,8,6,0};
        bubbleSort(bubble);
        int[] selection = {7,2,1,4,5,8,6,0};
        selectionSort(selection);

    }
}
