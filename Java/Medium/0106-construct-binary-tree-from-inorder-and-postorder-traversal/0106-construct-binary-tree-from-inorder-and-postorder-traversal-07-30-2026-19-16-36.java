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
    int postidx;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postidx=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        return build(postorder, 0 ,inorder.length -1);
        
    }
    public TreeNode build(int[] postorder,int sidx,int eidx){
        if(sidx > eidx) return null;
        TreeNode root=new TreeNode(postorder[postidx--]);

        int idx=map.get(root.val);
        root.right=build(postorder,idx+1,eidx);
        root.left=build(postorder, sidx, idx-1);

        return root;
    }
}