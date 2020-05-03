package leetcode.explore.learn.arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) 
	{
		int[] nums = {0,1,1,1,0,1,0,1,0,1,1,0};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) 
	{
        int maxConsecutive = 0, countOnes = 0;
        for (int i = 0; i < nums.length; i++) 
        {	
				if(nums[i] == 1)
				{
					countOnes++;
					maxConsecutive = Math.max(maxConsecutive, countOnes);
					
				}
				else
				{
					countOnes = 0;
				}
			
		}
        return maxConsecutive;
    }

}
