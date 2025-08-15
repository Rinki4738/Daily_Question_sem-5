// Last updated: 8/15/2025, 5:27:41 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p ||root==q){
            return root;
        }
        TreeNode a=null;
        TreeNode b=null;
        if(root.val>p.val && root.val>q.val){
             return lowestCommonAncestor(root.left,p,q);
        }
       else if(root.val<p.val && root.val<q.val){
             return lowestCommonAncestor(root.right,p,q);
        }
       else{
        return root;
       }
        
    }
}