package lab1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST STACK ===");
        AdvStack stack = new AdvStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // ควรจะขึ้น Warning: Stack is full

        System.out.print("Search 20: ");
        stack.search(20); // ควรจะขึ้น TRUE

        System.out.println("Pop: " + stack.pop()); // 30
        stack.doublePop(); // ควรจะ pop 20, 10
        stack.pop(); // ควรจะขึ้น Warning: You can't pop from an empty stack.

        System.out.println("\n=== TEST CIRCULAR QUEUE ===");
        AdvQueue queue = new AdvQueue(3);

        // ทดสอบการ Enqueue
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4); // ควรจะขึ้น Warning: Queue is full.

        System.out.print("Search 2: ");
        queue.search(2); // ควรจะขึ้น TRUE

        // ทดสอบการ Dequeue แบบ Circular (เอาออกแล้วยัดเข้าใหม่)
        System.out.println("Dequeue: " + queue.deQueue()); // 1
        System.out.println("Dequeue: " + queue.deQueue()); // 2

        queue.enQueue(5); // คิวต้องวนกลับไปใส่ index 0
        queue.enQueue(6); // คิวต้องวนกลับไปใส่ index 1
        queue.enQueue(7); // ควรจะขึ้น Warning: Queue is full.

        System.out.println("Dequeue: " + queue.deQueue()); // 3
        System.out.println("Dequeue: " + queue.deQueue()); // 5
        System.out.println("Dequeue: " + queue.deQueue()); // 6
        queue.deQueue(); // ควรจะขึ้น Warning: Queue is empty.
    }
}
