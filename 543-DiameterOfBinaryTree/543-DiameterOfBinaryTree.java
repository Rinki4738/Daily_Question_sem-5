// Last updated: 8/14/2025, 3:45:37 PM
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
     int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        length(root);
        return max;
        
    }
    public  int length(TreeNode root){
        if(root==null){
            return 0;
        }


        int left=length(root.left);
        int right=length(root.right);
        max=Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}