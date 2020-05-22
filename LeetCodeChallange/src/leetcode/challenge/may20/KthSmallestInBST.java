package leetcode.challenge.may20;

import java.util.Stack;

public class KthSmallestInBST 
{

	public static int kthSmallest(TreeNode root, int k) 
	{
		Stack<TreeNode> process = new Stack<TreeNode>();
		 
	    TreeNode init = root;
	    int out = 0;
	 
	    while(! process.isEmpty() || init != null)
	    {
	        if(init != null)
	        {
	        	process.push(init);
	            
	            init = init.left;
	        }
	        else
	        {
	            TreeNode node = process.pop();
	            k = k - 1;
	            if(k == 0) {out = node.val;}
	            init = node.right;
	        }
	    }
	 
	    return out;
        
    }
}
