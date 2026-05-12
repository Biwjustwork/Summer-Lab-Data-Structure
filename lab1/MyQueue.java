package lab1;

public class MyQueue {
    protected int front = 0;
    protected int rear = 0;
    protected int[] list;

    public MyQueue(int size) {
        this.list = new int[size];
    }


    public void enQueue(int x){
        if (rear - front == list.length){
            System.out.println("Warning: Queue is full.");
        }else {
            list[rear% list.length]= x;
            rear++;
        }
    }

    public int deQueue(){
        if (front == rear){
            System.out.println("Warning: Queue is empty.");
            return 0;
        }else {
            int temp = list[front % list.length];
            list[front % list.length] = 0;
            front++;
            return temp;
        }
    }
}
