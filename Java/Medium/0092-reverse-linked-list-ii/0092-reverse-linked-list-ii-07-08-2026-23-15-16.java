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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right ){
            return head;
        }
        ListNode first=head;
        int i=1;
        ListNode before=null;
        while(i<left){
            before=first;
            first=first.next;
            i++;
        }

        ListNode last=head;
        int j=1;
        while(j<right){
            last=last.next;
            j++;
        }
        ListNode after=last.next;

        //reverse
        ListNode prev=null;
        ListNode curr=first;
        ListNode next;
        while(curr!=after){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        if(before!=null){
            before.next=last;
        }else{
            head=last;
        }

        first.next=after;
        return head;
  
    }
}