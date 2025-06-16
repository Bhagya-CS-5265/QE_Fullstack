package Assignments;

import java.util.Scanner;

public class Factorial {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to find its factorial: ");
	        int num = scanner.nextInt();

	        int result = factorial(num);
	        System.out.println("Factorial of " + num + " = " + result);

	       
	    }

	    public static int factorial(int n) {
	        if (n == 0 || n == 1)
	            return 1;
	        else
	            return n * factorial(n - 1);
	    }

}
