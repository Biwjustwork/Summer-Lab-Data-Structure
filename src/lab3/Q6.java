package lab3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter String : ");
        String code = input.nextLine();
        Stack<Integer> evalStack = new Stack<>();
        Stack<String> postfixStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();

        String[] tokens = code.split(" ");

        for (int i = tokens.length-1; i >= 0 ; i--){
            String token = tokens[i];

            if (token.isEmpty()){
                continue;
            }

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^") || token.equals("%")){
                int left = evalStack.pop();
                int right = evalStack.pop();

                if (token.equals("+")){
                    evalStack.push(left + right);
                } else if (token.equals("-")) {
                    evalStack.push(left - right);
                } else if (token.equals("*")) {
                    evalStack.push(left * right);
                } else if (token.equals("/")) {
                    evalStack.push(left / right);
                } else if (token.equals("^")) {
                    evalStack.push(left ^ right);
                } else {
                    evalStack.push(left % right);
                }

                String postfix1 = postfixStack.pop();
                String postfix2 = postfixStack.pop();
                postfixStack.push(postfix1 + " " + postfix2 + " " + token);

                String infix1 = infixStack.pop();
                String infix2 = infixStack.pop();
                infixStack.push("(" + infix1 + " " + token + " " + infix2 + ")");

            } else {
                evalStack.push(Integer.parseInt(token));
                postfixStack.push(token);
                infixStack.push(token);
            }
        }
        System.out.println("prefix expression:\n" + code);
        System.out.println("postfix expression:\n" + postfixStack);
        System.out.println("infix expression:\n" + infixStack);
        System.out.println("Result = " + evalStack);

    }
}
