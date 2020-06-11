package leetcode.challenge.june20;

public class PowerOfTwo {

	public static void main(String[] args) 
	{
		int n = 214;
		System.out.println(isPowerOfTwo(n));
	}
	public static boolean isPowerOfTwo(int n) 
	{
		return n > 0 && n == Math.pow(2, Math.round(Math.log(n)/Math.log(2)));
    }

}
