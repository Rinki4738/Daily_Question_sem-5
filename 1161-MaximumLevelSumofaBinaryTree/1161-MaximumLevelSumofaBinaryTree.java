// Last updated: 8/22/2025, 12:22:01 PM
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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans=Integer.MIN_VALUE;
        int level=0;
        int l=1;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode a=que.poll();
                sum+=a.val;
                if(a.left!=null){
                    que.offer(a.left);
                }
                if(a.right!=null){
                    que.offer(a.right);
                }
               
            }
            if(sum>ans){
                    ans=sum;
                    level=l;
            }
            l++;

        }
        return level;
        
    }
}