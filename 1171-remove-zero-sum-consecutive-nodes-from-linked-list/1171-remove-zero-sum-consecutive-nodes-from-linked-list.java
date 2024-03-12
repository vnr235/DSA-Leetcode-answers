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
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head==null)
        return head;
        ListNode c=head;
        int sum=0;
        while(c!=null) 
        {
            sum+=c.val;
            if(sum==0) 
            {
                head=c.next;
                return removeZeroSumSublists(head);
            }
            c=c.next;
        }
        head.next=removeZeroSumSublists(head.next);
        return head;
    }
}