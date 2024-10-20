package Valtta;

import java.util.Scanner;
public class Fibonacci {

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public void printfiboSeq(int count) {
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i));
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci fibonacciSequence = new Fibonacci();
        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            fibonacciSequence.printfiboSeq(n);
        }
    }
}
