package lab3;

import java.util.LinkedList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = input.nextInt();
        LinkedList<Integer> list = new LinkedList<>();


        while (num > 0){
            if (num % 2 == 0){
                list.addFirst(0);
            }else {
                list.addFirst(1);
            }
            num = num/2;
        }
        for (int i : list){
            System.out.print(i);
        }

    }
}
