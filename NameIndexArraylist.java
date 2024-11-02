package Valtta;

import java.util.ArrayList;
import java.util.Scanner;

public class NameIndexArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        names.add("Ana");
        names.add("Jose");
        names.add("Juan");

        // Adding a new name
        System.out.print("Enter name to add: ");
        String newName = scanner.nextLine();
        names.add(newName);

        System.out.println("\nHere are the names:");
        System.out.println(names);

        // Removing a name by index
        System.out.print("Enter index number to remove: ");
        int removeIndex = scanner.nextInt();
        if (removeIndex >= 0 && removeIndex < names.size()) {
            names.remove(removeIndex);
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("\nHere are the names:");
        System.out.println(names);

        // Replacing a name
        System.out.print("Enter index number to replace (set): ");
        int setIndex = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter new name: ");
        String replaceName = scanner.nextLine();
        if (setIndex >= 0 && setIndex < names.size()) {
            names.set(setIndex, replaceName);
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("\nHere are the names:");
        System.out.println(names);

        // Searching for a name
        System.out.print("Enter name to search (contains/indexOf): ");
        String searchName = scanner.nextLine();
        if (names.contains(searchName)) {
            System.out.println(searchName + " is in the list with index " + names.indexOf(searchName) + ".");
        } else {
            System.out.println(searchName + " is not in the list.");
        }

        // Printing an element by index
        System.out.print("Enter index number: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < names.size()) {
            System.out.println("Index " + index + " belongs to " + names.get(index) + ".");
        } else {
            System.out.println("Invalid index.");
        }

        // Clearing the list
        System.out.print("Clear the list? Y/N: ");
        char clear = scanner.next().charAt(0);
        if (clear == 'Y' || clear == 'y') {
            names.clear();
            System.out.println("The list is now empty.");
        }

        System.out.println("The size of the list is " + names.size() + ".");
    }
}
