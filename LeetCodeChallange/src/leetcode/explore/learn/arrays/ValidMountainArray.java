package leetcode.explore.learn.arrays;



public class ValidMountainArray {

	public static void main(String[] args) 
	{
		int[] A = {0,3,2,1};
		System.out.println(validMountainArray(A));
	}
	public static boolean validMountainArray(int[] A) 
	{
		if(A.length < 3)
		{
			return false;
		}
		
		 int up = 0;
	     int down = A.length - 1;
	     int count = A.length - 1;
	     while (up + 1 < count && A[up] < A[up+1]) 
	     {
	    	 up++;
	     }   
	     while (down > 0 && A[down] < A[down-1]) 
	     {
	    	 down--;
	     }   
	     return up > 0 && up == down && down < count;
    }

}
