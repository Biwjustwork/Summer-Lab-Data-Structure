package lab3;

import java.util.LinkedList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<String> listName = new LinkedList<>();
        listName.add("Jame");
        listName.add("Luca");
        listName.add("Tang");
        listName.add("John");
        listName.add("Jane");
        listName.add("May");
        listName.add("Bee");
        listName.add("Jazz");
        System.out.println(listName);
        boolean hasName;

        while (true){
            System.out.print("Enter name to delete or press 'x' to exit.: ");
            String text = input.nextLine();
            hasName = false;
            for (String name : listName){
                if (name.equalsIgnoreCase(text)){
                    listName.remove(name);
                    System.out.println(name + " is remove");
                    System.out.println(listName);
                    hasName = true;
                }
            }
            if (text.equalsIgnoreCase("x")){
                return;
            }
            if (!hasName){
                System.out.println("Error please try again.");
            }
        }
    }
}
