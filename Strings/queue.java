import java.util.NoSuchElementException;

public class queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    public queue(){
        front=null;
        rear=null;
        length=0;
    }
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void Enqueue(int data){
        ListNode temp=new ListNode(data);
        if (isEmpty()) front=temp;
        else rear.next=temp;
        rear=temp;
        length++;
    }
    public void print(){
        if(isEmpty())return;
        ListNode current=front;
        while (current!=null){
            if(current.next==null) System.out.print(current.data);
            else System.out.print(current.data+"-->");
            current=current.next;
        }
    }
    public int Dequeue(){
        if(isEmpty()) throw new NoSuchElementException("Queue is Empty");
        int result=front.data;
        front=front.next;
        if(front==null) rear=null;
        length--;
        return result;
    }

    public static void main(String[] args){
        queue queue=new queue();
        queue.Enqueue(10);
        queue.Enqueue(15);
        queue.Enqueue(5);
        queue.Enqueue(50);
        queue.print();
        System.out.println("\n");
        queue.Dequeue();
        queue.print();
        System.out.print(queue.front);
    }
}
