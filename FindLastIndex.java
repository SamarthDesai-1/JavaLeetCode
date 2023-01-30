public class FindLastIndex {
    public static void main(String[] args) {
        int[] array = {1,4,2,4,5,4,5};
        int lastIndex = -1;
        int target = 4;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == target) {
                lastIndex = i;
                break;
            }
        }
        System.out.println("Last Index : " + lastIndex);
    }
}
