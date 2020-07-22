package leetcode.explore.learn.arrayandstring;

public class TwoSumII {

	public static void main(String[] args) 
	{
		int[] numbers = {2,7,11,15};
		int target = 9;
		twoSum(numbers, target);
	}
	
	 public static int[] twoSum(int[] numbers, int target) 
	 {
		 
		 int pointer1 = 0, pointer2 = numbers.length - 1;
		 while(pointer1 < pointer2)
		 {
			 int sum = numbers[pointer1] + numbers[pointer2];
			 if (sum < target)
			 {
				 ++pointer1;
			 }
			 else if (sum > target)
			 {
				 pointer2--;
			 }
			 else
			 {
				return new int[] {pointer1+1, pointer2+1};
			 }
		 }
		 return null;
	 }

}
