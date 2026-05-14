package lab4;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        int[] myArr = random.ints(100000, 10,1000000).toArray();

        long endTime = System.currentTimeMillis();
        System.out.println("The method took " + (endTime - startTime) + " milliseconds");
        /*
            myArr.leght = 10 ==> The method took 1 milliseconds
            myArr.leght = 1000 ==> The method took 2 milliseconds
            myArr.leght = 100000 ==> The method took 6 milliseconds
            myArr.leght = 100000000 ==> The method took 1052 milliseconds
         */

    }
}
