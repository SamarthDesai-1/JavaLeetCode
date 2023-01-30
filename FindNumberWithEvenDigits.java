/**
 * 1295. Find Numbers with Even Number of Digits
Easy
1.8K
107
Companies
Given an array nums of integers, return how many of them contain an even number of digits.

 

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105
 */
public class FindNumberWithEvenDigits {
    static int count(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    static int giveEven(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = count(nums[i]);
        }
        for (int i : result) {
            if (i % 2 == 0) {
                even++;
            }
        }
        return even;
    }
    public static void main(String[] args) {
        int[] array = {555,901,482,1771};
        System.out.println(giveEven(array));
    }
}