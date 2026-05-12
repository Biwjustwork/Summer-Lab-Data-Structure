package lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //EAS*Y*QUE***ST***IO*N***
        //LA*STI*N*FIR*ST**OU*T****

        System.out.print("Enter String : ");
        String code = input.nextLine();
        Queue<String> queue = new LinkedList<>();
        String[] texts = code.split("");
        for (String text : texts){
            queue.add(text);
            if (text.equals("*")){
                queue.remove(text);
                if (!queue.isEmpty()){
                    queue.remove();
                }
            }
        }
        if (queue.isEmpty()){
            System.out.println("Nothing");
        }else {
            for (String text : queue){
                System.out.print(text);
            }
        }


    }
}
