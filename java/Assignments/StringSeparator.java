package Assignments;

import java.util.Scanner;

public class StringSeparator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String vowels = "";
        String consonants = ""; 
        String punctuations = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowels += ch;
                } else {
                    consonants += ch;
                }
            } else if ("!@#$%^&*(){}[]:;\"',.?/-_=+<>|\\`~".indexOf(ch) != -1) {
                punctuations += ch;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuations: " + punctuations);

      
    }

}
