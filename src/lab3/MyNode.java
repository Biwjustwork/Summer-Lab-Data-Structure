package lab3;

public class MyNode <E> {
    private E element;
    private MyNode next;

    public MyNode(E x){
        element = x;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
