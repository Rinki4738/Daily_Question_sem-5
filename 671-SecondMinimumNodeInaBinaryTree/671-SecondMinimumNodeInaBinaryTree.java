// Last updated: 8/22/2025, 7:23:02 PM
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
    long min=Long.MAX_VALUE;
    long prev=min;
    public int findSecondMinimumValue(TreeNode root) {
        func(root);
        if(prev==Long.MAX_VALUE){
            return -1;
        }
        return (int)prev;
     
       
    }
    public void func(TreeNode root){
        if(root==null){
            return;
        }
        if(min>root.val){
            prev=min;
            min=root.val;
           
        }
        else if(prev>root.val && root.val!=min){
            prev=root.val;
        }
        func(root.left);
        func(root.right);


    }
}