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
    static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
         return diameter(root).diam;//only write diameter
   
    }
    public static Info diameter(TreeNode root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftIn=diameter(root.left);
        Info rightIn=diameter(root.right);

        int height=Math.max(leftIn.ht, rightIn.ht) +1;

        int diameter=Math.max(Math.max(leftIn.diam, rightIn.diam) , leftIn.ht + rightIn.ht);//diameter formula
        return new Info(diameter, height);
    }
}