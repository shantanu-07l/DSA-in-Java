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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        
        int idx=size/2;
        int j=0;
        ListNode demo=head;
        ListNode prev=null;
        while(j<idx){
            prev=demo;
            demo=demo.next;
            j++;
        }
        if(demo.next!=null){
            prev.next=demo.next;
        }else{
            prev.next=null;
        }
        
        return head;
        

    }
}