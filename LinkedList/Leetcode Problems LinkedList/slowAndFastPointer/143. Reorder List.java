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
        if(head==null || head.next==null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
             slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next=null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev= curr;
            curr=next;
        }
        slow=head;
        while(prev!=null){
            ListNode next = slow.next;
            ListNode prevNext = prev.next;
            slow.next = prev;
            prev.next= next;
            slow = next;
            prev = prevNext;
        }
    }
}