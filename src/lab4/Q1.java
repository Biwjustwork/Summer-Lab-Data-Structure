package lab4;

import java.util.Random;

public class Q1 {
    /**
     *
     * Q1
     * length 10 -> 0 ms, 1000 -> 0 ms, 100000 -> 0 ms, 100000000 -> 1 ms O(n)
     */
    public static int multiplicationOf2(int[] arr){
        return arr[arr.length-1]*2;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArr = random.ints(100000000, 10,1000000).toArray();
        long startTime = System.currentTimeMillis();
        System.out.println(multiplicationOf2(myArr));
        long endTime = System.currentTimeMillis();
        System.out.println("The method took " + (endTime - startTime) + " milliseconds");
    }
}
