package lab3;
import java.util.Scanner;
import java.util.Stack;
public class Q1 {
    public static void main(String[] args) {
        System.out.print("//Q1 : Write a program that receives a number of integers and prints them in the reverse order.\n");
        Stack<Integer> x = new Stack<>();
        System.out.print("Enter num: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i =0; i < num; i++){
            System.out.print("No."+(i+1)+" = ");
            x.push(input.nextInt());
        }
        for (int i =0; i < num; i++){
            System.out.print(x.pop()+" ");
        }



    }
}
