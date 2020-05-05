package leetcode.explore.learn.arrays;

public class NumberOfEvenDigits {

	public static void main(String[] args) 
	{
		int[] nums = {555,901,482,1771};
		System.out.println(findNumbers(nums));
	}
	public static int findNumbers(int[] nums) 
	{
		int evenDigits = 0;
		for (int n : nums)
		{
			//System.out.println(n)
			if(checkNumOfDigit(n))
			{
				evenDigits++;
			}
		}
		return evenDigits;
    }
	private static boolean checkNumOfDigit(int n) 
	{
		int count = 0;
		
		while( n > 0)
		{
			n = n / 10;
			count++;
		}
		if(count % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
