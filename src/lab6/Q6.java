package lab6;
import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random random = new Random();

        /* * ข้อควรระวัง: Fibonacci แบบ Recursion มีความซับซ้อนระดับ $O(2^n)$
         * หากใช้ n = 100 ตามตัวอย่างเดิม โปรแกรมจะไม่สามารถรันจบได้ในเวลาอันสั้น
         * และค่า Fibonacci ของ 100 จะเกินขอบเขตของ long ($F_{92}$ คือค่าสูงสุดที่ long รับได้)
         * จึงขอปรับช่วงเป็น 1-40 และลดจำนวนรอบเพื่อทดสอบครับ
         */
        int[] myArr = random.ints(5, 1, 10).toArray();

        // 1. ทดสอบแบบ Loop
        System.out.println("--- Testing Fibonacci with Loop ---");
        long startLoop = System.currentTimeMillis();
        for (int n : myArr) {
            System.out.println("Fib(" + n + ") = " + fibLoop(n));
        }
        long endLoop = System.currentTimeMillis();
        System.out.println("Loop total time: " + (endLoop - startLoop) + " ms\n");

        // 2. ทดสอบแบบ Recursion
        System.out.println("--- Testing Fibonacci with Recursion ---");
        long startRec = System.currentTimeMillis();
        for (int n : myArr) {
            System.out.println("Fib(" + n + ") = " + fibRecursion(n));
        }
        long endRec = System.currentTimeMillis();
        System.out.println("Recursion total time: " + (endRec - startRec) + " ms");
    }

    // การคำนวณ Fibonacci โดยใช้ Loop
    public static long fibLoop(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // การคำนวณ Fibonacci โดยใช้ Recursion
    public static long fibRecursion(int n) {
        // Termination condition (เงื่อนไขหยุด)
        if (n <= 1) {
            return n;
        }
        // Repeating condition & Passing values
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
}