package leetcode.challenge.april20;

/**
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

Example:

Input: 

1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0

Output: 4

 * @author akshaythakare
 *
 */
public class MaximalSquare_Day27 
{

	public static void main(String[] args) 
	{
		char[][] mat = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		
		System.out.println(maximalSquare(mat));
	}
	
	public static int maximalSquare(char[][] matrix) 
	{
        if (matrix == null || matrix.length == 0) 
        {
            return 0;
        }
         
        int rows = matrix.length;
        int cols = matrix[0].length;
         
        int[][] dp = new int[rows][cols];
         
        // Initialization
        for (int i = 0; i < cols; i++) 
        {
            dp[0][i] = matrix[0][i] - '0';
        }
         
        for (int i = 0; i < rows; i++) 
        {
            dp[i][0] = matrix[i][0] - '0';
        }
         
        for (int i = 1; i < rows; i++) 
        {
            for (int j = 1; j < cols; j++) 
            {
                if (matrix[i][j] == '1') 
                {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], 
                    dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
         
        int maxArea = 0;
        
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                maxArea = Math.max(maxArea, dp[i][j] * dp[i][j]);
            }
        }
         
        return maxArea;
    }

}
