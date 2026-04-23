package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //EAS*Y*QUE***ST***IO*N***
        //LA*STI*N*FIR*ST**OU*T****

        System.out.print("Enter String : ");
        String code = input.nextLine();
        ArrayList<String> Queue = new ArrayList<>();
        String[] texts = code.split("");
        for (String text : texts){
            Queue.add(text);
            if (text.equals("*")){
                Queue.remove(text);
                if (!Queue.isEmpty()){
                    Queue.removeFirst();
                }
            }
        }
        if (Queue.isEmpty()){
            System.out.println("Nothing");
        }else {
            for (String text : Queue){
                System.out.print(text);
            }
        }


    }
}
