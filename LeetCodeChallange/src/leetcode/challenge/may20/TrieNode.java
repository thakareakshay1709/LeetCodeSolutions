package leetcode.challenge.may20;

import java.util.HashMap;

public class TrieNode 
{
	char c;
    HashMap<Character, TrieNode> tchild = new HashMap<Character, TrieNode>();
    boolean branchNode;
 
    public TrieNode() {}
 
    public TrieNode(char c){
        this.c = c;
    }
}
