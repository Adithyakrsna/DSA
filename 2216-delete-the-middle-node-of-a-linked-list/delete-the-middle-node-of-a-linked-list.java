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
    public ListNode deleteMiddle(ListNode head) {
        if( head== null || head.next== null){
            return null;
        }
        ListNode curr = head;
        int count = 0;
        while(curr!= null){
            count++;
            curr = curr.next;


        }
    
        
        curr = head;

        int ans = count/2;

        for(int i = 1 ; i < ans ;i++){
            curr = curr.next;
        }

        
        if (curr.next != null) {
            
            ListNode middle = curr.next;
            curr.next = curr.next.next;
            middle = null;
        }

        return head;
    }
}