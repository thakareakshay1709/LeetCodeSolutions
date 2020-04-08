package leetcode.challange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 * @author akshaythakare
 *
 */

public class GroupAnagramsDay5 {

	public static void main(String[] args) 
	{
		String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"}; 
		System.out.println(groupAnagrams(anagrams));
	}
	
	 public static List<List<String>> groupAnagrams(String[] strs) 
	 {
		 List<List<String>> group = new ArrayList<List<String>>();
		 
		    HashMap<String, ArrayList<String>> maps = new HashMap<String, ArrayList<String>>();
		    
		    for(String str: strs)
		    {
		        char[] arr = new char[20];
		        for(int i=0; i<str.length(); i++)
		        {
		            arr[str.charAt(i)-'a']++;
		        }
		        String ns = new String(arr);
		 
		        if(maps.containsKey(ns))
		        {
		            maps.get(ns).add(str);
		        }
		        else
		        {
		            ArrayList<String> all = new ArrayList<String>();
		            all.add(str);
		            maps.put(ns, all);
		        }
		    }
		 
		    group.addAll(maps.values());
		    return group;
		 
	 }

}
