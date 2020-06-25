package leetcode.explore.learn.arrayandstring;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) 
	{
		int s = 7;
		int[] nums = {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(s, nums));
		System.out.println(min1(s, nums));
	}
	public static int minSubArrayLen(int s, int[] nums) 
	{
        int contArray = 0, minLen = 10, pointer1 = 0, pointer2 = 1;
        while (pointer2 < nums.length - 1 && pointer1 < pointer2)
        {
        	if(nums[pointer1] + nums[pointer2] <=  s)
        	{
        		pointer2++;
        		contArray++;
        		minLen = Math.min(contArray, minLen);
        		if (nums[pointer1] + nums[pointer2] ==  s)
        			break;
        	}
        	else
        	{
        		pointer1 = pointer2;
        		pointer2 = pointer1+1;
        	}
        }
        
        
        return contArray;
    }
	public static int min1(int s, int[] nums)
	{
	    int n = nums.length;
	    int ans = 9999999;
	    int left = 0;
	    int sum = 0;
	    for (int i = 0; i < n; i++) {
	        sum += nums[i];
	        while (sum >= s) {
	            ans = Math.min(ans, i + 1 - left);
	            sum -= nums[left++];
	        }
	    }
	    return (ans != 9999999) ? ans : 0;
	}

}
