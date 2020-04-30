package leetcode.challenge.april20;

import java.util.HashSet;

/*
 * Problem Statement -
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 * */
public class HappyNumberDay2 {

	
	
	public static void main(String[] args) 
	{
		int n = 7;
		
		System.out.println(isHappy1(n));
		System.out.println(isHappy2(n));
	}
	
	
	public static boolean isHappy1(int n) {
	    HashSet<Integer> set = new HashSet<Integer>();
	 
	    while(!set.contains(n)){
	        set.add(n);
	        n = getTotal(n);
	        if(n==1)
	            return true;
	    }
	 
	    return false;
	}
	 
	public static int getTotal(int num){
	    int total = 0;
	    while(num > 0)
	    {
	        total+= ( num % 10 ) * ( num % 10 );
	        num = num / 10;
	    } 
	    return total;    
	}
 

	
	public static boolean isHappy2(int n) 
	{
		boolean happy = false;
		int sum = 0,rem,counter = 0;
		while (n > 0)
		{
			rem = n % 10;
			sum = sum + (rem * rem);
			n = n / 10;	
			
			counter++;
			System.out.println("n="+n+" rem="+rem+" sum="+sum+" counter="+counter);
		}
		

		try
		{
			if(sum != 1 && !happy && counter <= 10)
			{
				
				happy = isHappy2(sum);
			}
			else if (sum == 1)
			{
				//System.out.println("Yay");
				happy = true;
			}
		}
		catch(StackOverflowError t) {
			return false;
		}
		return happy;
    }

}
