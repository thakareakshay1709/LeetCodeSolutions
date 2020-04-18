package leetcode.challange;

/**
 * You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

direction can be 0 (for left shift) or 1 (for right shift). 
amount is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
Return the final string after all operations.

 

Example 1:

Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation: 
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"
Example 2:

Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
Output: "efgabcd"
Explanation:  
[1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
[1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
[0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
[1,3] means shift to right by 3. "abcdefg" -> "efgabcd"
 

Constraints:

1 <= s.length <= 100
s only contains lower case English letters.
1 <= shift.length <= 100
shift[i].length == 2
0 <= shift[i][0] <= 1
0 <= shift[i][1] <= 100
   Hide Hint #1  
Intuitively performing all shift operations is acceptable due to the constraints.
   Hide Hint #2  
You may notice that left shift cancels the right shift, so count the total left shift times (may be negative if the final result is right shift), and perform it once.
 * @author akshaythakare
 *
 */
public class PerformStringShiftsDay14 {

	public static void main(String[] args) 
	{
		String s = "abc"; 
		int[][] shift = {{0,1},{1,2},{1,3}};
		System.out.println(stringShift(s, shift));
		
	}
	public static String stringShift(String s, int[][] shift) 
	{
		if(s.length() <=1)
		{
			return s;
		}
		
		int left_shift = 0,right_shift = 0;
		String res = "";
		for (int i = 0; i < shift.length; i++) 
		{
			//System.out.println(shift[i][0]);
			if(shift[i][0] == 0)
			{
				left_shift ++;
			}
			else
			{
				right_shift ++;
			}
			
		}
		if(left_shift > right_shift)
		{
			left_shift = left_shift - right_shift;
			left_shift = left_shift % s.length();
			
			res = res + s.substring(left_shift, s.length() - left_shift);
			res = res + s.substring(0, left_shift);
		}
		else
		{
			right_shift = right_shift - left_shift;
			right_shift = right_shift % s.length();
			
			res = res + s.substring(s.length() - right_shift, right_shift);
			res = res + s.substring(0, s.length() - right_shift);
			
		}
		System.out.println("Left = "+left_shift+" Right = "+right_shift+" Res = "+res);
		
		return res;
        
    }

}
