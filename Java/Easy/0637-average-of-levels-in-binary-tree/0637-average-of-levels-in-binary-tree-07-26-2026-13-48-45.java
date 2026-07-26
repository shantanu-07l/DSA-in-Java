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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans= new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        if(root==null){
            return ans;
        }

        q.add(root);
        q.add(null);
        List<Integer> level=new ArrayList<>();

        int count=0;
        double sum=0;

        while(!q.isEmpty()){
            TreeNode currNode=q.remove();

            if(currNode == null){
                //if null then add in answer level
                double avg=sum/count;
                ans.add(avg);
                sum=0;
                avg=0;
                count=0;
                //after add in answer clear level for next level store

                if(!q.isEmpty()){
                    q.add(null);//for next level becuse already node present)

                }
            }else{
                sum+=(double) currNode.val;
                count++;
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }

        }
        return ans; 
    }
}