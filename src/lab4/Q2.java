package lab4;

import java.util.Random;

public class Q2 {
    /**
     * Q2
     * length 10 -> 0 ms, 1000 -> 0 ms, 100000 -> 1 ms, 100000000 -> 33 ms
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArr = random.ints(100000000, 10, 1000000).toArray();
        long startTime = System.currentTimeMillis();
        System.out.println(sumAll(myArr));
        long endTime = System.currentTimeMillis();
        System.out.println("The method took " + (endTime - startTime) + " milliseconds");
    }
    public static int sumAll(int[] x){
        int sum = 0;
        for (int i = 0 ; i < x.length ; i++){
            sum += x[i];
        }
        return sum;
    }
}


