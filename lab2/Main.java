package lab2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BasicLinkedList ===");
        BasicLinkedList basic = new BasicLinkedList();
        basic.addFirst(30);
        basic.addFirst(20);
        basic.addFirst(10);
        basic.printAll(); // 10 -> 20 -> 30
        System.out.println("First: " + basic.getFirst()); // 10
        System.out.println("Size: " + basic.getSize()); // 3
        basic.removeFirst();
        basic.printAll(); // 20 -> 30
        System.out.println("\n=== EnhancedLinkedList ===");
        EnhancedLinkedList enhanced = new EnhancedLinkedList();
        enhanced.addFirst(30);
        enhanced.addFirst(20);
        enhanced.addFirst(10);
        enhanced.printAll(); // 10 -> 20 -> 30
        enhanced.addLast(40);
        enhanced.printAll(); // 10 -> 20 -> 30 -> 40
        System.out.println("Last: " + enhanced.getLast()); // 40
        enhanced.addLast(50);
        enhanced.printAll(); // 10 -> 20 -> 30 -> 40 -> 50
        System.out.println("Last: " + enhanced.getLast());
        enhanced.removeLast();
        enhanced.printAll(); // 10 -> 20 -> 30 -> 40
        enhanced.removeLast();
        enhanced.printAll(); // 10 -> 20 -> 30
        enhanced.search(20); // TRUE
        enhanced.search(99); // FALSE
        enhanced.remove(20);
        enhanced.printAll(); // 10 -> 30
        enhanced.search(20); // FALSE
        System.out.println("\n=== LinkedListWithThird ===");
        LinkedListWithThird third = new LinkedListWithThird();
        third.addFirst(40);
        third.addFirst(30);
        third.addFirst(20);
        third.addFirst(10);
        third.printAll(); // 10 -> 20 -> 30 -> 40
        System.out.println("Third: " + third.getThird()); // 30
        third.addThird(99);
        third.printAll(); // 10 -> 20 -> 99 -> 30 -> 40
        third.addThird(88);
        third.printAll(); // 10 -> 20 -> 88 -> 99 -> 30 -> 40

    }
}
