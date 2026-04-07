package lab1;

public class MyStack {

    protected int top;
    protected int[] list;

    public MyStack(int size) {
        top = -1;
        list = new int[size];
    }

    public void push (int x){
        if (top++ >= list.length){
            System.out.println("Warning you can't pop empty stack.");
            return;
        }else {
            top++;
        }
        list[top] = x;
    }

    public int pop (){
        int temp = list[top];
        list[top] = 0;

        if (top == -1){
            System.out.println("Warning you can't pop empty stack.");
            return 0;
        } else {
            top--;
        }
        return temp;
    }

}
