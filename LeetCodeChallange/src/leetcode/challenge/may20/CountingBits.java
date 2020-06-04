package leetcode.challenge.may20;

public class CountingBits {

	public static void main(String[] args) 
	{
		int num = 2;
		System.out.println(countBits(num));
	}
	
	public static int[] countBits(int num) 
	{
        int[] result = new int[num+1];
        for (int count = 1; count <= num; ++count) 
        {
        	result[count] = result[count>>1] + count%2;
		}
        
        return result;
    }

}
