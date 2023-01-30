public class KidCandies {
    static void maxCandies(int[] candies ,int extraCandies) {
        int[] result = new int[candies.length];
        boolean[] boolRes = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if (extraCandies == 1) {
                result[i] = candies[i] + extraCandies;
                break;
            }
            result[i] = candies[i] + extraCandies;
        }
        for (int i : result) {
            System.out.print(i + " ");
        }

        // Iterative over result loop
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < boolRes.length; i++) {
            if (result[i] < min) {
                min = result[i];
            }
        }
        System.out.println();
        System.out.println("Min Value : " + min);

        for (int i = 0; i < boolRes.length; i++) {
            if (result[i] > min) {
                boolRes[i] = true;
            }
            else {
                boolRes[i] = false;
            }
        }



        for (boolean b : boolRes) {
            System.out.print(b + " ");
        }
    }
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        maxCandies(candies ,extraCandies);

    }
}
