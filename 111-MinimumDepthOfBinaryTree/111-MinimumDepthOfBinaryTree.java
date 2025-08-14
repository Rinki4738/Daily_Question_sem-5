// Last updated: 8/14/2025, 3:48:07 PM
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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int a=0,b=0;
        a=minDepth(root.left);
        b=minDepth(root.right);
        if(a==0){
            return b+1;
            
        }
        if(b==0){
            return a+1;
        }
        return Math.min(a,b)+1;
        
    }
}