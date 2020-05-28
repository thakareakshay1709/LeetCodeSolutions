package leetcode.challenge.may20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency {

	public static void main(String[] args) 
	{
		String s = "tree";
		System.out.println(frequencySort(s));
	}


    public static String frequencySort(String s) 
    {
        StringBuilder freqs = new StringBuilder();
        if (s == null || s.length() == 0) 
        {
            return freqs.toString();
        }
        HashMap<Character, Integer> countFreq = new HashMap<>();
        for (char ch : s.toCharArray()) 
        {
            if (!countFreq.containsKey(ch)) 
            {
                countFreq.put(ch, 1);
            } 
            else 
            {
                countFreq.put(ch, countFreq.get(ch) + 1);
            }
        }
        
        
        List<Character> [] list = new List[s.length() + 1]; 
        
        for (char key : countFreq.keySet()) 
        {
        
            int count = countFreq.get(key);
            if (list[count] == null) 
            {
                list[count] = new ArrayList<Character>();
            }
            list[count].add(key);
        }
        
        for (int i = list.length-1; i >= 0; i--) 
        {
            if (list[i] != null) 
            {
                for (char ch : list[i]) 
                {
                
                    for (int j = 0; j < i; j++) 
                    {
                        freqs.append(ch);    
                    }
                }     
            }
        }
        return freqs.toString();
    }
}