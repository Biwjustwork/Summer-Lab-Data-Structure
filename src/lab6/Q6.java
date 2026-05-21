package lab6;
import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] myArr = random.ints(5, 1, 10).toArray();


        System.out.println("--- Testing Fibonacci with Loop ---");
        long startLoop = System.currentTimeMillis();
        for (int n : myArr) {
            System.out.println("Fib(" + n + ") = " + fibLoop(n));
        }
        long endLoop = System.currentTimeMillis();
        System.out.println("Loop total time: " + (endLoop - startLoop) + " ms");


        System.out.println("--- Testing Fibonacci with Recursion ---");
        long startRec = System.currentTimeMillis();
        for (int n : myArr) {
            System.out.println("Fib(" + n + ") = " + fibRecursion(n));
        }
        long endRec = System.currentTimeMillis();
        System.out.println("Recursion total time: " + (endRec - startRec) + " ms");
    }


    public static int fibLoop(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // การคำนวณ Fibonacci โดยใช้ Recursion
    public static int fibRecursion(int n) {

        if (n <= 1) {
            return n;
        }

        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
}