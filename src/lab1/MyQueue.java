package lab1;

public class MyQueue {
    protected int front = 0;
    protected int rear = 1;
    protected int[] list;

    public MyQueue(int size) {
        this.list = new int[size];
    }


    public void enQueue(int x){
        if (rear != -1){
            System.out.println("Warning: Queue is full.");
        }else if (((rear+1)% list.length == front% list.length) && (front > rear)){
            System.out.println("Warning: Queue is full.");

        }else {
            rear++;
            list[rear% list.length]= x;
        }
    }

    public int deQueue(){
        if (rear == -1){
            System.out.println("Warning: Queue is empty.");
        }else if (front > rear){
            System.out.println("Warning: Queue is empty.");
        }else {
            int temp = list[front% list.length];
            list[front% list.length] =0;
            front++;
            return temp;
        }
        return 0;
    }
}
