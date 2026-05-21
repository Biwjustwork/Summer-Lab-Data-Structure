package lab6;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String word = input.next();
        int y = word.length()/2;
        System.out.println(palindromeCheck(word,y));

    }
    public static boolean palindromeCheck (String text, int index){
        if (index == -1){
            return true;
        } else {
            char a = text.charAt(index);
            char b = text.charAt(text.length()-index);
            if (a == b){
                palindromeCheck(text, index-1);
            }else {
                return false;
            }
        }
        return false;
    }
}
