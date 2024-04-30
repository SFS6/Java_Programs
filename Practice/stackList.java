public class stackList <T>{
    class Node{
        T data;
        Node next;
        Node(T val){
            data =val;
            next=null;
        }
    }
    Node top;
    stackList(){
        top=null;
    }
    void push(T val){
        Node newnode=new Node(val);
        newnode.next=top;
        top=newnode;
    }
    T pop(){
        try{
        if(top==null) throw new Exception("Underflow");}
        catch(Exception e){
            System.out.println("Stack is Empty");
        }
        T tmp= top.data;
        top=top.next;
        return tmp;
    }
    public boolean isEmpty(){
        return top==null;
    }
    T peek(){
        return top.data;
    }
    public static void main(String[] args) {
        stackList<Integer> stack=new stackList<Integer>();
        stack.push(40);
        stack.push(12);
        stack.push(23);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
    
}
