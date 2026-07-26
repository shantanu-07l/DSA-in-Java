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
        //root node need camera
        if(dfs(root) == 0){
            camera++;
        }
        return camera;
    }
    int dfs(TreeNode root){
        if(root == null){
            return 2;//rvery null node covered by cmera
        }
        int left=dfs(root.left);
        int right=dfs(root.right);

        //need cameras
        if(left == 0 || right == 0){
            camera++;
            return 1;//now it has a  camera after camera install

        }
        //node has camera
        if(left == 1 || right == 1){
            return 2;//node has camrea but not covered need to coverd
        }

        //chiled are covers
        return 0;
    }
}