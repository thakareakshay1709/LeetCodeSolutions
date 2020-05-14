package leetcode.challenge.may20;

import java.util.Stack;

public class RemoveKDigits 
{
	
	public static void main(String[] args) 
	{
		String num = "10"; //1432219
		int k = 1;
		System.out.println(removeKdigits(num, k));
	
	}
	public static String removeKdigits(String num, int k) 
	{
		if(num.trim().length() == 0 || num.trim().length() == k)
		{
			return "0";
		}
		if(k == 0)
		{
			return num;
		}
		
		Stack<Character> removeGreaterDigits = new Stack();
		for(char c : num.toCharArray())
		{
			//System.out.println(c);
			while(!removeGreaterDigits.isEmpty() && k > 0 && removeGreaterDigits.peek() > c)
			{
				removeGreaterDigits.pop();
				k--;
				//System.out.println("St= "+removeGreaterDigits.peek()+"C="+c+" "+(removeGreaterDigits.peek() > c));0	
			}
			removeGreaterDigits.push(c);
		}
		
		for (int i = 0; i < k; i++) {
			removeGreaterDigits.pop();
		}
		
		StringBuilder backToString = new StringBuilder();
		while(!removeGreaterDigits.isEmpty())
		{
			backToString.append(removeGreaterDigits.pop());
		}
		backToString.reverse();
		
		while (backToString.length() > 1 && backToString.charAt(0)=='0')
		{
			backToString.deleteCharAt(0);
		}
		
        return backToString.toString();
    }
	
	
}


/*
 *Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.


Note:
The length of num is less than 10002 and will be gt k.
The given num does not contain any leading zero.
Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.

 *
 * 
*/