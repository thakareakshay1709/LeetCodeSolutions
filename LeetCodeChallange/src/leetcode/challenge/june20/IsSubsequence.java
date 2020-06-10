package leetcode.challenge.june20;

import java.util.HashMap;

public class IsSubsequence {

	public static void main(String[] args) 
	{
		String s = "abc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
		
	}
	public static boolean isSubsequence(String s, String t) 
	{
		if(s.length()==0)
	        return true;
	 
	    int sCount = 0, tCount = 0;    
	    while(sCount < s.length() && tCount<t.length())
	    {
	        if(s.charAt(sCount) == t.charAt(tCount))
	        {
	        	sCount++;
	        }
	        tCount++;
	        if(sCount == s.length())
	            return true;
	    }
	 
	    return false;
    }

}
