// Last updated: 8/14/2025, 3:47:21 PM
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        func(root,1,ll);
        return ll;

        
    }
      int maxd=0;
    public  void func(TreeNode root,int cl,List<Integer>ll){
        if(root==null){
            return ;
        }
        if(maxd<cl){
            ll.add(root.val);
            maxd=cl;
        }

        func(root.right,cl+1,ll);
        func(root.left,cl+1,ll);
    }
}