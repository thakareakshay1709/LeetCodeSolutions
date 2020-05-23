package leetcode.challenge.may20;

public class MaximumSumCircularSubarray {

	public static void main(String[] args) 
	{
		int[] A= {5,-3,5};
		//System.out.println(maxSubarraySumCircular(A));
		System.out.println(maxSubarraySumCircular2(A));
	}
	
	public static  int maxSubarraySumCircular2(int[] A) {
        int grandTotal = getMax(A);
        int getAllSum = 0;
        
        for(int i=0; i < A.length; i++) 
        {
        	getAllSum +=A[i];
        	
            A[i] *= -1;
        }
        
        getAllSum += getMax(A);
        
        if(Math.abs(getAllSum) < Math.abs(grandTotal))
        {
        	return grandTotal;
        }
        else
        {
        	return getAllSum;
        }
    }


    private static int getMax(int[] A)
    {
        int localTotal=A[0];
        
        int grandTotal =A[0];
        
        for(int i=1; i<A.length; i++) 
        {
        	localTotal = Math.max(A[i], localTotal + A[i]);
            grandTotal =Math.max(grandTotal, localTotal);
        }
        
        return grandTotal;
    }
	
	
	
	
	
	public static int maxSubarraySumCircular(int[] A) 
	{
		/**
		 * int grandTotal = kadane(A);
        int wrap = 0;
        
        for(int i=0; i < A.length; i++) {
            wrap = wrap+A[i];
            A[i] *= -1;
        }
        
        wrap = wrap + kadane(A);
        
        return Math.abs(wrap) < Math.abs(grandTotal) ? grandTotal : wrap;
		 */
		int grandTotal = A[0];
		int localTotal = A[0];
		
		for(int i=1; i<A.length; i++) 
        {
			localTotal = Math.max(A[i], localTotal + A[i]);
			
			grandTotal =Math.max(grandTotal, localTotal);
        }
		
        int getAllSum = 0;
        
        for(int i=0; i < A.length; i++) 
        {
        	getAllSum = getAllSum+A[i];
            A[i] *=-1;
        }
        
        getAllSum += grandTotal;
        
        if(Math.abs(getAllSum) < Math.abs(grandTotal))
        {
        	return grandTotal;
        }
        else
        {
        	return getAllSum;
        }
        
    }
	

}
