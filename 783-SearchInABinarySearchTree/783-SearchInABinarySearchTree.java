// Last updated: 8/14/2025, 3:44:52 PM
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        
        TreeNode s=new TreeNode();
        if(val>root.val){
            s=searchBST(root.right,val);
        }
        else if(val<root.val){
            s=searchBST(root.left,val);
        }
        else{
            return root;
        }
        return s;
        
    }
}