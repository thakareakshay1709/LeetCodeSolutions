package leetcode.explore.learn.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInArray {

	public static void main(String[] args) 
	{
		int[] nums = {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(nums);
	}
	public static List<Integer> findDisappearedNumbers(int[] nums) 
	{
		List<Integer> disappearedArray = new ArrayList<>();
		Set<Integer> rangeSet = new HashSet<>();
		Set<Integer> numSet = new HashSet<>();
		int arrayLen = nums.length;
		for (int i = 1; i <= arrayLen; i++) {
			rangeSet.add(i);
		}
		for (int num : nums) {
			numSet.add(num);
		}
		
		for (int disappear : rangeSet)
		{
			if(!numSet.contains(disappear))
			{
				disappearedArray.add(disappear);
			}
		}
		for (int i = 0; i < disappearedArray.size(); i++)
		{
			System.out.print(disappearedArray.get(i)+" ");
		}
		return disappearedArray;
    }

}
