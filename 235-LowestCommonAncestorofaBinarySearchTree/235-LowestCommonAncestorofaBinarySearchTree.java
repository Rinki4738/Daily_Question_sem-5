// Last updated: 8/15/2025, 5:20:58 PM
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
        if(root.val>p.val ||root.val>q.val)
            a=lowestCommonAncestor(root.left,p,q);
        if(root.val<p.val ||root.val<q.val)
            b=lowestCommonAncestor(root.right,p,q); 
        
         if(a!=null && b !=null){
            return root;
        }
        else if(a==null){
            return b;
        }
        else{
            return a;
        }
        
        
    }
}