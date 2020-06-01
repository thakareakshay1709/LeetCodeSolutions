package leetcode.explore.learn.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ThirdMaximumNumber 
{

	public static void main(String[] args) 
	{
		int[] nums = {2, 2, 3, 1};
		System.out.println(thirdMax(nums));
	}
	public static int thirdMax(int[] nums) 
	{
        
        if (nums.length == 1)
        	return nums[0];
        // Setting unique elements in array
        nums = IntStream.of(nums).distinct().toArray();
        Arrays.sort(nums);
        //Printing sorted array
        
        for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
        
        if (nums.length <=2)
        {
        	return nums[nums.length - 1];
        }
        else
        {
        	
        	return nums[nums.length - 3];
        }
        
        
    }
}




/*
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
*/