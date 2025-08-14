// Last updated: 8/14/2025, 3:48:08 PM
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
    class balance{
        boolean isbalance=true;
        int ht=-1;
    }
    public boolean isBalanced(TreeNode root) {
        balance a=func(root);
        return a.isbalance;
        
    }
    public  balance func(TreeNode root){
        if(root==null){
            balance nn=new balance();
            return nn;
        }

        balance ldp=func(root.left);
        balance rdp=func(root.right);
        balance sdp=new balance();
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        boolean f=true;
        if(Math.abs(ldp.ht-rdp.ht)>1){
            f=false;
        }
        sdp.isbalance=ldp.isbalance && rdp.isbalance && f;
        return sdp;


        

    }
}