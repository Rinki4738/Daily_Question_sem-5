// Last updated: 8/14/2025, 3:48:04 PM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        func(root,targetSum,0,ll,ans);
        return ans;


        
    }
    public static void func(TreeNode root, int targetSum,int sum,List<Integer> ll, List<List<Integer>>ans){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            if((sum+root.val)==targetSum){
                ll.add(root.val);
                ans.add(new ArrayList<>(ll));
                ll.remove(ll.size()-1);
            }
            return ;

        }
        
        ll.add(root.val);
        func(root.left,targetSum,sum+root.val,ll,ans);
        
        func(root.right,targetSum,sum+root.val,ll,ans);
          ll.remove(ll.size()-1);

    }
}