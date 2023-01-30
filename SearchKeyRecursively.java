public class SearchKeyRecursively {
    static int printElement(int[] array ,int idx ,int key) {
        if (idx == array.length - 1) {
            return idx;
        }
        if (array[idx] == key) {
            return idx;
        }
        return printElement(array, idx + 1, key);
    }
    static boolean check(int[] array ,int idx ,int key) {
        if (idx == array.length - 1) {
            return false;
        }
        if (array[idx] == key) {
            return true;
        }
        return check(array, idx + 1, key);
    }
    public static void main(String[] args) {
        int[] array = {1,2,7,5,3};
        int idx = 0;
        int key = 1;
        System.out.println(printElement(array, idx, key));
        System.out.println(check(array, idx, key));
    }
}
