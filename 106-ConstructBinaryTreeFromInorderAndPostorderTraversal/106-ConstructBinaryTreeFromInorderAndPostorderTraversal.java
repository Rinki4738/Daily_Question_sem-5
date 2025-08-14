// Last updated: 8/14/2025, 3:48:10 PM
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return create(inorder,postorder,0,postorder.length-1,0,inorder.length-1);
        
    }
    public static TreeNode create(int[] inorder, int[] postorder,int plo,int phi,int ilo,int ihi){
        if(ilo>ihi||plo>phi){
            return null;
        }

        TreeNode nn=new TreeNode();
        nn.val=postorder[phi];
        int idx=search(inorder,ilo,ihi,postorder[phi]);
        int ele=ihi-idx;
        nn.left=create(inorder,postorder,plo,phi-ele-1,ilo,idx-1);
        nn.right=create(inorder,postorder,phi-ele,phi-1,idx+1,ihi);
        return nn;


    }
    public static int search(int inorder[],int si,int ei,int val){
        for(int i=si;i<=ei;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }
}