/*
    1672. Richest Customer Wealth
Easy
3.1K
311
Companies
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

 

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
Example 3:

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
 

Constraints:

m == accounts.length
n == accounts[i].length
1 <= m, n <= 50
1 <= accounts[i][j] <= 100
 */
public class RichiestCustomerWealth {

    static int wealth(int[][] array) {
        System.out.println("Customer Wealth Data.....");
        int sum = 0;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
            result[i] = sum;
            sum = 0;
            continue;
        }

        int max = Integer.MIN_VALUE;
        int duplicates = 0;
        for (int i = 0; i < result.length; i++) {
            max = Math.max(max ,result[i]);
        }       
        return max;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println("Maximum wealth -> " + wealth(accounts));
    }
}
