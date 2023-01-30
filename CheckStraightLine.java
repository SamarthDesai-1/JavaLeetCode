/**
 * 1232. Check If It Is a Straight Line
Easy
1.2K
176
Companies
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

 

 

Example 1:



Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
Example 2:



Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false
 

Constraints:

2 <= coordinates.length <= 1000
coordinates[i].length == 2
-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
coordinates contains no duplicate point.
 */
public class CheckStraightLine {
    static boolean checkStraightLine(int[][] coordinates) {

        int line = 0;
        for (int i = 0; i < coordinates.length - 1; i++) {
            for (int j = i + 1; j < coordinates[0].length - 1; j++) {
                if ((coordinates[i] > coordinates[i + 1]) && (coordinates[j] > coordinates[j + 1])) {
                    line++;
                }
               
            }
        }
        if (line == (coordinates.length + coordinates[0].length - 1)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        // int[][] coordinates = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        boolean result = checkStraightLine(coordinates);
        System.out.println(result);
    }
}
