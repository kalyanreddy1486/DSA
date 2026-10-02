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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int h = findh(head);
        for(int i = 0 ; i<h/2 ; i++){
            curr = curr.next;
        }
        return curr;
        
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