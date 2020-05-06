package leetcode.challenge.may20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
 * @author akshaythakare
 *
 */

public class FirstUniqueCharacter 
{

	public static void main(String[] args) 
	{
		String s = "cc"; // "", "loveleetcode"
		System.out.println(firstUniqChar(s));
	}
	
//	 public int firstUniqChar(String s) {
//	        if (s == null || s.length() == 0) {
//	            return -1;
//	        }
//	        
//	        int[] charCounts = new int[26];
//	        
//	        for (int i = 0; i < s.length(); i++) {
//	            charCounts[s.charAt(i) - 'a']++;            
//	        }
//	        
//	        for (int i = 0; i < s.length(); i++) {
//	            if (charCounts[s.charAt(i) - 'a'] == 1) {
//	                return i;
//	            }
//	        }
//	        
//	        return -1;
//	    }
	
//	public static int firstUniqChar(String s) 
//	{
//		  for(int i = 0; i < s.length(); i++) 
//		  {
//		    char cur = s.charAt(i);
//		    boolean repeated = false;
//		    for(int j = 0; j < s.length(); j++) {
//		      if(i == j) 
//		      {
//		        continue;
//		      }
//		      if(cur == s.charAt(j)) 
//		      {
//		    	  repeated = true;
//		      }
//		    }
//		    if(!repeated) {
//		      return i;
//		    }
//		  }
//		  return -1;
//		}
	
	public static int firstUniqChar(String s) 
	{
        int uniqueIndex = 0;
        
        if(s == null || s.trim() == "" || s.isEmpty())
        {
        	return -1;
        }
        
        Map<Character, Integer> charArray = new HashMap();
        for (char anyLetter : s.toCharArray())
        {
        	if(!charArray.containsKey(anyLetter))
        	{
        		charArray.put(anyLetter, 1);
        	}
        	else
        	{
        		charArray.put(anyLetter, charArray.get(anyLetter)+1);
        	}
        }
        
        for (int i = 0; i < s.toCharArray().length; i++) 
        {
        	if(charArray.get(s.toCharArray()[i]) == 1)
        	{
        		//System.out.println(charArray.get(s.toCharArray()[i]));
        		uniqueIndex = i;
        		break;
        		//return i;
        		
        	}
        	else if (charArray.get(s.toCharArray()[i]) == 0)
        	{
        		uniqueIndex = -1;
        		break;
        		//return -1;
        	}
        	
		}
		return uniqueIndex;
        
//        for(Character c : charArray.keySet())
//        {
//        	System.out.println("{ "+c+" : "+charArray.get(c)+" }");
//        }
        
    }
}
