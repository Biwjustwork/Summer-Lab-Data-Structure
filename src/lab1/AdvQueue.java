package lab1;

public class AdvQueue extends MyQueue{

    public AdvQueue(int size) {
        super(size);
    }

    public boolean search(int n){
        if (n == 0){
            return false;
        }
        for (int i=0; i< list.length;i++ ){
            if (n == list[i]){
                return true;
            }
        }
        return false;
    }

    public void clear(){
        rear = 0;
        front =0;
        for (int i=0; i< list.length;i++){
            list[i] = 0;
        }
    }

    public int getSize(){
        int count =0;
        for (int i=0; i< list.length;i++ ){
            if (list[i] != 0){
                count++;
            }
        }
        return count;
        //return list.length;
    }

    public boolean isFull(){
        for (int i=0; i< list.length;i++ ){
            if (0 == list[i]){
                return false;
            }
        }
        return true;
    }

    public int getFront() {
        return list[front % list.length];
    }

    public int getRear() {
        return list[rear-1 % list.length];
    }
}
