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
class Solution {
    public int pairSum(ListNode head) {
        if(head==null){
            return 0;
        }else if(head.next==null){
            return head.val;
        }
        //finding mid
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode mid=slow;

        //reverse after mid
        ListNode prev=null;
        ListNode curr=mid;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode left=head;
        ListNode right=prev;
        int sum=0;
        int maxsum=0;
        while(right!=null){//alwasy cheack right!=null because it is greter node size
            sum+=left.val + right.val;
            maxsum=Math.max(maxsum,sum);
            sum=0;
            left=left.next;
            right=right.next;
        }
        return maxsum;

        
    }
}