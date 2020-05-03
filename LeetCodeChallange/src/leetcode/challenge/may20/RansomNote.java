package leetcode.challenge.may20;

import java.util.HashMap;

import java.util.Map;

/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, 
 * 
 * write a function that will return true if the ransom note can be constructed from the magazines ; 
 * otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
"fffbfg"
"effjfggbffjdgbjjhhdegh"
 * @author akshaythakare
 *
 */
public class RansomNote {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));

	}
	
	public static boolean canConstruct(String ransomNote, String magazine) 
	{
		if(ransomNote.trim() == null || magazine.trim()== null)
		{
			return false;
		}
		else if (ransomNote.trim()== null)
		{
			return true;
		}
		else if (magazine.trim()== null)
		{
			return false;
		}
		
		Map<Character, Integer> frequency = new HashMap();
		for (char element : magazine.toCharArray()) 
		{
			if (frequency.containsKey(element))
			{
				frequency.put(element, frequency.get(element)+1);
			}
			else
			{
				frequency.put(element, 1);
			}
		}
		
//		for (int i = 0; i < frequency.size(); i++) 
//		{
//			System.out.println(frequency.values());
//		}
		for (char element : ransomNote.toCharArray())
		{
			if(frequency.containsKey(element))
			{
				if(frequency.get(element) > 1)
				{
					frequency.put(element, frequency.get(element)-1);
				}
				else
				{
					frequency.remove(element);
				}
			}
			else
			{
				return false;
			}
		}
		
		return true;
		
		
		
		
        
    }

}
