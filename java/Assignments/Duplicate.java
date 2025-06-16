package Assignments;

import java.util.*;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}
public class Duplicate {
	 public static void main(String[] args) {
	        // Example list with numbers
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2); // 2 is duplicate

  	        try {
	            checkForDuplicates(numbers);
	            System.out.println("No duplicates found.");
	        } catch (DuplicateNumberException e) {
	            System.out.println("DuplicateNumberException: " + e.getMessage());
	        }
	    }

	    // Method to check for duplicates
	    public static void checkForDuplicates(List<Integer> numbers) throws DuplicateNumberException {
	        Set<Integer> set = new HashSet<>();
	        for (int num : numbers) {
	            if (!set.add(num)) {
	                throw new DuplicateNumberException("Duplicate number found: " + num);
	            }
	        }
	    }
	

}
