// Last updated: 8/14/2025, 3:48:16 PM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
        List<Integer> ll=new ArrayList<>();
        int n=q.size();
        for(int i=1;i<=n;i++){
            TreeNode a=q.poll();
            ll.add(a.val);
            if(a.left!=null){
                q.offer(a.left);
            }
             if(a.right!=null){
                q.offer(a.right);
            }
            

        }
        ans.add(ll);

        }
        return ans;
    }
}