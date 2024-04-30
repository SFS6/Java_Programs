public class floydcycle {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }
    }
    public Node hascycle(Node head){
        Node slow=head,fast=head,prev=null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    prev=fast;
                    slow=slow.next;
                    fast=fast.next;
                }
                prev.next=null;
                return slow;
            }
        }
        return null;
    }
}
