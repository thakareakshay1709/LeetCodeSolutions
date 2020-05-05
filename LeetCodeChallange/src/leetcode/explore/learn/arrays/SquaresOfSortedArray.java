package leetcode.explore.learn.arrays;

/**
 * Given an array of integers A sorted in non-decreasing order, 
 * return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.

 * @author akshaythakare
 *
 */
public class SquaresOfSortedArray {

	public static void main(String[] args) 
	{
		int[] A = {-7,-3,2,3,11};
		int[] sortedsq = sortedSquares(A);
		for(int num : sortedsq)
		{
			System.out.print(num+" ");
		}
		

	}
	
	public static int[] sortedSquares(int[] A) 
	{
        int[] sortedSqArr = new int[A.length];
        
        for (int i=0; i <A.length;i++)
        {
        	//System.out.println(A[i]);
        	sortedSqArr[i] = A[i] * A[i];
        	
        }
        
        //int start = sortedSqArr[0], end = ;
        
        //Using swap method
        for (int i = 0; i < sortedSqArr.length; i++) 
        {
			for (int j = i; j < sortedSqArr.length; j++) 
			{
				if(sortedSqArr[j] < sortedSqArr[i])
				{
					int temp = sortedSqArr[j];
					sortedSqArr[j] = sortedSqArr[i];
					sortedSqArr[i] = temp;
				}
			}
		}
        
        return sortedSqArr;
    }

}
