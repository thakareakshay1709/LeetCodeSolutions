package leetcode.challenge.june20;

public class SearchInsertPosition {

	public static void main(String[] args) 
	{
		int[] nums = {1,3,5,6};
		int target = 5;
		
		System.out.println(searchInsert(nums, target));
	}
	
	public static int searchInsert(int[] nums, int target) 
	{
        if (target > nums[nums.length-1])
        	return nums.length;
        
        int insertionPoint = 0, right = nums.length-1;
        while(right > insertionPoint)
        {
        	int middle = insertionPoint + (right - insertionPoint)/2;
        	if(target > nums[middle])
        	{
        		insertionPoint = middle + 1;
        	}
        	else
        	{
        		right = middle;
        	}
        }
        
        
        return insertionPoint;
    }

}
