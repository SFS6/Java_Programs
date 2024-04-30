public class queuelinked {
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    Node front,rear;
    queuelinked(){
        front=rear=null;
    }
    void enqueue(int val){
        Node newnode=new Node(val);
        if(front==null) front=newnode;
        else{
        rear.next=newnode;}
        rear=newnode;
    }
    int dequeue(){
        try{
        if(front==null)
        throw new Exception("Underflow");}
        catch(Exception e){
            System.out.println("Linked List is Empty");
        }
        int temp=front.data;
        front=front.next;
        if(front==null)rear=null;
        return temp;
    }
    boolean isEmpty(){
        return front==null;
    }
    int peek(){
        try{
        if(front==null)
        throw new Exception("Empty");}
        catch(Exception e){
            System.out.println("Linked List is Empty");
        } 
        return front.data;
    }
    public static void main(String[] args) {
        queuelinked q=new queuelinked();
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
