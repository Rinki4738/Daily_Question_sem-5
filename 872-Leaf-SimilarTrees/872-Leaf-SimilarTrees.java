// Last updated: 8/23/2025, 4:48:27 PM
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>ll =new ArrayList<>();
         List<Integer>ll2 =new ArrayList<>();
        func(root1,ll);
        func(root2,ll2);
        return ll.equals(ll2);

        
    }
    public void func(TreeNode root, List<Integer>ll){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            ll.add(root.val);
            return;
        }


        func(root.left,ll);
        func(root.right,ll);
    }
    

}