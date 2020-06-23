package leetcode.explore.learn.arrayandstring;

public class LargestNumberAtLeastTwiceofOthers 
{

	public static void main(String[] args) 
	{
		int[] nums = {3, 6, 1, 0};
		System.out.println(dominantIndex(nums));
	}

	public static int dominantIndex(int[] nums) {
		
		if (nums.length == 1)
		{
			return 0;
		}
		
		int max = 0,maxIndex = -1;
		
		for(int i = 0; i < nums.length; i++)
		{
			max = Math.max(nums[i], max);
		}
		
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] != max && max < 2 * nums[i])
			{
				maxIndex = -1;
				break;
			}
			else if (max == nums[i])
			{
				maxIndex =  i;
			}
		}
		return maxIndex;
	}

}

/*

In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1.

Example 1:

Input: nums = [3, 6, 1, 0]
Output: 1
Explanation: 6 is the largest integer, and for every other number in the array x,
6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
 

Example 2:

Input: nums = [1, 2, 3, 4]
Output: -1
Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
 

Note:

nums will have a length in the range [1, 50].
Every nums[i] will be an integer in the range [0, 99].
 

   Hide Hint #1  
Scan through the array to find the unique largest element `m`, keeping track of it's index `maxIndex`. Scan through the array again. If we find some `x != m` with `m < 2*x`, we should return `-1`. Otherwise, we should return `maxIndex`.

*/