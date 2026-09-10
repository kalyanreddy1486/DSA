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
        int size = find(head);
        ListNode temp = head;
        int lenp = size-n;
        if (size == n) {
            return head.next;
        }
        for(int i = 1 ; i<lenp ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public int find(ListNode head){
        int size = 0;
        ListNode temp = head;
        while(temp != null){

            size++;
            temp = temp.next;
        }
        return size;
    }
}