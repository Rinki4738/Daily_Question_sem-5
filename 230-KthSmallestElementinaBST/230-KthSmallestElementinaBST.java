// Last updated: 8/21/2025, 8:07:55 AM
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
    int val=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        func(root,k);
        return val;
      
    
        
    }
    public void  func(TreeNode root, int k){
        if(root==null){
            return;
        }
        

        func(root.left,k);
        count++;
        if(count==k){
            val=root.val;
        }
        func(root.right,k);
       

    }
}