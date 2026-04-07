package lab1;

public class AdvQueue extends MyQueue{

    public AdvQueue(int size) {
        super(size);
    }

    public void search(int n){
        for (int i=0; i< list.length -1;i++ ){
            if (n == list[i]){
                System.out.println("TRUE");
                return;
            }
        }
        System.out.println("FALSE");
    }

    public void clear(){
        for (int i=0; i< list.length-1;i++){
            list[i] = 0;
        }
    }

    public int getSize(){
        return list.length;
    }

    public boolean isFull(){
        for (int i=0; i< list.length -1;i++ ){
            if (0 == list[i]){
                return false;
            }
        }
        return true;
    }

    public int getFront() {
        return front% list.length;
    }

    public int getRear() {
        return rear% list.length;
    }
}
