package lab6;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();

        System.out.println(palindromeCheck(word, 0));
    }

    public static boolean palindromeCheck(String text, int index) {

        if (index >= text.length() / 2) {
            return true;
        }

        char leftChar = text.charAt(index);
        char rightChar = text.charAt(text.length() - 1 - index);


        if (leftChar == rightChar) {

            return palindromeCheck(text, index + 1);
        } else {

            return false;
        }
    }
}