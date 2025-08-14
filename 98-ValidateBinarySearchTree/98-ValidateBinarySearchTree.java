// Last updated: 8/14/2025, 3:48:21 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class BSTPair{
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        boolean isbst=true;
    }
    public boolean isValidBST(TreeNode root) {
        BSTPair a=func(root);
        return a.isbst;


        
    }
    public BSTPair func(TreeNode root){
        if(root==null){
            return new BSTPair();
        }

        BSTPair lbp=func(root.left);
        BSTPair rbp=func(root.right);
        BSTPair sbp=new BSTPair();
        sbp.max=Math.max(root.val,Math.max(lbp.max,rbp.max));
        sbp.min=Math.min(root.val,Math.min(lbp.min,rbp.min));
        sbp.isbst=lbp.isbst && rbp.isbst && root.val>lbp.max && root.val<rbp.min;
        return sbp;


    }
}