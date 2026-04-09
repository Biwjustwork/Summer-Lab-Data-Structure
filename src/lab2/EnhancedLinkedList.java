package lab2;



public class EnhancedLinkedList extends BasicLinkedList{

    public EnhancedLinkedList(int x) {
        super(x);
    }

    public int getLast(){
        MyNode current = getHead();
        while (current.getNext() != null){
            current = current.getNext();
        }
        return current.getElement();
    }

    public void addLast(int x){
        MyNode temp = new MyNode(x);
        MyNode current = getHead();
        while (current.getNext() != null){
            current = current.getNext();
        }


        setHead(current) ;

    }

}
