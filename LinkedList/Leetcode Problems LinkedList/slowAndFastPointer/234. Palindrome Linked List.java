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
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        ListNode slow=head;
        ListNode fast=head;
        int n=0;
        while(fast!=null && fast.next!=null){
            n++;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr= slow;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        slow=head;
        while(slow!=null && prev!=null){
            if(slow.val==prev.val){
                slow=slow.next;
                prev = prev.next;
                continue;
            }
            return false;
        }
        return true;
    }
}