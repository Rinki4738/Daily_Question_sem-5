// Last updated: 8/14/2025, 3:45:34 PM
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
    int sum =0;
    public int findTilt(TreeNode root) {
         func(root);
         return sum;
        
    }
    public int func(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.val;
        }
        int left=func(root.left);
        int right=func(root.right);
        sum+=Math.abs(left-right);
        return root.val+left+right;

    }
}