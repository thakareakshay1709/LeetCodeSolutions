package leetcode.challenge.may20;

import java.util.HashMap;
import java.util.Map;

public class Trie 
{
    private TrieNode rNode;
 
    public Trie() {
    	rNode = new TrieNode();
    }
 
    // Inserts a word into the trie.
    public void insert(String word) 
    {
        HashMap<Character, TrieNode> childTrie = rNode.tchild;
 
        for(int i=0; i<word.length(); i++)
        {
            char ch = word.charAt(i);
            TrieNode newtrie;
            if(childTrie.containsKey(ch))
            {
            	newtrie = childTrie.get(ch);
            }
            else
            {
            	newtrie = new TrieNode(ch);
                childTrie.put(ch, newtrie);
            }
 
            childTrie = newtrie.tchild;
 
            //set leaf node
            if(i==word.length()-1)
            	newtrie.branchNode = true;    
        }
    }
 
    // Returns if the word is in the trie.
    public boolean search(String word) 
    {
        TrieNode newtrie = searchNode(word);
 
        if(newtrie != null && newtrie.branchNode) 
            return true;
        else
            return false;
    }
 
    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) 
    {
        if(searchNode(prefix) == null) 
            return false;
        else
            return true;
    }
 
    public TrieNode searchNode(String str)
    {
        Map<Character, TrieNode> trieChild = rNode.tchild; 
        TrieNode newtrie = null;
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(trieChild.containsKey(c))
            {
            	newtrie = trieChild.get(c);
                trieChild = newtrie.tchild;
            }
            else
            {
                return null;
            }
        }
 
        return newtrie;
    }
}