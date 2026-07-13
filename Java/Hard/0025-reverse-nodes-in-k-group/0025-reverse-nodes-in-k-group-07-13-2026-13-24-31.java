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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        //crete new node dummy
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prevGroup=dummy;
        while(true){
            ListNode kth =prevGroup;
            int i=0;
            while(i<k && kth!=null){//kth not null becuse if ll is is less than k not fill k node
                kth=kth.next;
                i++;
            }
            if(kth==null){
                break;
            }
            ListNode nextGroup=kth.next;
            ListNode prev=nextGroup;
            ListNode curr=prevGroup.next;
            while(curr != nextGroup){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode temp=prevGroup.next;
            prevGroup.next=kth;//conrct kth with prevvious
            prevGroup=temp;//next prevoius is your prevGroup next becuse after reverse it is last 

        }
        return dummy.next;

 
    }
}