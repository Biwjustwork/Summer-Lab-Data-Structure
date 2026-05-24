package lab6;

import java.util.Scanner;

public class Q8 {
    public static void main() {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the length of the input: ");
        int lenght = input.nextInt();
        int[] myArr = new int[lenght];
        for (int i = 0 ; i < lenght; i++ ){

            while (true){
                System.out.print("Enter #"+(i+1)+" integer:");
                if (input.hasNextInt()){
                    myArr[i] = input.nextInt();
                    break;
                } else {
                    System.out.println("Error syntax try again.");
                    input.next();
                }
            }
        }
        doLogic(myArr, 0, 1);
    }
    public static void doLogic (int[] arr, int a, int b){
        if (a >= arr.length -1){
            return;
        }
        if (b == arr.length){
            doLogic(arr, a+1, a+2);
            return;
        }

        System.out.print("{"+ arr[a] +","+ arr[b] +"} ");
        doLogic(arr, a, b+1);
    }
}
