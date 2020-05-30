package leetcode.challenge.may20;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation 
{

	public static void main(String[] args) 
	{
		String s1 = "ab", s2 ="eidbaooo";
		System.out.println(checkInclusion(s1, s2));
	}
	
	
	public static boolean checkInclusion(String s1, String s2) 
	{
	    HashMap<Character, Integer> freqS1 = new HashMap<>();
	    for (int i = 0; i < s1.length(); i++) 
	    {
	        int feq = freqS1.getOrDefault(s1.charAt(i), 0);
	        freqS1.put(s1.charAt(i), feq + 1);
	    }
	 
	    HashMap<Character, Integer> freqS2 = new HashMap<>();
	    int i = 0;
	    for (int j = 0; j < s2.length(); j++) {
	        if (!freqS1.containsKey(s2.charAt(j))) {
	            i = j + 1;
	            freqS2.clear(); //clear counter
	            continue;
	        }
	 
	        int count = freqS2.getOrDefault(s2.charAt(j), 0);
	        
	        if (count == 0 || count < freqS1.get(s2.charAt(j))) 
	        {
	        	freqS2.put(s2.charAt(j), count + 1);
	 
	            if (j - i + 1 == s1.length()) 
	            {
	                return true;
	            }
	        } else 
	        {
	            while (i < j) 
	            {
	                if (s2.charAt(i) == s2.charAt(j)) 
	                {
	                    i++;
	                    break;
	                }
	 
	                freqS2.put(s2.charAt(i), freqS2.get(s2.charAt(i)) - 1);
	                i++;
	            }
	        }
	    }
	 
	    return false;
	}
	
	public static boolean checkInclusion2(String s1, String s2) 
	{
		Map<Character, Integer> freqS1 = new HashMap();
		Map<Character, Integer> freqS2 = new HashMap();
		
		if (s1.trim() == "")
			return true;
		
		for(char c : s2.toCharArray())
		{
			if(freqS1.containsKey(c))
			{
				freqS1.put(c, freqS1.get(c)+1);
			}
			else
			{
				freqS1.put(c, 1);
			}
		}
		
		for(char c : s2.toCharArray())
		{
			if(freqS2.containsKey(c))
			{
				freqS2.put(c, freqS2.get(c)+1);
			}
			else
			{
				freqS2.put(c, 1);
			}
		}
		
		for (char c : freqS1.keySet())
		{
			if(freqS1.get(c) != freqS2.get(c))
			{
				return false;
			}
		}
		
        return true;
    }

}
