// Last updated: 8/22/2025, 9:01:41 PM
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
          if(root==null){
            return ll;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            long max=Long.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode a=que.poll();
                max=Math.max(max,a.val);
                if(a.left!=null){
                    que.offer(a.left);
                }
                if(a.right!=null){
                    que.offer(a.right);
                }
               
            }
           ll.add((int)max);
          

        }
        return ll;
      
        
    }
}