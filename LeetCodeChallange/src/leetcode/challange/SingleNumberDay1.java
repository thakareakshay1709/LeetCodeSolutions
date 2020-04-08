package leetcode.challange;

import java.util.Arrays;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 * @author akshaythakare
 *
 */

public class SingleNumberDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,1};
		int op = singleNumber(arr);
		System.out.println("Not rep = "+op);
	}
	
	 public static int singleNumber(int[] nums) {
	     int notRepeatNum = 0;   
		  
			    boolean numvisited[] = new boolean[nums.length]; 
			      
			    Arrays.fill(numvisited, false); 
			  
			    // Traverse through array elements and 
			    // count frequencies 
			    for (int i = 0; i < nums.length; i++) { 
			  
			        // Skip this element if already processed 
			        if (numvisited[i] == true) 
			            continue; 
			  
			        // Count frequency 
			        int count = 1; 
			        for (int j = i + 1; j < nums.length; j++) { 
			            if (nums[i] == nums[j]) { 
			                numvisited[j] = true; 
			                count++; 
			            } 
			        } 
			        //System.out.println(nums[i] + " " + count); 
			        if (count == 1)
			        {
			        	notRepeatNum = nums[i];
			        }
			    } 
		 
	     return notRepeatNum;
	    }

}
