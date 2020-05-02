package leetcode.challenge.april20;

import java.util.HashMap;

/**
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
Note: The length of the given binary array will not exceed 50,000.
 * @author akshaythakare
 *
 */
public class ContiguousArrayDay13 {

	public static void main(String[] args) 
	{
		int[] nums = {0,1,0};
		System.out.println(findMaxLength(nums));
	}
	public static int findMaxLength(int[] nums) 
	{
        HashMap<Integer, Integer> sum = new HashMap<>();
        int s = 0;
        
        int countLong = 0;
        sum.put(0, -1); // put 0 to the left
        for(int i = 0;i < nums.length;++i) {
            if(nums[i] == 0) {
                s += -1;
            } else {
                s += 1;
            }
            
            if(sum.containsKey(s)) {
            	countLong = Math.max(countLong, i - sum.get(s));       
            } else {
                sum.put(s, i);
            }
        }
        
        return countLong;
    }

}
