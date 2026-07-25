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
        ArrayList<Integer> path=new ArrayList<>();
        dfs(root, targetSum, path);
        return count;

    }
    public void dfs(TreeNode root, int targetSum, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.val);
        long sum=0;
        for(int i=path.size()-1; i>=0; i--){
            sum+=path.get(i);
            if(sum == targetSum){
                count++;
            }

        }
        //recursion
        dfs(root.left,targetSum,path);
        dfs(root.right, targetSum, path);
        //backtracking
        path.remove(path.size() -1);
    }
}