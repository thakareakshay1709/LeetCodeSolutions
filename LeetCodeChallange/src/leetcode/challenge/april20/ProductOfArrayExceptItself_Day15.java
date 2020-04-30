package leetcode.challenge.april20;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 * @author akshaythakare
 *
 */
public class ProductOfArrayExceptItself_Day15 {

	public static void main(String[] args) 
	{
		int[] nums = {1,2,3,4};
		
		
		productExceptSelf1(nums);
		System.out.println();
		productExceptSelf2(nums);
	}
	
	public static int[] productExceptSelf1(int[] nums) 
	{
        int[] output = new int[nums.length];
        int opElement = 1;
        
        if(nums.length <= 1)
        	return nums;
        
        for (int i = 0; i < nums.length; i++) {
			
        	opElement = (nums[i] * opElement);
        	
		}
        
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == 0)
        	{
        		output[++i] = 0;
        	}
        	else
        	{
        		output[i] = opElement / nums[i];
        	}
        	
		}
        //System.out.println(opElement+" "+output.length);
        
        for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+" ");
		}
        return output;
    }
	
	public static int[] productExceptSelf2(int[] nums)
	{
		int[] output = new int[nums.length];
		 
		output[nums.length-1]=1;
	    for(int i=nums.length-2; i>=0; i--){
	    	output[i]=output[i+1]*nums[i+1];
	    }
	 
	    int left=1;
	    for(int i=0; i<nums.length; i++){
	    	output[i]=output[i]*left;
	        left = left*nums[i];
	    }
	 
	    for (int j = 0; j < output.length; j++) {
	    	System.out.print(output[j]+" ");
		}
	    
	    return output;
	}
	
	
	

}
