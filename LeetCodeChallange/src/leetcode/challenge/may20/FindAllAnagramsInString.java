package leetcode.challenge.may20;

import java.util.ArrayList;
import java.util.List;

class FindAllAnagramsInString 
{
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> anaList = new ArrayList<>();
        if (s == null || s.length() < p.length() || s.length() == 0) {return anaList;}

        int[] hashp = new int[26];
        for (int i = 0; i < p.length(); i++) {hashp[p.charAt(i) - 'a']++;}
        
        int l = 0, r = 0, count = p.length();
        
        while (r < s.length())
        {
        	if(hashp[s.charAt(r++)-'a']-- >= 1)
        		count--;
        	
        	if(count == 0)
        		anaList.add(l);
        	
        	if(r-l == p.length() && hashp[s.charAt(l++)-'a']++ >=0)
        		count++;
        }
        
        return anaList;
    }

    public boolean isExact(int[] hashp, int[] hashs) 
    {
        for (int i = 0; i < hashp.length; i++) 
        {
            if (hashp[i] != hashs[i]) 
            {
                return false;
            }
        }
        
        return true;
    }
}
