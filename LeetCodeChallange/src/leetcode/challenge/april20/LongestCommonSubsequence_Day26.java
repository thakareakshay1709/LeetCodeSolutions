package leetcode.challange;

/**
 * Given two strings text1 and text2, return the length of their longest common subsequence.

A subsequence of a string is a new string generated from the original string with some characters(can be none) deleted without changing the relative order of the remaining characters. (eg, "ace" is a subsequence of "abcde" while "aec" is not). A common subsequence of two strings is a subsequence that is common to both strings.

 

If there is no common subsequence, return 0.

 

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:

Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.
 

Constraints:

1 <= text1.length <= 1000
1 <= text2.length <= 1000
The input strings consist of lowercase English characters only.
   Hide Hint #1  
Try dynamic programming. DP[i][j] represents the longest common subsequence of text1[0 ... i] & text2[0 ... j].
   Hide Hint #2  
DP[i][j] = DP[i - 1][j - 1] + 1 , if text1[i] == text2[j] DP[i][j] = max(DP[i - 1][j], DP[i][j - 1]) , otherwise
 * @author akshaythakare
 *
 */
public class LongestCommonSubsequence_Day26 {

	public static void main(String[] args) 
	{
		String text1 = "abcde", text2 = "ace";
		
		System.out.println(getLongestCommonSubsequence(text1, text2));
	}
	
	public static int getLongestCommonSubsequence(String text1, String text2)
	{
		int first = text1.length();
		
		int second = text2.length();
		
		int[][] dp = new int[first+1][second+1];
	 
		for(int i=0; i<=first; i++)
		{
			for(int j=0; j<=second; j++)
			{
				if(i==0 || j==0)
				{
					dp[i][j]=0;
				}
				else if(text1.charAt(i-1) == text2.charAt(j-1))
				{
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else
				{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
	 
		return dp[first][second];
	}

}
