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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        int s = size(head);
        for(int i = 0 ; i<s-n ; i++){
            temp = temp.next;

        }
        temp.next = temp.next.next;
        return dummy.next;
        
    }
    public int size(ListNode head){
        ListNode temp = head;
        int s = 0;
        while(temp!= null){
            s++;
            temp = temp.next;
        }
        return s;
    }
}