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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        //sumof left and right
        int left=Math.max(0,dfs(root.left));
        int right=Math.max(0,dfs(root.right));

        //current sum same as all node sum
        int currPath=left + right +root.val;
        //update maximum
        max=Math.max(max,currPath);
        //return one side only
        return Math.max(left,right) + root.val;
    }
}