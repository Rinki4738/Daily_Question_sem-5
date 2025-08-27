// Last updated: 8/27/2025, 9:30:42 PM
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
    boolean ans=true;
    public boolean isUnivalTree(TreeNode root) {
        int val=root.val;
        func(root,val);
        return ans;
       
    }
    public void func(TreeNode root,int val){
        if(root==null){
            return;
        }
        if(root.val!=val){
            ans=false;
            return;
        }
        func(root.left,val);
        func(root.right,val);

    }
}