package leetcode.challenge.may20;

/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true
Example 2:

Input: 14
Output: false
 * @author akshaythakare
 *
 */
public class ValidPerfectSquare 
{

	public static void main(String[] args) 
	{
		int num = 16;
		System.out.println(isPerfectSquare(num));
	}

	private static boolean isPerfectSquare(int num) 
	{
		if(num < 1)
		{
			return false;
		}
		else if (num == 1)
		{
			return true;
		}
		
		for (int i = 1; i < num; i++) 
		{
			if(i * i == num)
				return true;
		}
		return false;
	}

}
