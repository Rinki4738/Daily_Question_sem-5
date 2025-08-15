// Last updated: 8/15/2025, 4:52:39 PM
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
    class Pair{
        TreeNode node;
        boolean contain=false;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return func(root,p,q).node;
        
    }
    public Pair func(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return new Pair(); 
        }
         if(root.val==p.val||root.val==q.val){
            Pair pp= new Pair();
            pp.node=root;
            pp.contain=true;
            return pp;

        }
        if(root.left==null && root.right==null){
            return new Pair();
        }
       


       Pair left=func(root.left,p,q);
        Pair right=func(root.right,p,q);
        Pair nn=new Pair();
        if(left.contain && right.contain){
            nn.node=root;
        }
       else if(left.contain){
        nn.node=left.node;
       }
       else if(right.contain){
         nn.node=right.node;
       }
        
        nn.contain=left.contain || right.contain;
        return nn;

    }
}