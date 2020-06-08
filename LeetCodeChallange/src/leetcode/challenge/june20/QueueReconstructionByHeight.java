package leetcode.challenge.june20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstructionByHeight {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	
	public static int[][] reconstructQueue(int[][] people) 
	{
	    int[][] reconstructed = new int[people.length][];
	    
	    Arrays.sort(people, new Comparator<int[]>()
	    {
	        public int compare(int[] h1, int[] h2)
	        {
	            if(h1[0] != h2[0])
	            {
	                return h2[0]-h1[0];
	            }
	            else
	            {
	                return h1[1]-h2[1];
	            }
	        }
	    });
	 
	    ArrayList<int[]> list = new ArrayList<int[]>();
	 
	    for(int count=0; count < people.length; count++)
	    {
	        int[] array = people[count];
	        
	        list.add(array[1],array);
	    }
	 
	    for(int count=0; count < people.length; count++)
	    {
	    	reconstructed[count]=list.get(count);
	    }
	 
	    return reconstructed;
	}

}
