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
        if (head == null) {
            return head;
        }

        ListNode beforeHead = new ListNode(-1);
        ListNode beforeTail = beforeHead;

        ListNode afterHead = new ListNode(-1);
        ListNode afterTail = afterHead;

        ListNode temp = head;

        while (temp != null) {
            ListNode next = temp.next; // Save next node
            temp.next = null;          // Detach current node

            if (temp.val < x) {
                beforeTail.next = temp;
                beforeTail = temp;
            } else {
                afterTail.next = temp;
                afterTail = temp;
            }

            temp = next;
        }

        // Connect both lists
        beforeTail.next = afterHead.next;

        return beforeHead.next;
    }
}
// class Solution {
//     public ListNode partition(ListNode head, int x) {
//         if(head==null ){
//             return head;
//         }
//         ListNode dummy=new ListNode(-1);
//         ListNode du=dummy;
//         ListNode temp=head;
//         while(temp!=null){
//             if(temp.val < x ){
//                 ListNode curr=new ListNode(temp.val);
//                 du.next=curr;
//                 du=curr;
//             }
//             temp=temp.next;
//         }
//         temp=head;
//         while(temp!=null){
//             if(temp.val >= x ){
//                 ListNode curr=new ListNode(temp.val);
//                 du.next=curr;
//                 du=curr;
//             }
//             temp=temp.next;
//         }
//         du.next=null;
//         return dummy.next;
        
//     }
// }