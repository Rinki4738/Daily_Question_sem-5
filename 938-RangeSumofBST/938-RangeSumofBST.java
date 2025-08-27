// Last updated: 8/27/2025, 9:21:28 PM
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int rangeSum = 0;

        if (root == null)
            return rangeSum;
        
        if (root.val >= low && root.val <= high) {
            rangeSum += root.val;
            rangeSum += rangeSumBST(root.left, low, high);
            rangeSum += rangeSumBST(root.right, low, high);
        }
        if (root.val < low)
            rangeSum += rangeSumBST(root.right, low, high);
        if (root.val > high)
            rangeSum += rangeSumBST(root.left, low, high);

        return rangeSum;
    }
}