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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);

        while( !q.isEmpty()){
            int size=q.size();
            boolean isx=false;
            boolean isy=false;

            for(int i=0;i<size;i++){
                TreeNode currNode=q.remove();

                // Check if x and y are siblings
                if(currNode.left != null && currNode.right != null){
                    int left=currNode.left.val;
                    int right=currNode.right.val;
                    if(x==left  && y==right || x==right && y==left){
                        return false;
                    }
                }
                if(currNode.val == x){
                    isx=true;
                }
                if(currNode.val ==y){
                    isy=true;
                }
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
            if(isx && isy){
                return true;
            }
            if(isx || isy){
                return false;
            }
        }
        return false;

        
        
    }
}