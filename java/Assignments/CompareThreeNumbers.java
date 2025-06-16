package Assignments;

import java.util.Scanner;

public class CompareThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter first number (x): ");
        int x = scan.nextInt();
        
        System.out.print("Enter second number (y): ");
        int y = scan.nextInt();
        
        System.out.print("Enter third number (z): ");
        int z = scan.nextInt();
       
        if (x == y && y == z) {
            System.out.println("All numbers are equal.");
        } else if (x == y || y == z || x == z) {
            System.out.println("Two numbers are equal.");
        } else {
            System.out.println("All numbers are different.");
        }
    }


}
