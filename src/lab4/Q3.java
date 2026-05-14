package lab4;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        int[] myArr = random.ints(10, 1, 5).toArray();
        long endTime = System.currentTimeMillis();
    }
}
