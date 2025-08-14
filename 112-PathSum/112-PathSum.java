// Last updated: 8/14/2025, 3:48:05 PM
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
       return sum(root,targetSum,0);
    }
    public static boolean sum(TreeNode root, int targetSum,int s){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null && targetSum==(s+root.val)){
            return true;
        }


       boolean a= sum(root.left,targetSum,s+root.val);
       boolean b= sum(root.right,targetSum,s+root.val);
       return a || b;
    }


}