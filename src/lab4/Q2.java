package lab4;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        int[] myArr = random.ints(10, 1, 5).toArray();
        sumAll(myArr);
        long endTime = System.currentTimeMillis();
        System.out.println("The method took " + (endTime - startTime) + " milliseconds");
    }
    public static void sumAll(int[] x){
        int sum = 0;
        for (int i : x){
            sum += i;
        }
        System.out.println(sum);
    }
}


