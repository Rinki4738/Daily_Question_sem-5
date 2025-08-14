// Last updated: 8/14/2025, 3:45:22 PM
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){
            return null;
        }
        
        TreeNode nn=new TreeNode();
        int sum=0;
        if(root1==null){
            sum=root2.val;
            nn.val=sum;
            nn.left=mergeTrees(null,root2.left);
            nn.right=mergeTrees(null,root2.right);

        }
        else if(root2==null){
            sum=root1.val;
            nn.val=sum;
            nn.left=mergeTrees(root1.left,null);
            nn.right=mergeTrees(root1.right,null);
        }
        else{
        sum=root1.val+root2.val;
        nn.val=sum;
        nn.left=mergeTrees(root1.left,root2.left);
        nn.right=mergeTrees(root1.right,root2.right);}
        return nn;

        
    }
}