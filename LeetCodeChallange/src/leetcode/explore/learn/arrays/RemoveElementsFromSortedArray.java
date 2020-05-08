package leetcode.explore.learn.arrays;

public class RemoveElementsFromSortedArray 
{

	public static void main(String[] args) 
	{
		int[] nums = {1,1,2};
		System.out.println(removeDuplicates(nums));
	}
	
	public static int removeDuplicates(int[] nums) 
	{
		int currPointer = 1, uniquePointer = 0,length = nums.length;
		if(length < 2)
		{
			return nums.length;
		}
		while (currPointer < nums.length)
		{
			if(nums[uniquePointer] != nums[currPointer])
			{
				uniquePointer++;
				nums[uniquePointer] = nums[currPointer];
				
			}
			currPointer++;
			
		}
		
		for (int i = 0; i <= uniquePointer; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		return ++uniquePointer;
    }

}
