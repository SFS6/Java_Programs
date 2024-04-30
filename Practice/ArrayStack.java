public class ArrayStack <T>{
     static final int MAX_SIZE=30;
     T arr[]=(T[])new Object[MAX_SIZE];
     int top;
     ArrayStack(){
        top=-1;
     }
     void push(T val) {
        if(top==MAX_SIZE-1)
            throw new IndexOutOfBoundsException("OverFlow");
        arr[++top]=val;
     }
     T pop(){
        if(top==-1) throw new IndexOutOfBoundsException("UnderFlow");
        return arr[top--];
     }
     T peek(){
        return arr[top]; 
     }
     boolean isEmpty(){
        return top==-1;
     }
     void display(){
        int current=top;
        while(current>=0){ System.out.println(arr[current]); current--;}
     }
    public static void main(String []args){
        ArrayStack <String> stack =new ArrayStack<String>();
        stack.push("Francis");
        stack.push("Santhosh");
        stack.push("Angel");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        stack.display();


    }
    
}
