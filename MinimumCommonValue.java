public class MinimumCommonValue {
    static void minValue(int[] nums1 ,int[] nums2) {
        int[] res = new int[(nums1.length)];
        for (int i = 0; i < nums1.length; i++) {
            for (int j =  0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res[i] = nums1[i] = nums2[j];
                }
            }
        }

        for (int i : res) {
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println();

    
      
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,4};
        // int[] arr1 = {1,2,3,6};
        // int[] arr2 = {2,3,4,5};
        minValue(arr1, arr2);

    }
}
