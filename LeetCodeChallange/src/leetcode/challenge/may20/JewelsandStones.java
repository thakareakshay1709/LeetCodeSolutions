package leetcode.challenge.may20;

import java.util.HashSet;
import java.util.Set;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
   Hide Hint #1  
For each stone, check if it is a jewel.

 * 
 * @author akshaythakare
 *
 */
public class JewelsandStones 
{
	public static void main(String[] arg)
	{
		String J = "aA", S="aAAbbbb";
		System.out.println(numJewelsInStones1(J, S));
		System.out.println(numJewelsInStones2(J, S));
	}
	
	//THis submission beats 18.34 % submissions
	private static int numJewelsInStones2(String J, String S) 
	{
		int jewelCount = 0;
        
        if(S.trim().length() == 0 || J.trim().length() == 0)
        {
        	return 0;
        }
        
        Set<Character> stonesJ = new HashSet<Character>();
        for (int i = 0; i < J.length(); i++) {
			stonesJ.add(J.charAt(i));
		}
        
        for (int i = 0; i < S.length(); i++) {
			if(stonesJ.contains(S.charAt(i)))
			{
				jewelCount++;
			}
		}
        
		return jewelCount;
	}
	
	//THis submission beats 8.5 % submissions
	public static int numJewelsInStones1(String J, String S) 
	{
        int jewelCount = 0;
        
        if(S.trim().length() == 0 || J.trim().length() == 0)
        {
        	return 0;
        }
        
        
        for (int i = 0; i < S.length(); i++) 
        {
        	for (int k = 0; k < J.length(); k++) 
        	{
        		if(J.charAt(k) == S.charAt(i))
                {
                	jewelCount++;
                	//System.out.println("hi");
                	break;
                }
			}
        	
		}
        
        return jewelCount;
    }
}
