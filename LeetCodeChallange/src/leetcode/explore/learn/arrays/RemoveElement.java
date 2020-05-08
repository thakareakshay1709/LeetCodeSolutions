package leetcode.explore.learn.arrays;

public class RemoveElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] nums = {0,4,4,0,4,4,4,0,2};
		int val = 4;
		//System.out.println(removeElement(nums, val));//0 2 0 0 4 4 5
		System.out.println(removeElement2(nums, val));//0 4 4 0 4 4 4 0 2 4

	}
	public static int removeElement(int[] nums, int val) 
	{
		int countVal = 0, length = nums.length,temp;

		//Case where array contains value at last position
		while (length > 0 && nums[length-1] == val)
		{
			length--;
			countVal++;
		}
		
		//Where empty array
		if(nums.length == 0 || length == 0)
		{
			return 0;
		}
		
		for (int i = 0; i < length; i++) 
		{
			if(nums[i] == val)
			{
				temp = nums[i];
				nums[i] = nums[length-1];
				nums[length-1] = temp;
				length--;
				countVal++;
			}
			System.out.print(nums[i]+" ");
		}
		
        return (nums.length - countVal);
    }
	
	//Second solution
	
	public static int removeElement2(int[] nums, int val) 
	{
	    int count=0,i=0;
	    while(i < nums.length)
	    {
	        if(nums[i] != val)
	        {
	        	nums[count] = nums[i];
	        	count++; 
	        }
	        System.out.print(nums[i]+" ");
	        i++;
	    }
	 
	    return count;
	}

}
