package leetcode.explore.learn.arrayandstring;


import java.util.Arrays;

public class ArrayPartitionI {

	public static void main(String[] args) 
	{
		int[] nums = {1,4,3,2};
		System.out.println(arrayPairSum(nums));
	}
	public static int arrayPairSum(int[] nums) 
	{
		int output = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i= i+2) {
			output = output + nums[i];
		}
		return output;
    }

}
