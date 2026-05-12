package lab3;


import lab3.MyNode;

public class BasicLinkedList <E> {
    private MyNode head;

    public BasicLinkedList(){

    }

    public MyNode getHead() {
        return head;
    }

    public void setHead(MyNode head) {
        this.head = head;
    }

    public void addFirst(E x){
        MyNode temp = new MyNode(x);
        temp.setNext(head);
        head = temp;
    }

    public void removeFirst(){
        head = head.getNext();
    }

    public E getFirst(){
        return (E) head.getElement();
    }

    public void printAll(){
        MyNode current = head;
        while (current != null){
            if (current.getNext() != null){
                System.out.print(current.getElement() + " -> ");

            }else {
                System.out.print(current.getElement());
            }
            current = current.getNext();

        }
        System.out.println();
    }

    public int getSize(){
        MyNode current = head;
        int count = 0;
        while (current != null){
            count++;
            current = current.getNext();
        }
        return count;
    }

}
