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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){return null;}
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        if(size-n==0){ head= head.next; return head;}
        ListNode prevNode=null;
        ListNode slow=head;
        ListNode fast=head.next;
        for(int i=0;i<Math.abs(size-n);i++){
            prevNode=slow;
            slow = slow.next;
            fast=fast.next;
        }
        prevNode.next = fast;
        return head;
    }
}