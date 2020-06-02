package leetcode.challenge.may20;

public class EditDistance {

	public static void main(String[] args) 
	{
		String word1 = "horse", word2 = "ros";
		System.out.println(minDistance(word1, word2));
	}
	
	public static int minDistance(String word1, String word2) 
	{
		int word1_len = word1.length(), word2_len = word2.length();
	 
		// len1+1, len2+1, because finally return dp[len1][len2]
		int[][] dynProg = new int[word1_len + 1][word2_len + 1];
	 
		for (int count1 = 0; count1 <= word1_len; count1++) 
		{
			dynProg[count1][0] = count1;
		}
	 
		for (int count2 = 0; count2 <= word2_len; count2++) 
		{
			dynProg[0][count2] = count2;
		}
	 
		//iterate though, and check last char
		for (int count1 = 0; count1 < word1_len; count1++) 
		{
			char c1 = word1.charAt(count1);
			for (int count2 = 0; count2 < word2_len; count2++) 
			{
				char c2 = word2.charAt(count2);
	 
				//if last two chars equal
				if (c1 == c2) 
				{
					//update dp value for +1 length
					dynProg[count1 + 1][count2 + 1] = dynProg[count1][count2];
				} 
				else 
				{
					int rep = dynProg[count1][count2] + 1;
					int ins = dynProg[count1][count2 + 1] + 1;
					int del = dynProg[count1 + 1][count2] + 1;
	 
					int minimum = rep > ins ? ins : rep;
					minimum = del > minimum ? minimum : del;
					dynProg[count1 + 1][count2 + 1] = minimum;
				}
			}
		}
	 
		return dynProg[word1_len][word2_len];
	}

}


/*
 *Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character
Example 1:

Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
Example 2:

Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
 * */
 