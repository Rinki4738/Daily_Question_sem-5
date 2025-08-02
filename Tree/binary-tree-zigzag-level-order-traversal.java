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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        int k=1;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> ll=new ArrayList<>();
            int n=q.size();
            for(int i=1;i<=n;i++){
                TreeNode node =q.poll();
                ll.add(node.val);
               
                if(node.left!=null){q.offer(node.left);}
                if(node.right!=null){q.offer(node.right);}
                
            
        }
        if(k%2==0){
        Collections.reverse(ll);
        ans.add(ll);}
        else{
            ans.add(ll);
        }
        k++;
        
        
    }
    return ans;
}}