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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        int size  = size(head);
        for(int i = 0 ; i<size/2 ; i++){
            temp = temp.next;
        }
        return temp.next;

        
    }
    public int size(ListNode head){
        int s = 0;
        ListNode temp = head;
        while(temp != null){
            s++;
            temp = temp.next;
        }
        return s;
    }
}