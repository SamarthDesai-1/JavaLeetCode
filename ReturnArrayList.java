import java.util.*;
public class ReturnArrayList {
    static ArrayList<Integer> allIndeices(int[] array ,int target ,int idx) {
        if (idx >= array.length) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (array[idx] == target) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns =  allIndeices(array, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] array = {1,2,7,2,2,5};
        int idx = 0;
        int target = 2;
        ArrayList<Integer> ans = allIndeices(array, target, idx);
        System.out.println(ans);
    }
}
