package Valtta;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.run();
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Add");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.print("\nEnter your chosen operator (1-4): ");
		
		int choice = scanner.nextInt();
		System.out.print("\nEnter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("\nEnter the second number: ");
		int num2 = scanner.nextInt();
		
		double result;
		switch (choice) {
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				result = num1 == 0 ? Double.NaN : (double) num1 / num2;
				break;
			default:
				System.out.println("\nEntered operator is not valid");
				return;
		}
		
		System.out.println("\nThe result is: " + result);
	}
}