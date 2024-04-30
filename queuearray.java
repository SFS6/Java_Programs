public class queuearray {
    static final int MAX_SIZE=30;
    int arr[];
    int front,rear;
    queuearray(){
        arr=new int[MAX_SIZE];
        front=rear=-1;
    }

    void enqueue(int val){
        if(rear==MAX_SIZE-1)
        throw new IndexOutOfBoundsException("Overflow");
        if(front==-1) front++;
        arr[++rear]=val;
    }
    int dequeue(){
            if(rear==-1)
            throw new IndexOutOfBoundsException("UnderFlow");
        int temp=arr[0];
        for(int i=1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        rear--;
        return temp;
    }
    void display(){
        for(int i=front;i<=rear;i++)
        System.out.print(arr[i]+"->");
    }

    public static void main(String[] args) {
        queuearray queue=new queuearray();
        queue.enqueue(20);
        queue.enqueue(45);
        queue.enqueue(10);
        queue.enqueue(13);
        queue.enqueue(40);
        // System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.display();
        // System.out.println(queue.arr[0]);

    }
    
}
