package lab4;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    /**
     * Q3
     * length 10 -> 6 ms, 1000 -> 6 ms, 100000 -> 6 ms, 100000000 -> 276 ms O(n^2)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 10 table (10 x n): ");
        int n = sc.nextInt();


        int[][] myArr = new int[10][n];

        Random random = new Random();
        for (int i = 0 ; i < myArr.length ; i++){
            myArr[i] = random.ints(n, 1,10).toArray();
        }
        long startTime = System.currentTimeMillis();
        calculateAndPrintRowSum(myArr);

        long endTime = System.currentTimeMillis();
        System.out.println("The method took " + (endTime - startTime) + " milliseconds");
    }
    public static void calculateAndPrintRowSum (int[][] arr){

        for (int i = 0; i < arr.length ; i++){
            int sum =0;
            for (int j = 0; j < arr[i].length ; j++){
                sum += arr[i][j];
            }
            System.out.println("| Sum of row " + (i + 1) + " = " + sum);
        }
    }
}
