package Valtta;

import java.util.Scanner;

public class Pointofsale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueFlag;

        do {
            double subtotal = 0.0;
            int itemCount = 1;

            while (true) {
                System.out.print("Enter item " + itemCount + " price: ");
                double price = getValidPrice(scanner);

                System.out.print("Enter item " + itemCount + " quantity: ");
                int quantity = getValidQuantity(scanner);

                subtotal += price * quantity;
                itemCount++;

                System.out.print("Do you want to add another item? (y/n): ");
                String addAnother = scanner.next().trim().toLowerCase();

                if (!addAnother.equals("y")) {
                    break;
                }
            }

            double vat = subtotal * 0.12;
            double total = subtotal + vat;

            System.out.printf("Subtotal: %.2f%n", subtotal);
            System.out.printf("VAT: %.2f%n", vat);
            System.out.printf("Total amount: %.2f%n", total);

            System.out.print("Do you want to process another customer? (y/n): ");
            continueFlag = scanner.next().trim().toLowerCase();

        } while (continueFlag.equals("y"));

        System.out.println("Exiting the POS system...");
        scanner.close();
    }

    private static double getValidPrice(Scanner scanner) {
        while (true) {
            try {
                double price = Double.parseDouble(scanner.next());
                if (price < 0) {
                    System.out.print("Price cannot be negative. Please enter a valid price: ");
                } else {
                    return price;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a numeric price: ");
            }
        }
    }

    private static int getValidQuantity(Scanner scanner) {
        while (true) {
            try {
                int quantity = Integer.parseInt(scanner.next());
                if (quantity < 0) {
                    System.out.print("Quantity cannot be negative. Please enter a valid quantity: ");
                } else {
                    return quantity;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a numeric quantity: ");
            }
        }
    }
}