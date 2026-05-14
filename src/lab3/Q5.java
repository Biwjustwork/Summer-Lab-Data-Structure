package lab3;

import java.util.Scanner;
import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int oddNum;
        Stack<String> list = new Stack<>();

        while (true){
            System.out.print("Enter odd number : ");
            if (input.hasNextInt()){
                oddNum = input.nextInt();
                if (oddNum > 0 && oddNum % 2 != 0){
                    break;
                } else {
                    System.out.println("Error not odd number");
                    continue;
                }
            } else {
                System.out.println("Error syntax");
            }
            input.next();
        }

        for (int i = 1; i <= oddNum; i += 2) {
            String text = "";
            for (int e = 0; e < (oddNum - i)/2  ; e+=1){
                text += " ";
            }
            for (int j = 0; j < i; j++) {
                text += "+";
            }
            System.out.println(text);
            if (i < oddNum){
                list.push(text);
            }
        }
        while (!list.isEmpty()) {
            System.out.println(list.pop());
        }
    }
}