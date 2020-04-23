package leetcode.challange;

/**
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

Example 1:

Input: [5,7]
Output: 4
Example 2:

Input: [0,1]
Output: 0
 * @author akshaythakare
 *
 */
public class BitwiseANDofNumbersRange_Day23 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int m = 5, n = 7;
		
		System.out.println(rangeBitwiseAnd(m, n));
	}
	
	public static int rangeBitwiseAnd(int m, int n) 
	{
		while (n > m) 
		{
	          n = n & n - 1;
	          System.out.println(n);
	     }
	     return m & n;
    }

}
