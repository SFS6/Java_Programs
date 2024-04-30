import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist<T> implements Iterable{
    class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;
        }
    }
    Node head;
    linkedlist(){
        head=null;
    }
    void iab(T val){
        Node n =new Node(val);
        if(head==null){
            head=n;
        }
        else{
            n.next=head;
            head=n;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void iap(int pos,T val){
        Node n=new Node(val);
        Node temp=head;
        if(pos==0) iab(val);
        else{
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;}
    }
    void dap(int pos){
        if(head==null){
            System.out.println("Index Out of Bounds Exception");
            return;
        }
        Node temp = head;
        Node prev = null;
        if(pos==0){
            head=head.next;
        }else{
        for(int i=1;i<=pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        }
    }
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            Node temp = head;
            public boolean hasNext(){
                    return temp!=null;
            }
            public T next(){
                T val=temp.data;
                temp=temp.next;
                return val;
            }
        };
    }
    void reverse(){
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        linkedlist<Integer> ll =new linkedlist<Integer>();
        ll.iab(9);
        ll.iab(5);
        ll.iab(8);
        ll.display();
        System.out.println();
        ll.iap(3,10);
        ll.display();
        System.out.println();
        ll.dap(3);
        ll.display();
        System.out.println();
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " " );
        }
        ll.reverse();
        ll.display();
    }
    
}
