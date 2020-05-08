package leetcode.challenge.may20;

import java.util.concurrent.atomic.AtomicInteger;

public class CousinsInBinaryTree 
{

	public boolean isCousins(TreeNodeBinTree root, int x, int y) 
	{
		AtomicInteger parentX = new AtomicInteger();
		AtomicInteger parentY = new AtomicInteger();
		AtomicInteger levelX = new AtomicInteger(-1);
		AtomicInteger levelY = new AtomicInteger(-1);
		
		evaluteDepth_and_ParentLevel(root, x, y, 0, levelX, levelY, parentX, parentY);
		
		return (levelX.get() == levelY.get() && parentX.get() != parentY.get());
        
    }

	private void evaluteDepth_and_ParentLevel(TreeNodeBinTree root, int x, int y, int level, AtomicInteger levelX,
			AtomicInteger levelY, AtomicInteger parentX, AtomicInteger parentY) {
		// TODO Auto-generated method stub
		if(root == null )
			return;
		
		if(root.left != null)
		{
			if(root.left.val == x)
			{
				parentX.set(root.val);
				levelX.set(level + 1);
			}
			else if (root.left.val == y)
			{
				parentY.set(root.val);
				levelY.set(level + 1);
			}
		}
		
		if(root.right != null)
		{
			if(root.right.val == x)
			{
				parentX.set(root.val);
				levelX.set(level + 1);
			}
			else if (root.right.val == y)
			{
				parentY.set(root.val);
				levelY.set(level + 1);
			}
		}
		//If we did not find the level
		if(levelX.get() != -1 && levelY.get() != -1)
		{
			return;
		}
		//If did not find the value of X and Y, recall method
		evaluteDepth_and_ParentLevel(root.left,x,y,level+1,levelX, levelY, parentX, parentY);
		
		evaluteDepth_and_ParentLevel(root.right,x,y,level+1,levelX, levelY, parentX, parentY);
		
		
	}
}
