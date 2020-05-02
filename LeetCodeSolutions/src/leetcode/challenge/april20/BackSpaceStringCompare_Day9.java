package leetcode.challenge.april20;

/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
Follow up:

Can you solve it in O(N) time and O(1) space?
 * @param args
 */

		

public class BackSpaceStringCompare_Day9 {

	public static void main(String[] args) 
	{
		String S = "a##c", T = "#a#c";
	
		System.out.println(backspaceCompare(S, T));
	}
	
	public static boolean backspaceCompare(String S, String T) 
    {
		char backSpace = '#';
		String replaceS;
		String replaceT;
		
		while(S.length() > 0 && S.contains(String.valueOf(backSpace)))
		{
			
			if(S.indexOf(backSpace)==0)
			{
				//S = S.replace(String.valueOf(S.charAt(0)),"").trim();
				S = S.substring(1, S.length());
			}
			else
			{
				replaceS = String.valueOf(S.charAt(S.indexOf(backSpace) - 1))  +  String.valueOf(S.charAt(S.indexOf(backSpace)));
				S = S.replace(replaceS, "").trim();
			}
					
			
		}
		
		while(T.length() > 0 && T.contains(String.valueOf(backSpace)))
		{
			if(T.indexOf(backSpace)==0)
			{
				T = T.substring(1, T.length());
				//T = T.replace(String.valueOf(T.charAt(0)), "").trim();
			}
			else
			{
				replaceT = String.valueOf(T.charAt(T.indexOf(backSpace) - 1))  +  String.valueOf(T.charAt(T.indexOf(backSpace)));
				T = T.replace(replaceT, "").trim();
			}
			
		}
		System.out.println("S="+S+" ,T="+T);
        return S.equals(T);
    }

}
