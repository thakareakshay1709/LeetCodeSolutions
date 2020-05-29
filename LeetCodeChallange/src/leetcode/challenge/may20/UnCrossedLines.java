package leetcode.challenge.may20;

public class UnCrossedLines {

	public static void main(String[] args) 
	{
		int[] A = {1,4,2}, B = {1,2,4};
		System.out.println(maxUncrossedLines(A, B));
	}
	
	 public static int maxUncrossedLines(int[] A, int[] B) 
	 {
		 int lengthA = A.length,lengthB = B.length;
		 
		 int[][] dynProg = new int[lengthA + 1][lengthB + 1];
		 for (int i = 1; i <= lengthA; i++)
		 {
			 for (int j = 1; j <= lengthB; j++)
			 {
				 if (A[i - 1] == B[j - 1])
				 {
					 dynProg[i][j] = 1 + dynProg[i - 1][j - 1];
				 } 
				 else 
				 {
					 dynProg[i][j] = Math.max(dynProg[i - 1][j], dynProg[i][j - 1]);
				 }
			 }
		 }
	        return dynProg[lengthA][lengthB];
	 }

}
