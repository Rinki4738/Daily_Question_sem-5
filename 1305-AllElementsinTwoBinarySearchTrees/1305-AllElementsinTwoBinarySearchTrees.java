// Last updated: 8/19/2025, 9:50:12 PM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ll=new ArrayList<>();
        func(root1,ll);
        func(root2,ll); 
        Collections.sort(ll);
        return ll;

        
    }
    public void func(TreeNode root,List<Integer>ll){
        if(root==null){
            return;
        }
        func(root.left,ll);
        ll.add(root.val);
        func(root.right,ll);
    }

}