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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;//not found
        }
        if(root.val > key){
            root.left=deleteNode(root.left,key);
        }else if(root.val < key){
            root.right=deleteNode(root.right,key);
        }else{ //found
            //case 1 -leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2-1 chiled
            if(root.left == null){
                return root.right;
            }
            if(root.right ==null){
                return root.left;
            }

            //case 3--2 child
            TreeNode sucessor=findMin(root.right);
            root.val=sucessor.val;
            root.right=deleteNode(root.right,sucessor.val);
        }
        return root;
    }
    public TreeNode findMin(TreeNode root){
        while(root.left != null){
            root=root.left;
        }
        return root;
    }
}