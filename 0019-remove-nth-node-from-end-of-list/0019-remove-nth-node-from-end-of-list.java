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
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode a=temp;
        ListNode b=temp;
        for(int i=0;i<=n;i++){
            a=a.next;
        }
        while(a != null){
            a=a.next;
            b=b.next;
        }
        b.next=b.next.next;
        return temp.next;
    }
}