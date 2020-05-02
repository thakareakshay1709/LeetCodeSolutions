package leetcode.challenge.april20;

import java.util.Stack;

public class ConstructBSTPreorderTraversal 
{

	public TreeNode bstFromPreorder (int[] preorder)
	{
		TreeNode root = new TreeNode(preorder[0]);
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		
		for(int i=1;i<preorder.length;i++)
		{
			TreeNode temp = null;
			while(!s.isEmpty() && preorder[i]>s.peek().val)
				temp = s.pop();
			if(temp !=null)
			{
				temp.right = new TreeNode(preorder[i]);
				s.push(temp.right);
					
			}
			else
			{
				temp = s.peek();
				temp.left = new TreeNode(preorder[i]);
				s.push(temp.left);
			}
			
		}
		return root;
	}
}
