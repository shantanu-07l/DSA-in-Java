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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode duplicate=new ListNode(-1);
        duplicate.next=head;
        ListNode temp=head;
        ListNode prev=duplicate;
        
        while(temp != null){
            if(temp.next!=null &&  temp.val==temp.next.val){

                int value=temp.val;

                while(temp!=null && value==temp.val){
                    temp=temp.next;
                }

                prev.next=temp;
            }else{
                prev=temp;
                temp=temp.next;
            }
            
        }
        return duplicate.next;
        
    }
}