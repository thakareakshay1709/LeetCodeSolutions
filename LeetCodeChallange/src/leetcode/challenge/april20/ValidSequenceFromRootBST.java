package leetcode.challenge.april20;

public class ValidSequenceFromRootBST {

    public boolean isValidSequence(TreeNode_Day30 root, int[] arr) 
    {
        if (root == null)
            return arr.length == 0;
        
        return checkValid(root,arr,0);
    }
    
    boolean checkValid(TreeNode_Day30 rt, int[] ar, int index)
    {
        if(rt.val != ar[index])
            return false;
        if(index == ar.length -1)
            return rt.left == null && rt.right == null;
        return ((rt.left != null && checkValid(rt.left, ar, index+1)) || (rt.right != null && checkValid(rt.right, ar, index+1)));
    }
}
