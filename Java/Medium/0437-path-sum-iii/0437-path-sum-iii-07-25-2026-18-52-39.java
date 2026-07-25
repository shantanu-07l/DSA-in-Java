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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);

        return count;  
    }
    public void dfs(TreeNode root, int targetSum){
        if(root==null){
            return;
        }
        findPath(root, targetSum);
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
    }

    public void findPath(TreeNode root,long targetSum){
        if(root==null){
            return;
        }
        if(root.val == targetSum){
            count++;
        }
        findPath(root.left, targetSum - root.val);
        findPath(root.right, targetSum - root.val);
    }
}