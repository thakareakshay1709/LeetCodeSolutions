package leetcode.challenge.may20;

import java.util.Arrays;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int singleNonDuplicate(int[] nums) 
	{
        int notRepeatNum = 0;   
	  
		boolean numvisited[] = new boolean[nums.length]; 
		      
		Arrays.fill(numvisited, false); 
		  
		// Traverse through array elements and 
		// count frequencies 
		for (int i = 0; i < nums.length; i++) 
		{ 
			
			// Skip this element if already processed 
			if (numvisited[i] == true) 
				continue; 
		  
			// Count frequency 
			int count = 1; 
			for (int j = i + 1; j < nums.length; j++) 
			{ 
				if (nums[i] == nums[j]) 
				{ 
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
