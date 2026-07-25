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

        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> path= new ArrayList<>();

        dfs(root,targetSum,ans,path);

        return ans;
        
    }
    public void dfs(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> path){

        if(root == null){
            return;
        }

        path.add(root.val);
        targetSum-=root.val;

        if( root.left== null && root.right == null && targetSum == 0 ){
            ans.add(new ArrayList<>(path));
        }
        //recursion

        dfs(root.left, targetSum, ans,path);
        dfs(root.right, targetSum, ans, path);

        //backtacking
        path.remove(path.size() -1);
    }
}