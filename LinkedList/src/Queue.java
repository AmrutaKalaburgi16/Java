public class Queue {
    int front;
    int rear;
    int size;
    int[] arr=new int[4];

    public Queue(){
        this.front=-1;
        this.rear=-1;
        this.size= arr.length;
    }

    public void enqueue(int x){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear]=x;
    }
    public int dequeue(){
        if(front==rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[++front];
    }
    public int peek(){
        if(front==rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front+1];
    }
    public void show(){
        for (int i = front+1; i <=rear ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
