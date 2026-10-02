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
        ListNode curr = head;
        int h = findh(head);
        if(h == n){
            return head.next;
        }
        for(int i = 0 ; i<h-n-1 ; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
        
    }
    public int findh(ListNode head){
        int h = 0;
        while(head != null){
            h++;
            head = head.next;
        }
        return h;
    }
}