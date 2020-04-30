package leetcode.challenge.april20;
/**
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
 * @author akshaythakare
 *
 */

public class DiameterOfBinaryTree_Day11 
{
	int diameter = 1;
	
	public int diameterOfBinaryTree(TreeNode root) 
	{
		digDown(root);
		
		return diameter-1;
	}
	
	private int digDown(TreeNode root)
	{
		if(root==null)
			return 0;
		
	    int left = digDown(root.left);
	    
	    int right = digDown(root.right);
	    
	    diameter = Math.max(diameter,1+left+right);
	    
	    return Math.max(left,right)+1;
	}

}
