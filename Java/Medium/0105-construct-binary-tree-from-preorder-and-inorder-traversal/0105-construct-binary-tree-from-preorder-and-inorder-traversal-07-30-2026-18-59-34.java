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
    int preidx=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);

        }
        return build(preorder,0,inorder.length-1);
    }
    public TreeNode build(int[] preorder,int sidx,int eidx){
        if(sidx > eidx){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preidx++]);
        int idx=map.get(root.val);
        root.left=build(preorder,sidx,idx-1);
        root.right=build(preorder,idx+1,eidx);
        return root;
    }
}