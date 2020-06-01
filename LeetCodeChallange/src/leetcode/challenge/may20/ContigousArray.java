package leetcode.challenge.may20;

import java.util.HashMap;

public class ContigousArray {

	public static void main(String[] args) 
	{


	}
	
	   public int findMaxLength(int[] nums) 
	    {
	        HashMap<Integer, Integer> count = new HashMap<>();
	        
	        int s = 0;
	        
	        int maxLen = 0;
	        
	        count.put(0, -1);
	        
	        for(int i = 0;i < nums.length;++i) 
	        {
	            if(nums[i] == 0) 
	            {
	                s += -1;
	            } 
	            else 
	            {
	                s += 1;
	            }
	            
	            if(count.containsKey(s)) 
	            {
	            	maxLen = Math.max(maxLen, i - count.get(s));       
	            } 
	            else 
	            {
	                count.put(s, i);
	            }
	        }
	        
	        return maxLen;
	    }

}
