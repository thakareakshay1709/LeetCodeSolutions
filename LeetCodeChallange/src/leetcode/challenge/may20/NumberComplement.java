package leetcode.challenge.may20;

/**
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

 

Example 1:

Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 

Example 2:

Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 

Note:

The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
 * 
 * 
 * @author akshaythakare
 *
 */
public class NumberComplement {

	public static void main(String[] args) 
	{
		int input = 12; //0011 -> 1100 -> 3
		
		
		System.out.println(findComplement(input));
		System.out.println(findComplement2(input));
	}
	
	public static int findComplement(int num) //beats 100% java submissions
	{
		if( num == 0 )
		{
			return 0;
		}
		else
		{
			int complement = ( (Integer.highestOneBit(num) - 1) << 1)+1;
	        return complement ^ num;
		}
        
    }
	public static int findComplement2(int num) 
	{
        int shift = 0;
        
        int temp = num;
        
        while(temp != 0)
        {
        	temp >>= 1;
        	shift ++;
        }
        return ~num & ((1 << shift) - 1);
    }

}
