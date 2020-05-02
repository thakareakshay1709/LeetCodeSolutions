package leetcode.challenge.april20;
//package leetcode.challange;
//
//import java.util.List;
//
//public class LeftMostColumn_Day21 
//{
//	public int leftMostColumnWithOne(BinaryMatrix binaryMatrix)
//	{
//	    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) 
//	    {
//	        List<Integer> dim = binaryMatrix.dimensions();
//	        int rows = dim.get(0);
//	        int columns = dim.get(1);
//	        
//	        if(rows == 0 || columns == 0)
//	        {
//	            return -1;
//	        }
//	        
//	        int result = -1;
//	        int r = 0, c = columns -1;
//	        while(r < rows && c >=0)
//	        {
//	            if(binaryMatrix.get(r,c) ==1)
//	            {
//	                result = c;
//	                c--;
//	            }
//	            else
//	            {
//	                r++;
//	            }
//	        }
//	        return result;
//	    }
//	}
//}
