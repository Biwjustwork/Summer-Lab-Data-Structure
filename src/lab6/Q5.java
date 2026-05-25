package lab6;

import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArr = random.ints(10000, 1,1000).toArray();

        findSmallestLoop(myArr);

        long startTime = System.currentTimeMillis();
        int result = findSmallestRecursion(myArr,0);
        long endTime = System.currentTimeMillis();

        System.out.println("smallest num = " + result);
        System.out.println("The method took " + (endTime - startTime) + " milliseconds");
    }
    public static void findSmallestLoop (int[] arr){
        long startTime = System.currentTimeMillis();
        int min = arr[0];
        for (int i = 0; i <arr.length; i++ ){
            if (arr[i] < min ){
                min = arr[i];
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("smallest num = "+min);
        System.out.println("The method took " + (endTime - startTime) + " milliseconds");
    }
    public static int findSmallestRecursion (int[] arr, int index){
        if (index == arr.length -1){
            return arr[index];
        }
        int m = findSmallestRecursion(arr, index + 1);
        if (arr[index] < m) {
            m = arr[index];
        }
        return m;
    }

    // วิธีเรียกใน main: findSmallestRecursion(myArr, 0, myArr.length - 1)
    public static int findSmallestRecursionV2(int[] arr, int low, int high) {
        // 1. Termination condition: ถ้าเหลือสมาชิกตัวเดียว
        if (low == high) {
            return arr[low];
        }

        // 2. แบ่งครึ่งอาเรย์ (Divide)
        int mid = (low + high) / 2;

        // 3. หาค่าที่น้อยที่สุดของฝั่งซ้ายและขวา (Conquer & Passing values)
        int leftMin = findSmallestRecursionV2(arr, low, mid);
        int rightMin = findSmallestRecursionV2(arr, mid + 1, high);

        // 4. เปรียบเทียบและคืนค่าที่น้อยที่สุดกลับไป (Combine)
        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
        }
    }
}
