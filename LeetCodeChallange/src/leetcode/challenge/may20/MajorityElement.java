package leetcode.challenge.may20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 * @author akshaythakare
 *
 */
public class MajorityElement {

	public static void main(String[] args) 
	{
		int[] nums = {3,3,4};
		System.out.println(majorityElement(nums));
		System.out.println(majorityElement2(nums));
	}
	private static int majorityElement2(int[] nums) 
	{
		if(nums.length == 1)
        {
        	return nums[0];
        }
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	public static int majorityElement(int[] nums) 
	{
        int majorityElement = 0; 
        float halfLen = (float)nums.length/2;
        
        //System.out.println(nums.length/2);
        Map<Integer, Integer> majorityTable = new HashMap();
        
        if(nums.length == 1)
        {
        	return nums[0];
        }
        
        for(Integer everyNum : nums)
        {
        	if(majorityTable.containsKey(everyNum))
        	{
        		majorityTable.put(everyNum, majorityTable.get(everyNum)+1);
        	}
        	else
        	{
        		majorityTable.put(everyNum, 1);
        	}
        }
        
        for(Integer num : majorityTable.keySet())
        {
        	
        	//System.out.println(num+" "+majorityTable.get(num)+" Half="+halfLen);
        	if(majorityTable.get(num) >= halfLen)
        	{
        		majorityElement = num;
        	}
        	
        }
        
        return majorityElement;
    }

}
