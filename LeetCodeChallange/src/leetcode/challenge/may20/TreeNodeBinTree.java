package leetcode.challenge.may20;

public class TreeNodeBinTree 
{
	/**
	 * Definition for a binary tree node.
	 */  
	int val;
	TreeNodeBinTree left;
	TreeNodeBinTree right;
	TreeNodeBinTree() {}
	TreeNodeBinTree(int val) { this.val = val; }
	TreeNodeBinTree(int val, TreeNodeBinTree left, TreeNodeBinTree right) 
	{
		this.val = val;
		this.left = left;
		this.right = right;
	}

}
