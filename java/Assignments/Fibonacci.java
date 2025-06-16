package Assignments;

import java.util.Scanner;

public class Fibonacci {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter position for Fibonacci number: ");
	        int pos = scanner.nextInt();

	        int result = fibonacci(pos);
	        System.out.println("Fibonacci number at position " + pos + " = " + result);

	        
	    }

	    // Recursive method to find Fibonacci number at given position
	    public static int fibonacci(int n) {
	        if (n == 0)
	            return 0;
	        if (n == 1)
	            return 1;
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

}
