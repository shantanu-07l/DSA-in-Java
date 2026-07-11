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
    public void reorderList(ListNode head) {
         if(head==null || head.next==null || head.next.next==null){
            return;
        }
        //find mid
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        ListNode mid=slow;
        //reverse
        ListNode prev=null;
        ListNode curr=mid.next;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        mid.next=null;//break connection 
        ListNode lefth=head;
        ListNode righth=prev;
        
        ListNode nextl=null;
        ListNode nextr=null;
        while(lefth!=null && righth!=null){
            nextl=lefth.next;//store next connextion
            lefth.next=righth;
            
            nextr=righth.next;//store next connection
            righth.next=nextl;
            //udate
            lefth=nextl;
            righth=nextr;
            
        }
        
    }
}