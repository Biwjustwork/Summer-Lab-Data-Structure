package lab1;

public class MyStack {

    protected int top;
    protected int[] list;

    public MyStack(int size) {
        top = -1;
        list = new int[size];
    }

    public void push (int x){
        top++;
        if (top >= list.length) {
            top--;
            System.out.println("Warning: Stack is full");
        }else {
            list[top] = x;
        }


    }

    public int pop (){
        if (top == -1){
            System.out.println("Warning: You can't pop from an empty stack.");
            return 0;
        }
        int temp = list[top];
        list[top] = 0;
        top--;
        return temp;
    }

}
