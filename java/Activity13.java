package Activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a comma seperated value:");
		
		
		Object[] inputArr = scan.nextLine().split(",");
		System.out.println("input array is:" + Arrays.toString(inputArr));
		
		
		
		int indexGen= new Random().nextInt(inputArr.length -1);
		System.out.println("random index is"+ indexGen);
		System.out.println("slected value is:" + inputArr[indexGen]);	

	}

}
