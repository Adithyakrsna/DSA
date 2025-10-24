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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp  = head;
        ListNode prev = null;
        ListNode nextnode = null;
        while(temp!= null){

            ListNode knode = kthnode(k, temp);

            if(knode==null){
                if(prev!=null){
                    prev.next = temp;
                }
                break;
            }

             nextnode = knode.next;
            knode.next = null;

            reverse(temp);

            if(temp == head){
                head = knode;
            }else{
                prev.next = knode;
            }

            prev = temp;
            temp = nextnode;

        

        }
        return head;
    }
    public ListNode kthnode(int k , ListNode temp){
        k-=1;
        while(k!=0 && temp!=null ){
            k--;
            temp = temp.next;
            

        }
        return temp;
    }

    public ListNode reverse(ListNode head){
        if(head==null || head.next== null ){
            return head;
        }

        ListNode newnode =reverse(head.next);

        head.next.next = head;
        head.next = null;

        return newnode;



    }


}