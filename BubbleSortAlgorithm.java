class Sorting {
    public int checkSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                count++;
            }
        }
        return count; 
    }
    public int[] bubbleSort(int[] array) {
        int checkSort = checkSort(array);
        if (checkSort == array.length - 1) {
            return array;
        }
        else {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }
}
public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] array = {1,2,52,1,-1,10};
        Sorting s = new Sorting();
        for (int i : s.bubbleSort(array)) {
            System.out.print(i + " ");
        }
    }
}
