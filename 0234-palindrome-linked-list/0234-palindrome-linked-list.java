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
        ListNode rev = null;
        ListNode temp = head;
        while(temp != null){
            rev = new ListNode(temp.val,rev);
            temp = temp.next;
        }
        ListNode temp1 = head;
        while(temp1 != null){
            if(temp1.val != rev.val){
                return false;
            }
            temp1 = temp1.next;
            rev = rev.next;

        }
        return true;
    }
}