// Last updated: 8/14/2025, 3:43:39 PM
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
    class Bstpair{
        boolean isbst=true;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        int sum=0;
        int ans=0;

    }
    public int maxSumBST(TreeNode root) {
         return isvalid(root).ans;


        
    }
    public Bstpair isvalid(TreeNode root){
        if(root==null){
            return new Bstpair();
        }

        Bstpair lbp=isvalid(root.left);
        Bstpair rbp=isvalid(root.right);
        Bstpair sbp=new Bstpair();
        sbp.min=Math.min(root.val,Math.min(lbp.min,rbp.min));
        sbp.max=Math.max(root.val,Math.max(lbp.max,rbp.max));
        sbp.isbst=lbp.isbst && rbp.isbst && root.val>lbp.max && root.val<rbp.min;
        sbp.sum=lbp.sum+rbp.sum+root.val;
        if(sbp.isbst){
            sbp.ans=Math.max(lbp.ans,Math.max(rbp.ans,sbp.sum));
        }
        else{
            sbp.ans=(Math.max(lbp.ans,rbp.ans));
        }
        return sbp;

    }
}