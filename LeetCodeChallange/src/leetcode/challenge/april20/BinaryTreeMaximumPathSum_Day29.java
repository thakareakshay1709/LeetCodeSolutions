package leetcode.challenge.april20;

/**
 * Given a non-empty binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

Example 1:

Input: [1,2,3]

       1
      / \
     2   3

Output: 6
Example 2:

Input: [-10,9,20,null,null,15,7]

   -10
   / \
  9  20
    /  \
   15   7

Output: 42
 * @author akshaythakare
 *
 */
public class BinaryTreeMaximumPathSum_Day29 
{

	public int maxPathSum(TreeNode_Day29 root) 
	{
		int max[] = new int[1];
		
		max[0] = Integer.MIN_VALUE;
		
		calculateSum(root, max);
		
		return max[0];
	}
	 
	public int calculateSum(TreeNode_Day29 root, int[] max) 
	{
		if (root == null)
			return 0;
	 
		int left = calculateSum(root.left, max);
		int right = calculateSum(root.right, max);
	 
		int current = Math.max(root.val, Math.max(root.val + left, root.val + right));
	 
		max[0] = Math.max(max[0], Math.max(current, left + root.val + right));
	 
		return current;
	}
}
