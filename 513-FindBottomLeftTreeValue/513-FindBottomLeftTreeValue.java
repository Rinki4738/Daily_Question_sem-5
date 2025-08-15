// Last updated: 8/15/2025, 7:43:27 PM
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
    int maxh=0;
    int ans=-1;
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null && root.right==null){
            return root.val;
        }
        func(root,1);
        return ans;
       
        
    }
    public void func(TreeNode root,int cl){
        if(root==null){
            return;
        }
       

        if(cl>maxh){
            ans=root.val;
             maxh=cl;
          
        }
         

        func(root.left,cl+1);
        func(root.right,cl+1);
    }
}