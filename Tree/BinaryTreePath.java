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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ll=new ArrayList<>();
        func(root,ll,"");
        return ll;
        
    }
    public static void func(TreeNode root,List<String>ll,String a){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            a+=""+root.val;
            ll.add(a);
            

        }
        
         a+=""+root.val+"->";
        
        func(root.left,ll,a);
        func(root.right,ll,a);


    }
}