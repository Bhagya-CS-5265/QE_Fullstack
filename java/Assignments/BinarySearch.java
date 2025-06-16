package Assignments;

import java.util.Scanner;

public class BinarySearch {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18}; // Sorted array

	        System.out.print("Enter the number to search: ");
	        int target = scanner.nextInt();

	        int result = binarySearch(arr, target);

	        if (result == -1) {
	            System.out.println("Number not found.");
	        } else { 
	            System.out.println("Number found at index: " + result);
	        }

	       
	    }

	    // Binary Search Method
	    public static int binarySearch(int[] arr, int target) {
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == target) {
	                return mid; // Found
	            } else if (arr[mid] < target) {
	                low = mid + 1; // Search right
	            } else {
	                high = mid - 1; // Search left
	            }
	        }
	        return -1; // Not found
	    }

}
