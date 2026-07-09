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
    public ListNode partition(ListNode head, int x) {
        if(head==null ){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        ListNode du=dummy;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val < x ){
                ListNode curr=new ListNode(temp.val);
                du.next=curr;
                du=curr;
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.val >= x ){
                ListNode curr=new ListNode(temp.val);
                du.next=curr;
                du=curr;
            }
            temp=temp.next;
        }
        du.next=null;
        return dummy.next;
        
    }
}