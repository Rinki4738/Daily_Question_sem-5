// Last updated: 8/22/2025, 11:10:25 AM
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null){
            return null;
        }
        TreeNode left=trimBST(root.left,low,high);
        TreeNode right=trimBST(root.right,low,high);
        TreeNode nn=new TreeNode ();
        if(root.val>=low && root.val<=high){
            nn.val=root.val;
            nn.left=left;
            nn.right=right;
        }
        else if(left==null){
           return  right;
        }
        else{
             return left;
        }
        return nn;
        
    }
}