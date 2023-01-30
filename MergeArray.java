public class MergeArray {
    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array in sorted order ->");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    static void merge(int[] a ,int[] b) {
        if (a.length == 0 || b.length == 0) {
            System.out.println("Merge is not possible");
        }
        else {
            int[] c = new int[(a.length + b.length)];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
            }
            int j = a.length;
            for (int i = 0; i < b.length; i++) {
                c[j] = b[i];
                j++;
            }
            sort(c);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,352};
        int[] b = {2,5,6};
        merge(a ,b);
    }
}
