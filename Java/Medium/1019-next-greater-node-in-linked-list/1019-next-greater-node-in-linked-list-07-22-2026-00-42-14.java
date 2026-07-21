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
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> ans= new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            ans.add(curr.val);
            curr=curr.next;
        }

        int array[]=new int[ans.size()];
       Stack<Integer> st=new Stack<>();

        for(int i=ans.size()-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= ans.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                array[i]=0;
            }else{
                array[i]=st.peek();
            }
           st.push(ans.get(i));
        }
        return array;

    }
}