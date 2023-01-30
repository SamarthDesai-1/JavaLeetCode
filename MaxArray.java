public class MaxArray {
    static int maxArray(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    static boolean[] boolArray(int[] array) {
        boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 100) {
                result[i] = true;
            }
            else {
                result[i] = false;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {140,10,25};
        System.out.println("Max in array : " + maxArray(array));
        
        boolean[] print = boolArray(array);
        for (boolean b : print) {
            System.out.print(b + " ");
        }
    }
}
