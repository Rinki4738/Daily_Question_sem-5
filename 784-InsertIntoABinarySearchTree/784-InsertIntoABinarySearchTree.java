// Last updated: 8/14/2025, 3:44:51 PM
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
           
            return new TreeNode(val);
        }
        TreeNode a;
        if(val>root.val){
            a=insertIntoBST(root.right,val);
            root.right=a;
            

        }
        else{
            a=insertIntoBST(root.left,val);
            root.left=a;
            
        }
        return root;
        
    }
}