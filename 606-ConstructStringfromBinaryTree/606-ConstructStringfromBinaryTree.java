// Last updated: 8/23/2025, 4:08:10 PM
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
    StringBuilder ans=new StringBuilder();
    public String tree2str(TreeNode root) {
        ans.append(root.val);
         if(root.left==null && root.right!=null){
           ans.append("()");
        }
        func(root.left);
        func(root.right);
        return ans.toString();

       

        
    }
    public void func(TreeNode root){
        if(root==null){  
            return;
        }
        ans.append("("+root.val);
        if(root.left==null && root.right!=null){
           ans.append("()");
        }
        func(root.left);
        func(root.right);
        ans.append(")");
    }

}