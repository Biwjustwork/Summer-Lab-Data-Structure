package lab2;

public class LinkedListWithThird extends BasicLinkedList{
    public int getThird (){
        if (getHead() == null ){
            System.out.println("Linked list is empty.");
            return 0;
        }
        if (getSize() < 3){
            System.out.println("Linked list has element less than 3.");
            return 0;
        }
        return getHead().getNext().getNext().getElement();
    }
    public void addThird(int x){
        if (getHead() == null ){
            System.out.println("Linked list is empty.");
            return;
        }
        if (getSize() < 3) {
            System.out.println("Linked list has element less than 3.");
            return;
        }
        MyNode second = getHead().getNext();
        MyNode oldThird = second.getNext();

        second.setNext(new MyNode(x));
        second.getNext().setNext(oldThird);
    }
}
