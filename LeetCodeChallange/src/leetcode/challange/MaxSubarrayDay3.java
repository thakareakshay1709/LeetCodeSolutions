package leetcode.challange;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * @author akshaythakare
 *
 */
public class MaxSubarrayDay3 {

	public static void main(String[] args) 
	{
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println("Out "+ maxSubArray2(arr));
	}
	
	public static int maxSubArray2(int[] nums)
	{
		int result = nums[0];
		
		for (int i = 1; i < nums.length; i++) 
		{
			result = getMax(nums);
		}
		
		return result;
	}
	
	private static int getMax(int[] nums) {
		
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i] > max)
			{
				max = nums[i];
			}
			
		}
		
		return max;
	}

	public static int maxSubArray1(int[] nums) {
	    int output = nums[0];
	    int len = nums.length;
	    int tot = nums[0];
	    for(int i=1; i < len; i++)
	    {
	        tot = Math.max(nums[i], tot + nums[i]);
	        output = Math.max(output,tot);
	    }
	    return output;
	}

}
