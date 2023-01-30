public class SortThePeople {
    static void sort(int[] height ,String[] name) {
        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
                if (height[i] > height[j]) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (String i : name) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        // ["IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"]
        String[] str = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        // [17233,32521,14087,42738,46669,65662,43204,8224]
        int[] height = {1,17,2,534,41,2,5,3};
        sort(height, str);
    }
}
