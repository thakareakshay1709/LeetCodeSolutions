package leetcode.challange;

import java.util.TreeMap;

/**
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:
Input:nums = [1,1,1], k = 2
Output: 2
Note:
The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 * @author akshaythakare
 *
 */
public class SubArraySum_Day22 {

	public static void main(String[] args) 
	{
		int[] nums = {1,1,1};
		int k = 2;
		
		System.out.println(subarraySum(nums, k));
		
	}
	
	public static int subarraySum(int[] nums, int k) 
	{
        if (nums == null || nums.length == 0) 
        { 
        	return 0; 
        }
        
        int[] sums = new int[nums.length + 1];
        
        for (int i = 1; i <= nums.length; i++) 
        {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        
        int count = 0;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (int sum: sums) 
        {
            if (map.containsKey(sum - k)) 
            {
                count += map.get(sum - k);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    

}
