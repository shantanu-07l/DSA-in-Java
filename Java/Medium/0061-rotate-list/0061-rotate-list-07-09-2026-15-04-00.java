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
    public ListNode rotateRight(ListNode head, int k) {
        //base case
        if(head==null || head.next==null || k==0){
            return head;
        }
        //find tail and size of LL
        ListNode tail=head;
        int size=1;//because if i=0 and in condition check tail!=null then after tail is null the cause nullpointerexpection//not go till last node go prev node of next
        while(tail.next!=null){
            tail=tail.next;
            size++;
        }
        //connect tail to head
        tail.next=head;
        //for rotate quetion we use this to avoid dublicate
        k=k%size;
        //find privious of where we rotate
        ListNode prev=head;
        int i=0;
        while(i<size-k-1){
            prev=prev.next;
            i++;
        }
        head=prev.next;//make your prevs next head
        prev.next=null;//beak connect of prev and rotated head

        return head;
    }
}