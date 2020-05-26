package leetcode.challenge.may20;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {

	public static void main(String[] args) 
	{

	}
	
	  public int[][] intervalIntersection(int[][] A, int[][] B) 
	    {
	        List<int []> output = new ArrayList<>();
	        int i =0, j=0;
	        while(i < A.length && j < B.length)
	        {
	            int[] a = A[i], b = B[j];
	            
	            if(a[1] < b[0])
	                i++;
	            
	            else if(b[1] < a[0])
	                j++;
	            
	            else
	            {
	                output.add(new int[]{Math.max(a[0],b[0]), Math.min(a[1],b[1])});
	                
	                if(a[1] < b[1])
	                    i++;
	                
	                else if(a[1] >= b[1])
	                    j++;
	            }
	        }
	        return output.toArray(new int[output.size()][]);
	    }

}
