// Last updated: 8/14/2025, 3:45:30 PM
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if (subRoot == null)
        return true;
        
        if (root == null) 
        return false;

        boolean a=issame(root,subRoot);
        if(a){
            return a;
        }
        boolean b= isSubtree(root.left,subRoot);
        boolean c=isSubtree(root.right,subRoot);
        return b ||c;
        
        
        
    }
    public static boolean issame(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }


        boolean a=issame(root1.left,root2.left);
        boolean b=issame(root1.right,root2.right);
        return a && b && root1.val== root2.val;

    }
}