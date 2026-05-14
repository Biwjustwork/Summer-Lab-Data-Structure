package lab1;

public class AdvStack extends MyStack{

    public AdvStack(int size) {
        super(size);
    }

    public int peak(){
        return list[top];
    }

    public void search(int n){
        for (int i=0; i< list.length;i++ ){
            if (n == list[i]){
                System.out.println("TRUE");
                return;
            }
        }
        System.out.println("FALSE");
    }

    public void clear(){
        for (int i=0; i< list.length;i++){
            list[i] = 0;
        }
        top =-1;
    }

    public void doublePop(){
        int numpop1 = pop();
        int numpop2 = pop();
        System.out.println("Pop: "+numpop2+","+numpop1);
    }
    public void doublePush(int x, int y){
        push(x);
        push(y);
    }
}
