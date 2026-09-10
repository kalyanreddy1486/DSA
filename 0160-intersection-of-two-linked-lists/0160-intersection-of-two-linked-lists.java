/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeone = getLength(headA);
        int sizetwo = getLength(headB);
        ListNode dummy1 = headA;
        ListNode dummy2 = headB;
        if(sizeone > sizetwo){
            int len = sizeone-sizetwo;
            for(int i = 1 ; i<=len ; i++){
                dummy1 = dummy1.next;

            }
        }
        else{
            int len = sizetwo-sizeone;
            for(int i = 1 ; i<=len ; i++){
                dummy2 = dummy2.next;
            }


        }
        while(dummy2 != null && dummy1 != null){
            if(dummy1 == dummy2){
                return dummy1;
            }
            dummy1 = dummy1.next;
            dummy2 = dummy2.next;

        }
        return null;
        

    }
    private int getLength(ListNode head){
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}