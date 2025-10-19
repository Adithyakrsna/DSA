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
        
        int count = 0;

        while(curr!=null){
            curr = curr.next;
            count++;
        }

        
        if(count == 1){
            return null;
        }
        if(count == n){
            return head.next;
        }

        int ans = count -n;
        curr = head;

        for(int i = 1 ; i <ans ;i++){
            
                curr = curr.next;

            
        }
        curr.next = curr.next.next;

        return head;
    }
}