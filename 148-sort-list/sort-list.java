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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode middlenode = middle(head);
        ListNode left = head;
        ListNode right = middlenode.next;
        middlenode.next = null;

        left = sortList(left);
        right = sortList(right);

        return merge(left,right);
        
    }
    public ListNode middle(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;


    }
    public ListNode merge(ListNode l1 , ListNode l2){
        ListNode dummy = new ListNode(-1);

        ListNode temp = dummy;

        while(l1!= null && l2!= null){
            if(l1.val > l2.val){
                temp.next = l2;
                
                l2 = l2.next;
            }else{
                temp.next = l1;
                l1= l1.next;
            }
            temp = temp.next;
        }
        if(l1!= null){
            temp.next = l1;
        }
        if(l2!= null){
            temp.next = l2;

        }

        return dummy.next;
    }
}