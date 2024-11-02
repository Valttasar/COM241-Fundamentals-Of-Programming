package Valtta;

import java.util.Scanner;

public class NameIndexArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Ana", "Jose", "Juan"};
        System.out.print("Enter name: ");
        String newName = scanner.nextLine();
        
        String[] updatedNames = new String[names.length + 1];
        System.arraycopy(names, 0, updatedNames, 0, names.length);
        updatedNames[names.length] = newName;

        System.out.println("\nHere are the names:");
        for (String name : updatedNames) {
            System.out.print(name + ", ");
        }

        System.out.print("\nEnter index number: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < updatedNames.length) {
            System.out.println("Index " + index + " belongs to " + updatedNames[index] + ".");
        } else {
            System.out.println("Invalid index.");
        }

        String[][] names2D = {{"Ana", "Jose"}, {"Juan", newName}};
        System.out.println("\nNames in 2D array:");
        for (String[] row : names2D) {
            for (String name : row) {
                System.out.print(name + ", ");
            }
        }
    }
}
