public class IsSorted {
    static boolean checkSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
        }
        if (count == array.length - 1) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,8,3};
        System.out.println("Sorted Check : " + checkSort(array));
    }
}
