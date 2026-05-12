package lab2;



public class EnhancedLinkedList extends BasicLinkedList{

    public EnhancedLinkedList() {
        super();
    }

    public int getLast(){
        MyNode current = getHead();
        while (current.getNext() != null){
            current = current.getNext();
        }
        return current.getElement();
    }

    public void addLast(int x){
        if(getHead() == null){
            addFirst(x);
            return;
        }
        MyNode temp = new MyNode(x);
        MyNode current = getHead();
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);

    }

    public void removeLast(){
        if(getHead() == null){
            System.out.println("Linked list is empty.");
            return;
        }
        MyNode current = getHead();
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);

    }

    public boolean search(int x){
        MyNode current = getHead();
        while (current.getNext() != null){
            if (current.getElement() == x){
                System.out.println("TRUE");
                return true;
            }else {
                current = current.getNext();
            }
        }
        System.out.println("FALSE");
        return false;
    }

    public void remove(int x){
        if(getHead() == null){
            System.out.println("Linked list is empty.");
            return;
        }
        MyNode current = getHead();
        MyNode temp;
        boolean hasRemoved = false;
        while (current.getNext() != null){
            if (current.getNext().getElement() == x){
                temp = current.getNext().getNext();
                current.setNext(null);
                current.setNext(temp);
                hasRemoved = true;
            }else {
                current = current.getNext();
            }
            if (!hasRemoved){
                System.out.println("Warning: No "+x+" in linked list");
            }
        }
    }

}
