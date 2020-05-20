package leetcode.explore.learn.arrays;

public class SortArrayByParity {

	public static void main(String[] args) 
	{
		int[] A = {6,5,3,1,2,4};
		A = sortArrayByParity(A);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	public static int[] sortArrayByParity(int[] A) 
	{
		if(A.length == 1)
		{
			return A;
		}
		int evenPointer = 0,temp;
		for (int i = 0; i < A.length; i++) 
		{
			if(A[i] % 2 == 0)
			{
				temp = A[evenPointer];
				A[evenPointer] = A[i];
				A[i]=temp;
				evenPointer++;
			}
		}
        return A;
    }
}
