/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;

        }

        next(head);

        random(head);

        return connect(head);

    }

    public void  next (Node head){
        
        Node temp = head;
        while(temp != null){
            Node nextElement = temp.next;

            Node copy = new Node (temp.val);

            copy.next = nextElement;

            temp.next = copy;

            temp = nextElement;

        }
    }

    public void random(Node head){
        Node temp = head;

        while(temp!=null){
            if(temp.random!=null){
                temp.next.random = temp.random.next;
            }else{
                temp.next.random = null;
            }
            temp = temp.next.next;
        }



    }

    public Node connect (Node head){
        Node temp = head;
        Node dummy = new Node(-1);
        Node curr = dummy;


        while(temp!= null){
            curr.next = temp.next;
            temp.next = temp.next.next;
            curr = curr.next;
            temp = temp.next;

        }
        return dummy.next;
        
        
    }
}