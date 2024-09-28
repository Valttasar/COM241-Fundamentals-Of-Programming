package Valtta;

import java.util.Scanner;

public class Grader {
	public static void main(String[] args) {
		int cppGrade = Cpp();
		int phpGrade = PHP();
		int javaGrade = Java();
	}
	
	public static int Cpp() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your grades in C++: ");
		int cppGrade = scanner.nextInt();
		
		if(cppGrade <= 0 || cppGrade >= 101) {
			System.out.println("Invalid Value.");
			
		}
		
		else if(cppGrade >= 60) {
			System.out.println("You passed.");
		}
		
		else {
			System.out.println("You failed.");
		}
		
		return cppGrade;
	}
	
	public static int PHP() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter your grades in PHP: ");
		int phpGrade = scanner.nextInt();
		
		if(phpGrade <= 0 || phpGrade >= 101) {
			System.out.println("Invalid Value.");
			
		}
		else if(phpGrade >= 60) {
			System.out.println("You passed.");
		}
		
		else {
			System.out.println("You failed.");
		}
		
		return phpGrade;
	}
	
	public static int Java() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter your grades in Java: ");
		int javaGrade = scanner.nextInt();
		
		if(javaGrade <= 0 || javaGrade >= 101) {
			System.out.println("Invalid Value.");
			
		}
		else if(javaGrade >= 60) {
			System.out.println("You passed.");
		}
		
		else {
			System.out.println("You failed.");
		}
		
		return javaGrade;
	}

}
