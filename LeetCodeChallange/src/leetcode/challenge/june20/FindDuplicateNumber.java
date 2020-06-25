package leetcode.challenge.june20;

public class FindDuplicateNumber 
{

	public static void main(String[] args) 
	{
		int[] nums = {3,1,3,4,2};
		System.out.println(findDuplicate(nums));
	}
	public static int findDuplicate(int[] nums) 
	{
		int forward = 0, backward = nums.length - 1, duplicate = 0;
		
		while(forward <= backward)
		{
			if (nums[forward] == nums[backward])
			{
				duplicate = nums[forward];
				break;
			}
			else if (nums[forward] != nums[backward])
			{
				if(backward - forward > 1)
				{
					backward--;
				}
				else if((backward - forward) == 1)
				{
					forward++;
					backward = nums.length - 1;
				}
					
			}
		}
		
		return duplicate;
    }
}
