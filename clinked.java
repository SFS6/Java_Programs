public class clinked<T> {
    Node last;
    class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;
        } 
    }
    clinked(){
       last=null; 
    }
    void iab(T val){
        Node newnode=new Node(val);
        if(last==null){
        newnode.next=newnode;
        last=newnode;
    }else{
        newnode.next=last.next;
        last.next=newnode;
    }
    }
    void iae(T val){
        Node newnode=new Node(val);
        if(last==null){
        newnode.next=newnode;
        last=newnode;
    }else{
        newnode.next=last.next;
        last.next=newnode;
        last=newnode;
    }
    }
    void display(){
        Node temp=last.next;
        do{
            System.out.println(temp.data+" ");
            temp=temp.next;
        }while(temp!=last.next);
    }
    T dab(){
        if(last==null)
        throw new IndexOutOfBoundsException("Circular Linked List is Empty");
        T temp=last.next.data;
        if(last.next==last)
            last=null;
        else
            last.next=last.next.next;
        return temp;
    }

    void dae(){
        if(last==null)
        throw new IndexOutOfBoundsException("Circular Linked List is Empty");
        if(last.next==last)
            last=null;
        else{
            Node temp=last.next;
            while(temp.next!=last){
                temp=temp.next;
            }
            System.out.println(temp.next.data);
            temp.next=last.next;
            last=temp;
        }
    }
    public static void main(String[] args) {
        clinked<String> list=new clinked<String>();
        list.iab("Francis");
        list.iae("Godwin");
        list.iab("Lara");
        list.iae("Ethan");
        list.iab("Jaden");
        list.iae("Guru");
        System.out.println();
        list.display();
        System.out.println();
        System.out.println(list.dab());
        list.dae();
        System.out.println();
        list.display();
    }   
}
