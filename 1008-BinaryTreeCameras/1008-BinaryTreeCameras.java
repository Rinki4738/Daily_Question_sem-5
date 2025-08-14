// Last updated: 8/14/2025, 3:44:17 PM
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
    int camera=0;
    public int minCameraCover(TreeNode root) {
       int c=minCamera(root);
       if(c==-1){
        camera++;
       }
       return camera;

        
    }
     public int minCamera(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=minCamera(root.left);
        int right=minCamera(root.right);
        if(left==-1||right==-1){// -1 means camere ki need hai
            camera++;
            return 1;//camera setup kiya hai is node pe
        }
       else if(left==1||right==1){//mtlb ki inme se koi ek k paas camera hai orek k paas camera hai aur dusra covered hai dusra wala covered hai
            return 0;//iska mtlb mai covered hu 
        }
        else {//jab dono covered ho
            return -1;//need hai camera ki
        }

        
    }

}