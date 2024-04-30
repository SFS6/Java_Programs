import java.util.Scanner;

public class dlinked{
    class Node{
        int data;
        Node next,prev;
        Node(int val){
            data=val;
            next=prev=null;
        }
    }
    Node head=null;Node tail=null;
    dlinked(){
        head=null;
        tail=null;
    }
    void iab(int val){
        Node n =new Node(val);
        n.next=head;
        if(head==null){
            head=n;
            tail=n;
        }else
            head.prev=n;       
            head=n;
    }
    void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to display normally(1) or reverse(2):");
        int n=sc.nextInt();
        Node temp;
        switch(n){
        case 1:
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        break;
        case 2:
        temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        break;
        default:System.out.println("Enter any 2 choices between 1 and 2");
        break;
    }
    }
    void iap(int pos,int val){
        Node n=new Node(val);
        Node temp=head;
        if(pos==0) {iab(val); return;}
        for(int i=1;i<pos;i++){
            temp=temp.next;
            if(temp==null)
                throw new IndexOutOfBoundsException("Invalid Position");
        }
        n.next=temp.next;
        n.prev=temp;
        if(temp==tail)
            tail=n;
        else
            temp.next.prev=n;
            temp.next=n;
    }
    void dap(int pos){
        if(head==null){
            throw new IndexOutOfBoundsException("Invalid Position");
        }
        Node temp = head;
        Node prev = null;
        if(pos==0){
            head=head.next;
            head.prev=null;
            return;
        }else{
        for(int i=1;i<=pos;i++){
            prev=temp;
            temp=temp.next;
            if(temp==null){
                throw new IndexOutOfBoundsException("Invalid Position");
            }
        }
        prev.next=temp.next;
        if(temp.next==null)
        tail=prev;
        else
        temp.next.prev=prev;
        }
    }
    public static void main(String[] args) {
        dlinked ll =new dlinked();
        ll.iab(9);
        ll.iab(5);
        ll.iab(14);
        ll.iab(3);
        ll.display();
        System.out.println();
        ll.iap(0, 4);
        ll.display();
        System.out.println();
        ll.dap(3);
        ll.display();
        
    }
    
}
