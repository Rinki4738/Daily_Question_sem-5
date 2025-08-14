// Last updated: 8/14/2025, 3:48:02 PM
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
    public void flatten(TreeNode root) {
       flat(root);
        
    }
     public TreeNode flat(TreeNode root) {
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return root;
        }
        TreeNode left_tail=flat(root.left);
        TreeNode right_tail=flat(root.right);
        if(root.left!=null){
            left_tail.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        return right_tail!=null?right_tail:left_tail;
        
    }


}