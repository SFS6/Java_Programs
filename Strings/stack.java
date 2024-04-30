import java.util.EmptyStackException;
import java.util.Stack;

public class stack {
    private ListNode top;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data=data;
        }
    }
    public stack(){
        top=null;
        length=0;
    }
    public int length(){
        return  length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        ListNode temp=new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public void print(){
        if(isEmpty())return;
        stack.ListNode current=top;
        while (current!=null){
            if(current.next==null) System.out.print(current.data);
            else System.out.print(current.data+"\n");
            current=current.next;
        }
    }

    public int pop() {
        if(isEmpty()) throw new EmptyStackException();
        int result = top.data;
        top=top.next;
        length--;
        return result;
    }
    public int peek(){
        if(isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    public static void main(String []args){
        stack stack =new stack();
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.pop();
        stack.print();
    }
}
