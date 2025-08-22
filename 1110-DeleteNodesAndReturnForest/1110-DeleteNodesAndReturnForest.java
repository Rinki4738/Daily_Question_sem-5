// Last updated: 8/22/2025, 8:03:53 PM
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
      List<TreeNode> ll=new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        func(root,to_delete);
        if(!search(root.val,to_delete))
        ll.add(root);
        return ll;
        
    }
    public TreeNode func(TreeNode root, int[] to_delete){
        if(root==null){
            return null;
        }
        Boolean  found=search(root.val,to_delete);
        if(found){
            
           root.left= func(root.left,to_delete);
           root.right= func(root.right,to_delete);
           if(root.left!=null)
            ll.add(root.left);
            if(root.right!=null)
            ll.add(root.right);
           
            return null;
            

        }
        else{
        root.left=func(root.left,to_delete);
        root.right=func(root.right,to_delete);}
        return root;
    }
    public boolean search(int val,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return true;
            }
        }
        return false;
    }
}