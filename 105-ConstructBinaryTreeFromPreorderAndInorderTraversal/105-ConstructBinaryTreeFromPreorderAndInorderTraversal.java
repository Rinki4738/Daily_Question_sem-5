// Last updated: 8/14/2025, 3:48:11 PM
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return create(preorder,inorder,0,preorder.length-1,0,inorder.length-1);

        
    }
    public static TreeNode create(int[] preorder, int[] inorder,int plo,int phi,int ilo,int ihi){
        if(ilo>ihi ||plo>phi){
            return null;
        }
        TreeNode nn=new TreeNode();
        nn.val=preorder[plo];
        int idx=search(inorder,preorder[plo],ilo,ihi);
        int ele=idx-ilo;
        nn.left=create(preorder,inorder,plo+1,phi+ele,ilo,idx-1);
        nn.right=create(preorder,inorder,plo+ele+1,phi,idx+1,ihi);
        return nn;




    }
    public static int search(int inorder[],int val,int si,int ei){
        for(int i=si;i<=ei;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }
}