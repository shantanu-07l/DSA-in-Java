/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {

        ArrayList<Integer> ans=new ArrayList<>();
        ListNode temp=head;

        while(temp!=null){

            ans.add(temp.val);
            temp=temp.next;
        }

        TreeNode root=bst(ans,0,ans.size()-1);
        return root;

    }
    public TreeNode bst(ArrayList<Integer> ans,int si,int ei){
        if(si> ei) return null;

        int mid=si + (ei-si)/2;
        TreeNode root=new TreeNode(ans.get(mid));
        root.left=bst(ans,si,mid-1);
        root.right=bst(ans,mid+1,ei);
        return root;

    }
}