package lab4;

import java.util.Random;
import java.util.Scanner;

public class Q4 {
    /**
     * Q4
     * length 10 -> 6 ms, 1000 -> 6 ms, 100000 -> 41 ms, 100000000 -> 36874 ms O(n^3)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 10 table (10 x n): ");
        int n = sc.nextInt();

        int[][] myArr1 = new int[10][n];
        int[][] myArr2 = new int[n][10];

        Random random = new Random();
        for (int i = 0 ; i < myArr1.length ; i++){
            myArr1[i] = random.ints(n, 1,10).toArray();
        }
        for (int i = 0 ; i < myArr2.length ; i++){
            myArr2[i] = random.ints(10,1,10).toArray();
        }
        long startTime = System.currentTimeMillis();
        int[][] result = multiplyMatrices(myArr1,myArr2);

        System.out.println("\nResult Matrix (A x B):");
        if (result != null) {
            printMatrix(result);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("The method took " + (endTime - startTime) + " milliseconds");
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B){

        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        // ตรวจสอบเงื่อนไขการคูณ Matrix
        if (colsA != rowsB) {
            System.out.println("Error: Columns of A must match Rows of B.");
            return null;
        }

        int[][] product = new int[rowsA][colsB];

        // อัลกอริทึมการคูณ: ใช้ Nested Loop 3 ชั้น
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return product;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
